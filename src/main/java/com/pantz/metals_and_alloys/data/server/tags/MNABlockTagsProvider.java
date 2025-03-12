package com.pantz.metals_and_alloys.data.server.tags;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.registry.tags.MNABlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;
public class MNABlockTagsProvider extends BlockTagsProvider {
    public MNABlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MetalsAndAlloys.MOD_ID, existingFileHelper);
    }



    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).addTag(Tags.Blocks.CHAINS).addTag(MNABlockTags.METAL_PRESSURE_PLATES).addTag(MNABlockTags.BARS).addTag(MNABlockTags.METAL_GRATES).addTag(MNABlockTags.METAL_DOORS).addTag(MNABlockTags.METAL_TRAPDOORS).addTag(MNABlockTags.METAL_BUTTONS)
                .addTag(MNABlockTags.STORAGE_BLOCKS_RAW_TIN).addTag(MNABlockTags.STORAGE_BLOCKS_TIN).addTag(MNABlockTags.STORAGE_BLOCKS_RAW_BRONZE).addTag(MNABlockTags.STORAGE_BLOCKS_BRONZE).addTag(MNABlockTags.STORAGE_BLOCKS_RAW_MANGANESE).addTag(MNABlockTags.STORAGE_BLOCKS_MANGANESE)
                .addTag(MNABlockTags.ORE_TIN).add(IRON_PLATE_BLOCK.get(), IRON_PLATE_STAIRS.get(), IRON_PLATE_SLAB.get(), CHISELED_GOLD.get(), CUT_TIN.get(), CUT_TIN_STAIRS.get(), CUT_TIN_SLAB.get(),
                        CUT_BRONZE.get(), CUT_TIN_STAIRS.get(), CUT_BRONZE_SLAB.get(), CUT_MANGANESE.get(), CUT_MANGANESE_STAIRS.get(), CUT_MANGANESE_SLAB.get(), STEEL_PLATE_BLOCK.get(), STEEL_PLATE_STAIRS.get(), STEEL_PLATE_SLAB.get());

        tag(BlockTags.NEEDS_STONE_TOOL).addTag(MNABlockTags.ORE_TIN).addTag(MNABlockTags.STORAGE_BLOCKS_RAW_TIN).addTag(MNABlockTags.STORAGE_BLOCKS_TIN).add(IRON_GRATE.get(), IRON_PLATE_BLOCK.get(), IRON_PLATE_STAIRS.get(), IRON_PLATE_SLAB.get(), GOLD_CHAIN.get(),
                COPPER_CHAIN.get(), EXPOSED_COPPER_CHAIN.get(), WEATHERED_COPPER_CHAIN.get(), OXIDIZED_COPPER_CHAIN.get(), WAXED_COPPER_CHAIN.get(), WAXED_EXPOSED_COPPER_CHAIN.get(), WAXED_WEATHERED_COPPER_CHAIN.get(), WAXED_OXIDIZED_COPPER_CHAIN.get(),
                CUT_TIN.get(), CUT_TIN_STAIRS.get(), CUT_TIN_SLAB.get(), TIN_GRATE.get(), CUT_BRONZE.get(), CUT_TIN_STAIRS.get(), CUT_BRONZE_SLAB.get(), BRONZE_GRATE.get(), CUT_MANGANESE.get(), CUT_MANGANESE_STAIRS.get(), CUT_MANGANESE_SLAB.get(), MANGANESE_GRATE.get());

        tag(BlockTags.STAIRS).add(CUT_TIN_STAIRS.get(), CUT_TIN_STAIRS.get(), CUT_MANGANESE_STAIRS.get(), STEEL_PLATE_STAIRS.get());
        tag(BlockTags.SLABS).add(CUT_TIN_SLAB.get(), CUT_BRONZE_SLAB.get(), CUT_MANGANESE_SLAB.get(), STEEL_PLATE_SLAB.get());

        tag(BlockTags.NEEDS_IRON_TOOL).add(CHISELED_GOLD.get(), GOLD_DOOR.get(), GOLD_TRAPDOOR.get(), GOLD_BARS.get(), STEEL_PLATE_BLOCK.get(), STEEL_PLATE_STAIRS.get(), STEEL_PLATE_SLAB.get(), STEEL_GRATE.get(), STEEL_BARS.get());

        tag(Tags.Blocks.CHAINS).add(Blocks.CHAIN, GOLD_CHAIN.get(), COPPER_CHAIN.get(), EXPOSED_COPPER_CHAIN.get(), WEATHERED_COPPER_CHAIN.get(), OXIDIZED_COPPER_CHAIN.get(), WAXED_COPPER_CHAIN.get(), WAXED_EXPOSED_COPPER_CHAIN.get(), WAXED_WEATHERED_COPPER_CHAIN.get(), WAXED_OXIDIZED_COPPER_CHAIN.get(),
                TIN_CHAIN.get(), BRONZE_CHAIN.get(), MANGANESE_CHAIN.get(), STEEL_CHAIN.get());

        tag(MNABlockTags.METAL_PRESSURE_PLATES).add(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE, Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE, COPPER_PRESSURE_PLATE.get(), EXPOSED_COPPER_PRESSURE_PLATE.get(), WEATHERED_COPPER_PRESSURE_PLATE.get(), OXIDIZED_COPPER_PRESSURE_PLATE.get(), WAXED_COPPER_PRESSURE_PLATE.get(), WAXED_EXPOSED_COPPER_PRESSURE_PLATE.get(), WAXED_WEATHERED_COPPER_PRESSURE_PLATE.get(), WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.get(),
                TIN_PRESSURE_PLATE.get(), BRONZE_PRESSURE_PLATE.get(), MANGANESE_PRESSURE_PLATE.get(), STEEL_PRESSURE_PLATE.get());

        tag(MNABlockTags.BARS).add(Blocks.IRON_BARS, GOLD_BARS.get(), COPPER_BARS.get(), EXPOSED_COPPER_BARS.get(), WEATHERED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get(), WAXED_COPPER_BARS.get(), WAXED_EXPOSED_COPPER_BARS.get(), WAXED_WEATHERED_COPPER_BARS.get(), WAXED_OXIDIZED_COPPER_BARS.get(),
                TIN_BARS.get(), BRONZE_BARS.get(), MANGANESE_BARS.get(), STEEL_BARS.get());

        tag(MNABlockTags.METAL_BUTTONS).add(IRON_BUTTON.get(), GOLD_BUTTON.get(), COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get(), WAXED_COPPER_BUTTON.get(), WAXED_EXPOSED_COPPER_BUTTON.get(), WAXED_WEATHERED_COPPER_BUTTON.get(), WAXED_OXIDIZED_COPPER_BUTTON.get(), TIN_BUTTON.get(),
                BRONZE_BUTTON.get(), MANGANESE_BUTTON.get(), STEEL_BUTTON.get());

        tag(MNABlockTags.METAL_DOORS).add(Blocks.IRON_DOOR, GOLD_DOOR.get(), TIN_DOOR.get(), BRONZE_DOOR.get(), MANGANESE_DOOR.get(), STEEL_DOOR.get());

        tag(MNABlockTags.METAL_TRAPDOORS).add(Blocks.IRON_TRAPDOOR, GOLD_TRAPDOOR.get(), TIN_TRAPDOOR.get(), BRONZE_TRAPDOOR.get(), MANGANESE_TRAPDOOR.get(), STEEL_TRAPDOOR.get());

        tag(MNABlockTags.METAL_GRATES).add(Blocks.COPPER_GRATE, Blocks.EXPOSED_COPPER_GRATE, Blocks.WEATHERED_COPPER_GRATE, Blocks.OXIDIZED_COPPER_GRATE, Blocks.WAXED_COPPER_GRATE, Blocks.WAXED_EXPOSED_COPPER_GRATE, Blocks.WAXED_WEATHERED_COPPER_GRATE, Blocks.WAXED_OXIDIZED_COPPER_GRATE,
                IRON_GRATE.get(), TIN_GRATE.get(), BRONZE_GRATE.get(), MANGANESE_GRATE.get(), STEEL_GRATE.get());

        tag(BlockTags.BUTTONS).addTag(MNABlockTags.METAL_BUTTONS);
        tag(BlockTags.TRAPDOORS).addTag(MNABlockTags.METAL_TRAPDOORS);
        tag(BlockTags.DOORS).addTag(MNABlockTags.METAL_DOORS);
        tag(BlockTags.PRESSURE_PLATES).addTag(MNABlockTags.METAL_PRESSURE_PLATES);

        tag(BlockTags.DRAGON_IMMUNE).addTag(MNABlockTags.BARS);
        tag(BlockTags.BEACON_BASE_BLOCKS).add(PIG_IRON_BLOCK.get(), STEEL_BLOCK.get(), BRONZE_BLOCK.get());
        tag(Tags.Blocks.ORE_RATES_DENSE).add(TIN_ORE.get(), DEEPSLATE_TIN_ORE.get(), MANGANESE_ORE.get(), DEEPSLATE_MANGANESE_ORE.get());
        tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE).add(DEEPSLATE_TIN_ORE.get(), DEEPSLATE_MANGANESE_ORE.get());
        tag(Tags.Blocks.ORES_IN_GROUND_STONE).add(TIN_ORE.get(), MANGANESE_ORE.get());
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(MNABlockTags.STORAGE_BLOCKS_TIN).addTag(MNABlockTags.STORAGE_BLOCKS_RAW_TIN)
                .addTag(MNABlockTags.STORAGE_BLOCKS_RAW_BRONZE).addTag(MNABlockTags.STORAGE_BLOCKS_BRONZE)
                .addTag(MNABlockTags.STORAGE_BLOCKS_RAW_MANGANESE).addTag(MNABlockTags.STORAGE_BLOCKS_MANGANESE)
                .addTag(MNABlockTags.STORAGE_BLOCKS_STEEL).addTag(MNABlockTags.STORAGE_BLOCKS_PIG_IRON);
        tag(MNABlockTags.ORE_TIN).add(TIN_ORE.get(), DEEPSLATE_TIN_ORE.get());
        tag(MNABlockTags.ORE_MANGANESE).add(MANGANESE_ORE.get(), DEEPSLATE_MANGANESE_ORE.get());
        tag(Tags.Blocks.ORES).addTag(MNABlockTags.ORE_TIN).addTag(MNABlockTags.ORE_MANGANESE);
        tag(MNABlockTags.STORAGE_BLOCKS_TIN).add(TIN_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_RAW_TIN).add(RAW_TIN_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_BRONZE).add(BRONZE_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_RAW_BRONZE).add(RAW_BRONZE_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_MANGANESE).add(MANGANESE_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_RAW_MANGANESE).add(RAW_MANGANESE_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_PIG_IRON).add(PIG_IRON_BLOCK.get());
        tag(MNABlockTags.STORAGE_BLOCKS_STEEL).add(STEEL_BLOCK.get());

    }
}
