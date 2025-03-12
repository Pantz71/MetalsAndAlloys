package com.pantz.metals_and_alloys.data.server.loot;

import com.pantz.metals_and_alloys.registry.MNABlocks;
import com.pantz.metals_and_alloys.registry.MNAItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;
import static net.minecraft.world.level.block.Blocks.*;

public class MNABlockLootTableProvider extends BlockLootSubProvider {
    private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(DRAGON_EGG, BEACON, CONDUIT, SKELETON_SKULL, WITHER_SKELETON_SKULL, PLAYER_HEAD, ZOMBIE_HEAD, CREEPER_HEAD, DRAGON_HEAD, PIGLIN_HEAD, SHULKER_BOX, BLACK_SHULKER_BOX, BLUE_SHULKER_BOX, BROWN_SHULKER_BOX, CYAN_SHULKER_BOX, GRAY_SHULKER_BOX, GREEN_SHULKER_BOX, LIGHT_BLUE_SHULKER_BOX, LIGHT_GRAY_SHULKER_BOX, LIME_SHULKER_BOX, MAGENTA_SHULKER_BOX, ORANGE_SHULKER_BOX, PINK_SHULKER_BOX, PURPLE_SHULKER_BOX, RED_SHULKER_BOX, WHITE_SHULKER_BOX, YELLOW_SHULKER_BOX).map(ItemLike::asItem).collect(Collectors.toSet());

