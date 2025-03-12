package com.pantz.metals_and_alloys.registry;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.common.block.WeatheringCopperBarsBlock;
import com.pantz.metals_and_alloys.common.block.WeatheringCopperButtonBlock;
import com.pantz.metals_and_alloys.common.block.WeatheringCopperChainBlock;
import com.pantz.metals_and_alloys.common.block.WeatheringCopperPressurePlateBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MNABlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MetalsAndAlloys.MOD_ID);

    public static final DeferredBlock<Block> IRON_GRATE = register("iron_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of().strength(5.0F, 6.0F).sound(SoundType.COPPER_GRATE).mapColor(MapColor.METAL).noOcclusion().requiresCorrectToolForDrops().isValidSpawn(Blocks::never).isRedstoneConductor(MNABlocks::never).isSuffocating(MNABlocks::never).isViewBlocking(MNABlocks::never)));
    public static final DeferredBlock<Block> IRON_BUTTON = register("iron_button", () -> new ButtonBlock(BlockSetType.IRON, 40, BlockBehaviour.Properties.of().noCollission().strength(0.75F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> IRON_PLATE_BLOCK = register("iron_plate_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> IRON_PLATE_STAIRS = register("iron_plate_stairs", () -> new StairBlock(IRON_PLATE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));
    public static final DeferredBlock<Block> IRON_PLATE_SLAB = register("iron_plate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

    public static final DeferredBlock<Block> CHISELED_GOLD = register("chiseled_gold", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)));
    public static final DeferredBlock<Block> GOLD_TRAPDOOR = register("gold_trapdoor", () -> new TrapDoorBlock(MNABlockSetTypes.GOLD, BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(3.0F).noOcclusion().isValidSpawn(Blocks::never)));
    public static final DeferredBlock<Block> GOLD_DOOR = register("gold_door", () -> new DoorBlock(MNABlockSetTypes.GOLD, BlockBehaviour.Properties.of().mapColor(MapColor.METAL).requiresCorrectToolForDrops().strength(3.0F).noOcclusion().isValidSpawn(Blocks::never)));
    public static final DeferredBlock<Block> GOLD_BUTTON = register("gold_button", () -> new ButtonBlock(MNABlockSetTypes.GOLD, 15, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLD_BARS = register("gold_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f)));
    public static final DeferredBlock<Block> GOLD_CHAIN = register("gold_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> GOLD_GRATE = register("gold_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK).sound(SoundType.COPPER_GRATE).noOcclusion().requiresCorrectToolForDrops().isValidSpawn(Blocks::never).isRedstoneConductor(MNABlocks::never).isSuffocating(MNABlocks::never).isViewBlocking(MNABlocks::never)));

    public static final DeferredBlock<Block> COPPER_CHAIN = register("copper_chain", () -> new WeatheringCopperChainBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.COLOR_ORANGE)));
    public static final DeferredBlock<Block> EXPOSED_COPPER_CHAIN = register("exposed_copper_chain", () -> new WeatheringCopperChainBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final DeferredBlock<Block> WEATHERED_COPPER_CHAIN = register("weathered_copper_chain", () -> new WeatheringCopperChainBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.WARPED_STEM)));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_CHAIN = register("oxidized_copper_chain", () -> new WeatheringCopperChainBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.WARPED_NYLIUM)));

    public static final DeferredBlock<Block> WAXED_COPPER_CHAIN = register("waxed_copper_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.COLOR_ORANGE)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_CHAIN = register("waxed_exposed_copper_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_CHAIN = register("waxed_weathered_copper_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.WARPED_STEM)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_CHAIN = register("waxed_oxidized_copper_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f).mapColor(MapColor.WARPED_NYLIUM)));

    public static final DeferredBlock<Block> COPPER_PRESSURE_PLATE = register("copper_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.COLOR_ORANGE)));
    public static final DeferredBlock<Block> EXPOSED_COPPER_PRESSURE_PLATE = register("exposed_copper_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final DeferredBlock<Block> WEATHERED_COPPER_PRESSURE_PLATE = register("weathered_copper_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.WARPED_STEM)));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_PRESSURE_PLATE = register("oxidized_copper_pressure_plate", () -> new WeatheringCopperPressurePlateBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.WARPED_NYLIUM)));

    public static final DeferredBlock<Block> WAXED_COPPER_PRESSURE_PLATE = register("waxed_copper_pressure_plate", () -> new WeightedPressurePlateBlock(50, BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.COLOR_ORANGE)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_PRESSURE_PLATE = register("waxed_exposed_copper_pressure_plate", () -> new WeightedPressurePlateBlock(50, BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_PRESSURE_PLATE = register("waxed_weathered_copper_pressure_plate", () -> new WeightedPressurePlateBlock(50, BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.WARPED_STEM)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = register("waxed_oxidized_copper_pressure_plate", () -> new WeightedPressurePlateBlock(50, BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.WARPED_NYLIUM)));

    public static final DeferredBlock<Block> COPPER_BARS = register("copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> EXPOSED_COPPER_BARS = register("exposed_copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WEATHERED_COPPER_BARS = register("weathered_copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_BARS = register("oxidized_copper_bars", () -> new WeatheringCopperBarsBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));

    public static final DeferredBlock<Block> WAXED_COPPER_BARS = register("waxed_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_BARS = register("waxed_exposed_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_BARS = register("waxed_weathered_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_BARS = register("waxed_oxidized_copper_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f, 6f).sound(SoundType.COPPER)));

    public static final DeferredBlock<Block> COPPER_BUTTON = register("copper_button", () -> new WeatheringCopperButtonBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> EXPOSED_COPPER_BUTTON = register("exposed_copper_button", () -> new WeatheringCopperButtonBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> WEATHERED_COPPER_BUTTON = register("weathered_copper_button", () -> new WeatheringCopperButtonBlock(WeatheringCopper.WeatherState.WEATHERED, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> OXIDIZED_COPPER_BUTTON = register("oxidized_copper_button", () -> new WeatheringCopperButtonBlock(WeatheringCopper.WeatherState.OXIDIZED, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));

    public static final DeferredBlock<Block> WAXED_COPPER_BUTTON = register("waxed_copper_button", () -> new ButtonBlock(BlockSetType.COPPER, 25, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> WAXED_EXPOSED_COPPER_BUTTON = register("waxed_exposed_copper_button", () -> new ButtonBlock(BlockSetType.COPPER, 25, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> WAXED_WEATHERED_COPPER_BUTTON = register("waxed_weathered_copper_button", () -> new ButtonBlock(BlockSetType.COPPER, 25, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> WAXED_OXIDIZED_COPPER_BUTTON = register("waxed_oxidized_copper_button", () -> new ButtonBlock(BlockSetType.COPPER, 25, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));

    public static final DeferredBlock<Block> TIN_ORE = register("tin_ore", () -> new DropExperienceBlock(UniformInt.of(0,3), BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3f,3f)));
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = register("deepslate_tin_ore", () -> new DropExperienceBlock(UniformInt.of(0,3), BlockBehaviour.Properties.ofFullCopy(TIN_ORE.get()).mapColor(MapColor.DEEPSLATE).sound(SoundType.DEEPSLATE).strength(4.5f,3f)));

    public static final DeferredBlock<Block> RAW_TIN_BLOCK = register("raw_tin_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK).mapColor(MapColor.METAL)));
    public static final DeferredBlock<Block> TIN_BLOCK = register("tin_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.METAL)));
    public static final DeferredBlock<Block> CUT_TIN = register("cut_tin", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.METAL)));
    public static final DeferredBlock<Block> CUT_TIN_STAIRS = register("cut_tin_stairs", () -> new StairBlock(CUT_TIN.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.METAL)));
    public static final DeferredBlock<Block> CUT_TIN_SLAB = register("cut_tin_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.METAL)));

    public static final DeferredBlock<Block> TIN_DOOR = register("tin_door", () -> new DoorBlock(MNABlockSetTypes.TIN, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_DOOR).mapColor(MapColor.METAL)));
    public static final DeferredBlock<Block> TIN_TRAPDOOR = register("tin_trapdoor", () -> new TrapDoorBlock(MNABlockSetTypes.TIN, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_TRAPDOOR).mapColor(MapColor.METAL)));
    public static final DeferredBlock<Block> TIN_CHAIN = register("tin_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3f, 6f)));
    public static final DeferredBlock<Block> TIN_BARS = register("tin_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3f,6f)));
    public static final DeferredBlock<Block> TIN_GRATE = register("tin_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(IRON_GRATE.get()).sound(SoundType.COPPER_GRATE).strength(3f,6f)));
    public static final DeferredBlock<Block> TIN_BUTTON = register("tin_button", () -> new ButtonBlock(MNABlockSetTypes.TIN, 25, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> TIN_PRESSURE_PLATE = register("tin_pressure_plate", () -> new WeightedPressurePlateBlock(45, MNABlockSetTypes.TIN, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)));

    public static final DeferredBlock<Block> RAW_BRONZE_BLOCK = register("raw_bronze_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_COPPER_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> BRONZE_BLOCK = register("bronze_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> CUT_BRONZE = register("cut_bronze", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> CUT_BRONZE_STAIRS = register("cut_bronze_stairs", () -> new StairBlock(CUT_BRONZE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> CUT_BRONZE_SLAB = register("cut_bronze_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.5f, 6f)));

    public static final DeferredBlock<Block> BRONZE_DOOR = register("bronze_door", () -> new DoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_DOOR).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> BRONZE_TRAPDOOR = register("bronze_trapdoor", () -> new TrapDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_DOOR).mapColor(MapColor.TERRACOTTA_ORANGE).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> BRONZE_CHAIN = register("bronze_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(3.5f, 6f)));
    public static final DeferredBlock<Block> BRONZE_BARS = register("bronze_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(3.5f, 6f).sound(SoundType.COPPER)));
    public static final DeferredBlock<Block> BRONZE_GRATE = register("bronze_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).strength(3.5f, 6f).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final DeferredBlock<Block> BRONZE_BUTTON = register("bronze_button", () -> new ButtonBlock(BlockSetType.COPPER, 30, BlockBehaviour.Properties.ofFullCopy(COPPER_BUTTON.get())));
    public static final DeferredBlock<Block> BRONZE_PRESSURE_PLATE = register("bronze_pressure_plate", () -> new WeightedPressurePlateBlock(65, BlockSetType.COPPER, BlockBehaviour.Properties.ofFullCopy(COPPER_PRESSURE_PLATE.get()).mapColor(MapColor.TERRACOTTA_ORANGE)));

    public static final DeferredBlock<Block> MANGANESE_ORE = register("manganese_ore", () -> new DropExperienceBlock(UniformInt.of(2 ,4), BlockBehaviour.Properties.ofFullCopy(Blocks.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_MANGANESE_ORE = register("deepslate_manganese_ore", () -> new DropExperienceBlock(UniformInt.of(2 ,4), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE)));

    public static final DeferredBlock<Block> RAW_MANGANESE_BLOCK = register("raw_manganese_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().mapColor(MapColor.COLOR_PINK).strength(2f, 4.5f).instrument(NoteBlockInstrument.BASEDRUM)));
    public static final DeferredBlock<Block> MANGANESE_BLOCK = register("manganese_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(RAW_MANGANESE_BLOCK.get())));
    public static final DeferredBlock<Block> CUT_MANGANESE = register("cut_manganese", () -> new Block(BlockBehaviour.Properties.ofFullCopy(MANGANESE_BLOCK.get())));
    public static final DeferredBlock<Block> CUT_MANGANESE_STAIRS = register("cut_manganese_stairs", () -> new StairBlock(CUT_MANGANESE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(MANGANESE_BLOCK.get())));
    public static final DeferredBlock<Block> CUT_MANGANESE_SLAB = register("cut_manganese_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(MANGANESE_BLOCK.get())));

    public static final DeferredBlock<Block> MANGANESE_DOOR = register("manganese_door", () -> new DoorBlock(MNABlockSetTypes.MANGANESE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).requiresCorrectToolForDrops().strength(2.5f).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> MANGANESE_TRAPDOOR = register("manganese_trapdoor", () -> new TrapDoorBlock(MNABlockSetTypes.MANGANESE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).requiresCorrectToolForDrops().strength(2.5f).noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> MANGANESE_CHAIN = register("manganese_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(2.5f, 5f)));
    public static final DeferredBlock<Block> MANGANESE_BARS = register("manganese_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(2.5f, 5f)));
    public static final DeferredBlock<Block> MANGANESE_GRATE = register("manganese_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_PINK).strength(2.5f, 5f)));
    public static final DeferredBlock<Block> MANGANESE_BUTTON = register("manganese_button", () -> new ButtonBlock(MNABlockSetTypes.MANGANESE, 15, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> MANGANESE_PRESSURE_PLATE = register("manganese_pressure_plate", () -> new WeightedPressurePlateBlock(30, MNABlockSetTypes.MANGANESE, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.COLOR_PINK)));

    public static final DeferredBlock<Block> PIG_IRON_BLOCK = register("pig_iron_block", () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops().strength(2.5f).mapColor(MapColor.WOOL)));
    public static final DeferredBlock<Block> STEEL_BLOCK = register("steel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).strength(5.5f ,6f).mapColor(MapColor.COLOR_GRAY)));
    public static final DeferredBlock<Block> STEEL_PLATE_BLOCK = register("steel_plate_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(IRON_PLATE_BLOCK.get()).strength(5.5f, 6f).mapColor(MapColor.COLOR_GRAY)));
    public static final DeferredBlock<Block> STEEL_PLATE_STAIRS = register("steel_plate_stairs", () -> new StairBlock(STEEL_PLATE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(STEEL_PLATE_BLOCK.get())));
    public static final DeferredBlock<Block> STEEL_PLATE_SLAB = register("steel_plate_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(STEEL_PLATE_BLOCK.get())));

    public static final DeferredBlock<Block> STEEL_DOOR = register("steel_door", () -> new DoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_DOOR).mapColor(MapColor.COLOR_GRAY).strength(5.5f)));
    public static final DeferredBlock<Block> STEEL_TRAPDOOR = register("steel_trapdoor", () -> new TrapDoorBlock(BlockSetType.IRON, BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_TRAPDOOR).mapColor(MapColor.COLOR_GRAY).strength(5.5f)));
    public static final DeferredBlock<Block> STEEL_CHAIN = register("steel_chain", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN).strength(5.5f, 6f)));
    public static final DeferredBlock<Block> STEEL_BARS = register("steel_bars", () -> new IronBarsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).strength(5.5f, 6f)));
    public static final DeferredBlock<Block> STEEL_GRATE = register("steel_grate", () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_GRATE).mapColor(MapColor.COLOR_GRAY).strength(5.5f, 6f)));
    public static final DeferredBlock<Block> STEEL_BUTTON = register("steel_button", () -> new ButtonBlock(BlockSetType.IRON, 50, BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON)));
    public static final DeferredBlock<Block> STEEL_PRESSURE_PLATE = register("steel_pressure_plate", () -> new WeightedPressurePlateBlock(180, BlockSetType.IRON, BlockBehaviour.Properties.ofFullCopy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE).mapColor(MapColor.COLOR_GRAY)));



    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    public static void register(IEventBus event) {
        BLOCKS.register(event);
    }

    private static <T extends Block> void registerItem(String name, DeferredBlock<T> block) {
        MNAItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerItem(name, toReturn);
        return toReturn;
    }

}
