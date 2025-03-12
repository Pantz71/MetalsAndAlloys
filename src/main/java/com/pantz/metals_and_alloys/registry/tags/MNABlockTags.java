package com.pantz.metals_and_alloys.registry.tags;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class MNABlockTags {
    public static final TagKey<Block> METAL_PRESSURE_PLATES = tagKey("metal_pressure_plates");
    public static final TagKey<Block> METAL_BUTTONS = tagKey("metal_buttons");
    public static final TagKey<Block> METAL_DOORS = tagKey("metal_doors");
    public static final TagKey<Block> METAL_TRAPDOORS = tagKey("metal_trapdoors");
    public static final TagKey<Block> METAL_GRATES = tagKey("metal_grates");
    public static final TagKey<Block> BARS = tagKey("bars");
    public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = tagKey("incorrect_for_copper_tools");
    public static final TagKey<Block> STORAGE_BLOCKS_TIN = tagKey("storage_blocks/tin");
    public static final TagKey<Block> STORAGE_BLOCKS_RAW_TIN = tagKey("storage_blocks/raw_tin");
    public static final TagKey<Block> STORAGE_BLOCKS_BRONZE = tagKey("storage_blocks/bronze");
    public static final TagKey<Block> STORAGE_BLOCKS_RAW_BRONZE = tagKey("storage_blocks/raw_bronze");
    public static final TagKey<Block> STORAGE_BLOCKS_MANGANESE = tagKey("storage_blocks/manganese");
    public static final TagKey<Block> STORAGE_BLOCKS_RAW_MANGANESE = tagKey("storage_blocks/raw_manganese");
    public static final TagKey<Block> STORAGE_BLOCKS_PIG_IRON = tagKey("storage_blocks/pig_iron");
    public static final TagKey<Block> STORAGE_BLOCKS_STEEL = tagKey("storage_blocks/steel");


    public static final TagKey<Block> ORE_TIN = tagKey("ore_tin");
    public static final TagKey<Block> ORE_MANGANESE = tagKey("ore_manganese");

    public static TagKey<Block> create(String name) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name));
    }

    private static TagKey<Block> tagKey(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }
}