    public MNABlockLootTableProvider(HolderLookup.Provider registries) {
        super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(IRON_GRATE.get());
        dropSelf(IRON_PLATE_BLOCK.get());
        dropSelf(IRON_PLATE_STAIRS.get());
        add(IRON_PLATE_SLAB.get(), createSlabItemTable(IRON_PLATE_SLAB.get()));

        dropSelf(CHISELED_GOLD.get());
        dropSelf(GOLD_GRATE.get());
        dropSelf(IRON_BUTTON.get());

        dropSelf(GOLD_BUTTON.get());
        dropSelf(GOLD_TRAPDOOR.get());
        dropSelf(GOLD_BARS.get());
        dropSelf(GOLD_CHAIN.get());
        add(GOLD_DOOR.get(), createDoorTable(GOLD_DOOR.get()));

        copperDrops(COPPER_CHAIN.get(), EXPOSED_COPPER_CHAIN.get(), WEATHERED_COPPER_CHAIN.get(), OXIDIZED_COPPER_CHAIN.get(), WAXED_COPPER_CHAIN.get(), WAXED_EXPOSED_COPPER_CHAIN.get(), WAXED_WEATHERED_COPPER_CHAIN.get(), WAXED_OXIDIZED_COPPER_CHAIN.get());
        copperDrops(COPPER_PRESSURE_PLATE.get(), EXPOSED_COPPER_PRESSURE_PLATE.get(), WEATHERED_COPPER_PRESSURE_PLATE.get(), OXIDIZED_COPPER_PRESSURE_PLATE.get(), WAXED_COPPER_PRESSURE_PLATE.get(), WAXED_EXPOSED_COPPER_PRESSURE_PLATE.get(), WAXED_WEATHERED_COPPER_PRESSURE_PLATE.get(), WAXED_OXIDIZED_COPPER_PRESSURE_PLATE.get());
        copperDrops(COPPER_BARS.get(), EXPOSED_COPPER_BARS.get(), WEATHERED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get(), WAXED_COPPER_BARS.get(), WAXED_EXPOSED_COPPER_BARS.get(), WAXED_WEATHERED_COPPER_BARS.get(), WAXED_OXIDIZED_COPPER_BARS.get());
        copperDrops(COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get(), WAXED_COPPER_BUTTON.get(), WAXED_EXPOSED_COPPER_BUTTON.get(), WAXED_WEATHERED_COPPER_BUTTON.get(), WAXED_OXIDIZED_COPPER_BUTTON.get());

        add(TIN_ORE.get(), createOreDrop(TIN_ORE.get(), MNAItems.RAW_TIN.asItem()));
        add(DEEPSLATE_TIN_ORE.get(), createOreDrop(DEEPSLATE_TIN_ORE.get(), MNAItems.RAW_TIN.asItem()));
        dropSelf(RAW_TIN_BLOCK.get());
        dropSelf(TIN_BLOCK.get());
        dropSelf(CUT_TIN.get());
        dropSelf(CUT_TIN_STAIRS.get());
        add(CUT_TIN_SLAB.get(), createSlabItemTable(CUT_TIN_SLAB.get()));

        add(TIN_DOOR.get(), createDoorTable(TIN_DOOR.get()));
        dropSelf(TIN_TRAPDOOR.get());
        dropSelf(TIN_CHAIN.get());
        dropSelf(TIN_BARS.get());
        dropSelf(TIN_BUTTON.get());
        dropSelf(TIN_PRESSURE_PLATE.get());
        dropSelf(TIN_GRATE.get());

        dropSelf(RAW_BRONZE_BLOCK.get());
        dropSelf(BRONZE_BLOCK.get());
        dropSelf(CUT_BRONZE.get());
        dropSelf(CUT_BRONZE_STAIRS.get());
        add(CUT_BRONZE_SLAB.get(), createSlabItemTable(CUT_BRONZE_SLAB.get()));

        add(BRONZE_DOOR.get(), createDoorTable(BRONZE_DOOR.get()));
        dropSelf(BRONZE_TRAPDOOR.get());
        dropSelf(BRONZE_CHAIN.get());
        dropSelf(BRONZE_BARS.get());
        dropSelf(BRONZE_BUTTON.get());
        dropSelf(BRONZE_PRESSURE_PLATE.get());
        dropSelf(BRONZE_GRATE.get());

        add(MANGANESE_ORE.get(), createOreDrop(MANGANESE_ORE.get(), MNAItems.RAW_MANGANESE.asItem()));
        add(DEEPSLATE_MANGANESE_ORE.get(), createOreDrop(DEEPSLATE_MANGANESE_ORE.get(), MNAItems.RAW_MANGANESE.asItem()));
        dropSelf(RAW_MANGANESE_BLOCK.get());
        dropSelf(MANGANESE_BLOCK.get());
        dropSelf(CUT_MANGANESE.get());
        dropSelf(CUT_MANGANESE_STAIRS.get());
        add(CUT_MANGANESE_SLAB.get(), createSlabItemTable(CUT_MANGANESE_SLAB.get()));

        add(MANGANESE_DOOR.get(), createDoorTable(MANGANESE_DOOR.get()));
        dropSelf(MANGANESE_TRAPDOOR.get());
        dropSelf(MANGANESE_CHAIN.get());
        dropSelf(MANGANESE_BARS.get());
        dropSelf(MANGANESE_BUTTON.get());
        dropSelf(MANGANESE_PRESSURE_PLATE.get());
        dropSelf(MANGANESE_GRATE.get());

        dropSelf(PIG_IRON_BLOCK.get());
        dropSelf(STEEL_BLOCK.get());
        dropSelf(STEEL_PLATE_BLOCK.get());
        dropSelf(STEEL_PLATE_STAIRS.get());
        add(STEEL_PLATE_SLAB.get(), createSlabItemTable(STEEL_PLATE_SLAB.get()));

        add(STEEL_DOOR.get(), createDoorTable(STEEL_DOOR.get()));
        dropSelf(STEEL_TRAPDOOR.get());
        dropSelf(STEEL_CHAIN.get());
        dropSelf(STEEL_BARS.get());
        dropSelf(STEEL_BUTTON.get());
        dropSelf(STEEL_PRESSURE_PLATE.get());
        dropSelf(STEEL_GRATE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return MNABlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

    public void copperDrops(Block unaffected, Block exposed, Block weathered, Block oxidized, Block waxed, Block waxedExposed, Block waxedWeathered, Block waxedOxidized) {
        dropSelf(unaffected);
        dropSelf(waxed);
        dropSelf(exposed);
        dropSelf(waxedExposed);
        dropSelf(weathered);
        dropSelf(waxedWeathered);
        dropSelf(oxidized);
        dropSelf(waxedOxidized);
    }
}
