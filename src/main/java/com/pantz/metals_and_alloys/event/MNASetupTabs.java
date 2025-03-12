package com.pantz.metals_and_alloys.event;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;
import static com.pantz.metals_and_alloys.registry.MNAItems.*;
import static net.minecraft.world.level.block.Blocks.*;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MNASetupTabs {

    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        final ResourceKey<CreativeModeTab> tab = event.getTabKey();

        if (tab == CreativeModeTabs.BUILDING_BLOCKS) {
            event.insertAfter(IRON_BLOCK.asItem().getDefaultInstance(), IRON_GRATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(IRON_GRATE.asItem().getDefaultInstance(), IRON_PLATE_BLOCK.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(IRON_PLATE_BLOCK.asItem().getDefaultInstance(), IRON_PLATE_STAIRS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(IRON_PLATE_STAIRS.asItem().getDefaultInstance(), IRON_PLATE_SLAB.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(HEAVY_WEIGHTED_PRESSURE_PLATE.asItem().getDefaultInstance(), IRON_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(GOLD_BLOCK.asItem().getDefaultInstance(), CHISELED_GOLD.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(CHISELED_GOLD.asItem().getDefaultInstance(), GOLD_GRATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(GOLD_GRATE.asItem().getDefaultInstance(), GOLD_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(GOLD_BARS.asItem().getDefaultInstance(), GOLD_DOOR.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(GOLD_DOOR.asItem().getDefaultInstance(), GOLD_TRAPDOOR.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(LIGHT_WEIGHTED_PRESSURE_PLATE.asItem().getDefaultInstance(), GOLD_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(GOLD_BUTTON.asItem().getDefaultInstance(), GOLD_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(COPPER_TRAPDOOR.asItem().getDefaultInstance(), COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(EXPOSED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), EXPOSED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WEATHERED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), WEATHERED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(OXIDIZED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), OXIDIZED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(WAXED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), WAXED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_EXPOSED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), WAXED_EXPOSED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_WEATHERED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), WAXED_WEATHERED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_OXIDIZED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(EXPOSED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), EXPOSED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WEATHERED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), WEATHERED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(OXIDIZED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), OXIDIZED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(WAXED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), WAXED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_EXPOSED_COPPER_TRAPDOOR.asItem().getDefaultInstance(), WAXED_EXPOSED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_WEATHERED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), WAXED_WEATHERED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.asItem().getDefaultInstance(), WAXED_OXIDIZED_COPPER_BUTTON.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(CUT_COPPER_SLAB.asItem().getDefaultInstance(), COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(EXPOSED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), EXPOSED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WEATHERED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), WEATHERED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(OXIDIZED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), OXIDIZED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(WAXED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), WAXED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_EXPOSED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), WAXED_EXPOSED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_WEATHERED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), WAXED_WEATHERED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_OXIDIZED_CUT_COPPER_SLAB.asItem().getDefaultInstance(), WAXED_OXIDIZED_COPPER_BARS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(COPPER_BUTTON.asItem().getDefaultInstance(), COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(EXPOSED_COPPER_BUTTON.asItem().getDefaultInstance(), EXPOSED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WEATHERED_COPPER_BUTTON.asItem().getDefaultInstance(), WEATHERED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(OXIDIZED_COPPER_BUTTON.asItem().getDefaultInstance(), OXIDIZED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(WAXED_COPPER_BUTTON.asItem().getDefaultInstance(), WAXED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_EXPOSED_COPPER_BUTTON.asItem().getDefaultInstance(), WAXED_EXPOSED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_WEATHERED_COPPER_BUTTON.asItem().getDefaultInstance(), WAXED_WEATHERED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(WAXED_OXIDIZED_COPPER_BUTTON.asItem().getDefaultInstance(), WAXED_OXIDIZED_COPPER_CHAIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.accept(TIN_BLOCK);
            event.accept(TIN_GRATE);
            event.accept(CUT_TIN);
            event.accept(CUT_TIN_STAIRS);
            event.accept(CUT_TIN_SLAB);
            event.accept(TIN_BARS);
            event.accept(TIN_DOOR);
            event.accept(TIN_TRAPDOOR);
            event.accept(TIN_PRESSURE_PLATE);
            event.accept(TIN_BUTTON);
            event.accept(TIN_CHAIN);

            event.accept(BRONZE_BLOCK);
            event.accept(BRONZE_GRATE);
            event.accept(CUT_BRONZE);
            event.accept(CUT_BRONZE_STAIRS);
            event.accept(CUT_BRONZE_SLAB);
            event.accept(BRONZE_BARS);
            event.accept(BRONZE_DOOR);
            event.accept(BRONZE_TRAPDOOR);
            event.accept(BRONZE_PRESSURE_PLATE);
            event.accept(BRONZE_BUTTON);
            event.accept(BRONZE_CHAIN);

            event.accept(MANGANESE_BLOCK);
            event.accept(MANGANESE_GRATE);
            event.accept(CUT_MANGANESE);
            event.accept(CUT_MANGANESE_STAIRS);
            event.accept(CUT_MANGANESE_SLAB);
            event.accept(MANGANESE_BARS);
            event.accept(MANGANESE_DOOR);
            event.accept(MANGANESE_TRAPDOOR);
            event.accept(MANGANESE_PRESSURE_PLATE);
            event.accept(MANGANESE_BUTTON);
            event.accept(MANGANESE_CHAIN);

            event.accept(PIG_IRON_BLOCK);
            event.accept(STEEL_BLOCK);
            event.accept(STEEL_GRATE);
            event.accept(STEEL_PLATE_BLOCK);
            event.accept(STEEL_PLATE_STAIRS);
            event.accept(STEEL_PLATE_SLAB);
            event.accept(STEEL_BARS);
            event.accept(STEEL_DOOR);
            event.accept(STEEL_TRAPDOOR);
            event.accept(STEEL_PRESSURE_PLATE);
            event.accept(STEEL_BUTTON);
            event.accept(STEEL_CHAIN);

        }

        if (tab == CreativeModeTabs.NATURAL_BLOCKS) {
            event.insertAfter(DEEPSLATE_COPPER_ORE.asItem().getDefaultInstance(), TIN_ORE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(TIN_ORE.asItem().getDefaultInstance(), DEEPSLATE_TIN_ORE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(DEEPSLATE_TIN_ORE.asItem().getDefaultInstance(), MANGANESE_ORE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(MANGANESE_ORE.asItem().getDefaultInstance(), DEEPSLATE_MANGANESE_ORE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(RAW_COPPER_BLOCK.asItem().getDefaultInstance(), RAW_TIN_BLOCK.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(RAW_GOLD_BLOCK.asItem().getDefaultInstance(), RAW_BRONZE_BLOCK.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(RAW_TIN_BLOCK.asItem().getDefaultInstance(), RAW_MANGANESE_BLOCK.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }

        if (tab == CreativeModeTabs.INGREDIENTS) {
            event.insertAfter(Items.NETHERITE_INGOT.getDefaultInstance(), IRON_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(IRON_PLATE.asItem().getDefaultInstance(), STEEL_PLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.IRON_NUGGET.getDefaultInstance(), COPPER_NUGGET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_NUGGET.asItem().getDefaultInstance(), TIN_NUGGET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(TIN_NUGGET.asItem().getDefaultInstance(), MANGANESE_NUGGET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.GOLD_NUGGET.getDefaultInstance(), BRONZE_NUGGET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_NUGGET.asItem().getDefaultInstance(), STEEL_NUGGET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.RAW_COPPER.getDefaultInstance(), RAW_TIN.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(RAW_TIN.asItem().getDefaultInstance(), RAW_MANGANESE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.RAW_GOLD.getDefaultInstance(), RAW_BRONZE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.COPPER_INGOT.getDefaultInstance(), TIN_INGOT.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(TIN_INGOT.asItem().getDefaultInstance(), MANGANESE_INGOT.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.GOLD_INGOT.getDefaultInstance(), BRONZE_INGOT.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_INGOT.asItem().getDefaultInstance(), PIG_IRON_INGOT.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(PIG_IRON_INGOT.asItem().getDefaultInstance(), STEEL_INGOT.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }

        if (tab == CreativeModeTabs.COMBAT) {
            event.insertAfter(Items.STONE_SWORD.getDefaultInstance(), COPPER_SWORD.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.STONE_AXE.getDefaultInstance(), COPPER_AXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.CHAINMAIL_BOOTS.getDefaultInstance(), COPPER_HELMET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_HELMET.asItem().getDefaultInstance(), COPPER_CHESTPLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_CHESTPLATE.asItem().getDefaultInstance(), COPPER_LEGGINGS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_LEGGINGS.asItem().getDefaultInstance(), COPPER_BOOTS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.LEATHER_HORSE_ARMOR.asItem().getDefaultInstance(), COPPER_HORSE_ARMOR.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_HORSE_ARMOR.asItem().getDefaultInstance(), BRONZE_HORSE_ARMOR.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_HORSE_ARMOR.asItem().getDefaultInstance(), STEEL_HORSE_ARMOR.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.NETHERITE_BOOTS.getDefaultInstance(), BRONZE_HELMET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_HELMET.asItem().getDefaultInstance(), BRONZE_CHESTPLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_CHESTPLATE.asItem().getDefaultInstance(), BRONZE_LEGGINGS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_LEGGINGS.asItem().getDefaultInstance(), BRONZE_BOOTS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.NETHERITE_SWORD.getDefaultInstance(), BRONZE_SWORD.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(Items.NETHERITE_AXE.getDefaultInstance(), BRONZE_AXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(BRONZE_BOOTS.asItem().getDefaultInstance(), STEEL_HELMET.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(STEEL_HELMET.asItem().getDefaultInstance(), STEEL_CHESTPLATE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(STEEL_CHESTPLATE.asItem().getDefaultInstance(), STEEL_LEGGINGS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(STEEL_LEGGINGS.asItem().getDefaultInstance(), STEEL_BOOTS.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_SWORD.asItem().getDefaultInstance(), STEEL_SWORD.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_AXE.asItem().getDefaultInstance(), STEEL_AXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);


        }

        if (tab == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.insertAfter(Items.STONE_HOE.getDefaultInstance(), COPPER_SHOVEL.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_SHOVEL.asItem().getDefaultInstance(), COPPER_PICKAXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_PICKAXE.asItem().getDefaultInstance(), COPPER_AXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(COPPER_AXE.asItem().getDefaultInstance(), COPPER_HOE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(Items.NETHERITE_HOE.getDefaultInstance(), BRONZE_SHOVEL.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_SHOVEL.asItem().getDefaultInstance(), BRONZE_PICKAXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_PICKAXE.asItem().getDefaultInstance(), BRONZE_AXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(BRONZE_AXE.asItem().getDefaultInstance(), BRONZE_HOE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

            event.insertAfter(BRONZE_HOE.asItem().getDefaultInstance(), STEEL_SHOVEL.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(STEEL_SHOVEL.asItem().getDefaultInstance(), STEEL_PICKAXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(STEEL_PICKAXE.asItem().getDefaultInstance(), STEEL_AXE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.insertAfter(STEEL_AXE.asItem().getDefaultInstance(), STEEL_HOE.asItem().getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);

        }
    }
}
