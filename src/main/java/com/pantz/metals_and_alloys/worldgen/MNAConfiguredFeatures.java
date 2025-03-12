package com.pantz.metals_and_alloys.worldgen;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.registry.MNABlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class MNAConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN_SMALL = key("ore_tin_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_TIN_LARGE = key("ore_tin_large");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_MANGANESE_SMALL = key("ore_manganese_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_MANGANESE_LARGE = key("ore_manganese_large");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplace = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplace = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> tinList = List.of(
                OreConfiguration.target(stoneReplace, MNABlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplace, MNABlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())
        );

        List<OreConfiguration.TargetBlockState> manganeseList = List.of(
                OreConfiguration.target(stoneReplace, MNABlocks.MANGANESE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplace, MNABlocks.DEEPSLATE_MANGANESE_ORE.get().defaultBlockState())
        );

        register(context, ORE_TIN_SMALL, Feature.ORE, new OreConfiguration(tinList, 7));
        register(context, ORE_TIN_LARGE, Feature.ORE, new OreConfiguration(tinList, 14));
        register(context, ORE_MANGANESE_SMALL, Feature.ORE, new OreConfiguration(manganeseList, 4));
        register(context, ORE_MANGANESE_LARGE, Feature.ORE, new OreConfiguration(manganeseList, 10));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?,?>> key, F feature, FC config) {
        context.register(key ,new ConfiguredFeature<>(feature, config));
    }
}
