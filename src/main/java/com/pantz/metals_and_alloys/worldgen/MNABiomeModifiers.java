package com.pantz.metals_and_alloys.worldgen;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class MNABiomeModifiers {
    public static final ResourceKey<BiomeModifier> TIN_ORE = key("tin_ore");
    public static final ResourceKey<BiomeModifier> TIN_ORE_LARGE = key("tin_ore_large");
    public static final ResourceKey<BiomeModifier> TIN_ORE_EXTRA = key("tin_ore_extra");
    public static final ResourceKey<BiomeModifier> MANGANESE_ORE = key("manganese_ore");
    public static final ResourceKey<BiomeModifier> MANGANESE_ORE_LARGE = key("manganese_ore_large");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);
        var overworld = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        Holder<PlacedFeature> tinOre = placedFeatures.getOrThrow(MNAPlacedFeatures.ORE_TIN);
        Holder<PlacedFeature> tinExtra = placedFeatures.getOrThrow(MNAPlacedFeatures.ORE_TIN_EXTRA);
        Holder<PlacedFeature> tinLarge = placedFeatures.getOrThrow(MNAPlacedFeatures.ORE_TIN_LARGE);
        Holder<PlacedFeature> manganeseOre = placedFeatures.getOrThrow(MNAPlacedFeatures.ORE_MANGANESE);
        Holder<PlacedFeature> manganeseLarge = placedFeatures.getOrThrow(MNAPlacedFeatures.ORE_MANGANESE_LARGE);

        context.register(TIN_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(overworld, HolderSet.direct(tinOre), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(TIN_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(overworld, HolderSet.direct(tinLarge), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(TIN_ORE_EXTRA, new BiomeModifiers.AddFeaturesBiomeModifier(overworld, HolderSet.direct(tinExtra), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(MANGANESE_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(overworld, HolderSet.direct(manganeseOre), GenerationStep.Decoration.UNDERGROUND_ORES));
        context.register(MANGANESE_ORE_LARGE, new BiomeModifiers.AddFeaturesBiomeModifier(overworld, HolderSet.direct(manganeseLarge), GenerationStep.Decoration.UNDERGROUND_ORES));


    }

    public static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name));
    }
}
