package com.pantz.metals_and_alloys.worldgen;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class MNAPlacedFeatures {

    public static final ResourceKey<PlacedFeature> ORE_TIN = key("ore_tin");
    public static final ResourceKey<PlacedFeature> ORE_TIN_LARGE = key("ore_tin_large");
    public static final ResourceKey<PlacedFeature> ORE_TIN_EXTRA = key("ore_tin_extra");
    public static final ResourceKey<PlacedFeature> ORE_MANGANESE = key("ore_manganese");
    public static final ResourceKey<PlacedFeature> ORE_MANGANESE_LARGE = key("ore_manganese_large");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configFeatures = context.lookup(Registries.CONFIGURED_FEATURE);


        Holder<ConfiguredFeature<?, ?>> tinOreLarge = configFeatures.getOrThrow(MNAConfiguredFeatures.ORE_TIN_LARGE);
        Holder<ConfiguredFeature<?, ?>> tinOreSmall = configFeatures.getOrThrow(MNAConfiguredFeatures.ORE_TIN_SMALL);
        Holder<ConfiguredFeature<?, ?>> manganeseOreSmall = configFeatures.getOrThrow(MNAConfiguredFeatures.ORE_MANGANESE_SMALL);
        Holder<ConfiguredFeature<?, ?>> manganeseOreLarge = configFeatures.getOrThrow(MNAConfiguredFeatures.ORE_MANGANESE_LARGE);

        register(context, ORE_TIN, tinOreSmall, commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(104))));
        register(context, ORE_TIN_LARGE, tinOreLarge, commonOrePlacement(10, HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(104))));
        register(context, ORE_TIN_EXTRA, tinOreLarge, commonOrePlacement(3, HeightRangePlacement.triangle(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(104))));
        register(context, ORE_MANGANESE, manganeseOreSmall, commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.absolute(-55), VerticalAnchor.absolute(100))));
        register(context, ORE_MANGANESE_LARGE, manganeseOreLarge, commonOrePlacement(9, HeightRangePlacement.triangle(VerticalAnchor.absolute(-55), VerticalAnchor.absolute(100))));

    }

    private static List<PlacementModifier> orePlacement(PlacementModifier countPlacement, PlacementModifier heightRange) {
        return List.of(countPlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    private static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightRange);
    }

    public static ResourceKey<PlacedFeature> key(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> config, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }
}
