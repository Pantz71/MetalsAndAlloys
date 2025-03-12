package com.pantz.metals_and_alloys.data.client;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.util.LangUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.List;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;
import static com.pantz.metals_and_alloys.registry.MNAItems.*;

public class MNALanguageProvider extends LanguageProvider {
    public MNALanguageProvider(PackOutput output) {
        super(output, MetalsAndAlloys.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        /* ITEM */
        add(IRON_PLATE.get(), COPPER_NUGGET.get());
        add(COPPER_SWORD.get(), COPPER_SHOVEL.get(), COPPER_PICKAXE.get(), COPPER_AXE.get(), COPPER_HOE.get(), COPPER_HELMET.get(), COPPER_CHESTPLATE.get(), COPPER_LEGGINGS.get(), COPPER_BOOTS.get(), COPPER_HORSE_ARMOR.get());
        add(BRONZE_SWORD.get(), BRONZE_SHOVEL.get(), BRONZE_PICKAXE.get(), BRONZE_AXE.get(), BRONZE_HOE.get(), BRONZE_HELMET.get(), BRONZE_CHESTPLATE.get(), BRONZE_LEGGINGS.get(), BRONZE_BOOTS.get(), BRONZE_HORSE_ARMOR.get());
        add(STEEL_SWORD.get(), STEEL_SHOVEL.get(), STEEL_PICKAXE.get(), STEEL_AXE.get(), STEEL_HOE.get(), STEEL_HELMET.get(), STEEL_CHESTPLATE.get(), STEEL_LEGGINGS.get(), STEEL_BOOTS.get(), STEEL_HORSE_ARMOR.get());

        add(RAW_TIN.get(), TIN_INGOT.get(), TIN_NUGGET.get());
        add(RAW_BRONZE.get(), BRONZE_INGOT.get(), BRONZE_NUGGET.get());
        add(RAW_MANGANESE.get(), MANGANESE_INGOT.get(), MANGANESE_NUGGET.get());
        add(PIG_IRON_INGOT.get(), STEEL_INGOT.get(), STEEL_NUGGET.get(), STEEL_PLATE.get());

        /* BLOCK */
        add(IRON_GRATE.get(), IRON_PLATE_BLOCK.get(), IRON_PLATE_STAIRS.get(), IRON_PLATE_SLAB.get(), IRON_BUTTON.get());

        add(CHISELED_GOLD.get(), GOLD_GRATE.get(), GOLD_DOOR.get(), GOLD_TRAPDOOR.get(), GOLD_BUTTON.get(), GOLD_BARS.get(), GOLD_CHAIN.get());

        add(COPPER_CHAIN.get(), EXPOSED_COPPER_CHAIN.get(), WEATHERED_COPPER_CHAIN.get(), OXIDIZED_COPPER_CHAIN.get(), WAXED_COPPER_CHAIN.get(), WAXED_EXPOSED_COPPER_CHAIN.get(), WAXED_WEATHERED_COPPER_CHAIN.get(), WAXED_OXIDIZED_COPPER_CHAIN.get());
        add(COPPER_PRESSURE_PLATE.get(), EXPOSED_COPPER_PRESSURE_PLATE.get(), WEATHERED_COPPER_PRESSURE_PLATE.get(), OXIDIZED_COPPER_PRESSURE_PLATE.get(), WAXED_COPPER_PRESSURE_PLATE.get(), WAXED_EXPOSED_COPPER_PRESSURE_PLATE.get(), WAXED_WEATHERED_COPPER_PRESSURE_PLATE.get(), WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.get());
        add(COPPER_BARS.get(), EXPOSED_COPPER_BARS.get(), WEATHERED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get(), WAXED_COPPER_BARS.get(), WAXED_EXPOSED_COPPER_BARS.get(), WAXED_WEATHERED_COPPER_BARS.get(), WAXED_OXIDIZED_COPPER_BARS.get());
        add(COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get(), WAXED_COPPER_BUTTON.get(), WAXED_EXPOSED_COPPER_BUTTON.get(), WAXED_WEATHERED_COPPER_BUTTON.get(), WAXED_OXIDIZED_COPPER_BUTTON.get());

        add(TIN_ORE.get(), DEEPSLATE_TIN_ORE.get(), CUT_TIN.get(), CUT_TIN_STAIRS.get(), CUT_TIN_SLAB.get());
        add(TIN_DOOR.get(), TIN_TRAPDOOR.get(), TIN_BUTTON.get(), TIN_PRESSURE_PLATE.get(), TIN_BARS.get(), TIN_CHAIN.get(), TIN_GRATE.get());
        addStorageBlock(TIN_BLOCK.get(), RAW_TIN_BLOCK.get());

        add(CUT_BRONZE.get(), CUT_BRONZE_STAIRS.get(), CUT_BRONZE_SLAB.get());
        add(BRONZE_DOOR.get(), BRONZE_TRAPDOOR.get(), BRONZE_BUTTON.get(), BRONZE_PRESSURE_PLATE.get(), BRONZE_BARS.get(), BRONZE_CHAIN.get(), BRONZE_GRATE.get());
        addStorageBlock(BRONZE_BLOCK.get(), RAW_BRONZE_BLOCK.get());

        add(MANGANESE_ORE.get(), DEEPSLATE_MANGANESE_ORE.get(), CUT_MANGANESE.get(), CUT_MANGANESE_STAIRS.get(), CUT_MANGANESE_SLAB.get());
        add(MANGANESE_DOOR.get(), MANGANESE_TRAPDOOR.get(), MANGANESE_BUTTON.get(), MANGANESE_PRESSURE_PLATE.get(), MANGANESE_BARS.get(), MANGANESE_CHAIN.get(), MANGANESE_GRATE.get());
        addStorageBlock(MANGANESE_BLOCK.get(), RAW_MANGANESE_BLOCK.get());

        add(STEEL_PLATE_BLOCK.get(), STEEL_PLATE_STAIRS.get(), STEEL_PLATE_SLAB.get());
        add(STEEL_DOOR.get(), STEEL_TRAPDOOR.get(), STEEL_BUTTON.get(), STEEL_PRESSURE_PLATE.get(), STEEL_BARS.get(), STEEL_CHAIN.get(), STEEL_GRATE.get());
        addStorageBlock(STEEL_BLOCK.get(), PIG_IRON_BLOCK.get());

        /* MISC */

        add("trim_material.metals_and_alloys.bronze", "Bronze Material");
        add("trim_material.metals_and_alloys.tin", "Tin Material");
        add("trim_material.metals_and_alloys.manganese", "Manganese Material");
        add("trim_material.metals_and_alloys.steel", "Steel Material");
        add("trim_material.metals_and_alloys.pig_iron", "Pig Iron Material");

    }

    private void add(Block... blocks) {
        List.of(blocks).forEach(block -> this.add(block, format(BuiltInRegistries.BLOCK.getKey(block))));
    }


    private void add(Item... items) {
        List.of(items).forEach(item -> this.add(item, format(BuiltInRegistries.ITEM.getKey(item))));
    }

    private void addStorageBlock(Block... blocks) {
        List.of(blocks).forEach(block -> this.add(block, "Block of " + format(BuiltInRegistries.BLOCK.getKey(block)).replace(" Block", "")));
    }

    private String format(ResourceLocation registryName) {
        return LangUtils.capitalizeFully(registryName.getPath().replace("_", " "));
    }


}
