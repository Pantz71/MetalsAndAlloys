package com.pantz.metals_and_alloys.data.client;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;
import static net.minecraft.world.level.block.Blocks.*;


public class MNABlockStateProvider extends BlockStateProvider {
    public MNABlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MetalsAndAlloys.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /* IRON */
        block(IRON_GRATE.get());
        buttonBlock(IRON_BLOCK, IRON_BUTTON.get());
        block(IRON_PLATE_BLOCK.get());
        slabBlock(IRON_PLATE_BLOCK.get(), IRON_PLATE_SLAB.get());
        stairsBlock(IRON_PLATE_BLOCK.get(), IRON_PLATE_STAIRS.get());

        /* GOLD */
        chainBlock(GOLD_CHAIN.get());
        block(CHISELED_GOLD.get());
        block(GOLD_GRATE.get());
        doorBlocks(GOLD_DOOR.get(), GOLD_TRAPDOOR.get());
        buttonBlock(GOLD_BLOCK, GOLD_BUTTON.get());
        ironBarsBlock(GOLD_BARS);

        /* COPPER */
        chainBlock(COPPER_CHAIN.get());
        chainBlock(EXPOSED_COPPER_CHAIN.get());
        chainBlock(WEATHERED_COPPER_CHAIN.get());
        chainBlock(OXIDIZED_COPPER_CHAIN.get());

        chainBlock(WAXED_COPPER_CHAIN.get(), modLoc("block/copper_chain"), modLoc("item/copper_chain"));
        chainBlock(WAXED_EXPOSED_COPPER_CHAIN.get(), modLoc("block/exposed_copper_chain"), modLoc("item/exposed_copper_chain"));
        chainBlock(WAXED_WEATHERED_COPPER_CHAIN.get(), modLoc("block/weathered_copper_chain"), modLoc("item/weathered_copper_chain"));
        chainBlock(WAXED_OXIDIZED_COPPER_CHAIN.get(), modLoc("block/oxidized_copper_chain"), modLoc("item/oxidized_copper_chain"));

        weightedPressurePlateBlock(COPPER_BLOCK, COPPER_PRESSURE_PLATE);
        weightedPressurePlateBlock(EXPOSED_COPPER, EXPOSED_COPPER_PRESSURE_PLATE);
        weightedPressurePlateBlock(WEATHERED_COPPER, WEATHERED_COPPER_PRESSURE_PLATE);
        weightedPressurePlateBlock(OXIDIZED_COPPER, OXIDIZED_COPPER_PRESSURE_PLATE);

        weightedPressurePlateBlock(COPPER_BLOCK, WAXED_COPPER_PRESSURE_PLATE);
        weightedPressurePlateBlock(EXPOSED_COPPER, WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        weightedPressurePlateBlock(WEATHERED_COPPER, WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        weightedPressurePlateBlock(OXIDIZED_COPPER, WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

        ironBarsBlock(COPPER_BARS);
        ironBarsBlock(EXPOSED_COPPER_BARS);
        ironBarsBlock(WEATHERED_COPPER_BARS);
        ironBarsBlock(OXIDIZED_COPPER_BARS);

        ironBarsBlock(WAXED_COPPER_BARS.get(), modLoc("block/copper_bars"));
        ironBarsBlock(WAXED_EXPOSED_COPPER_BARS.get(), modLoc("block/exposed_copper_bars"));
        ironBarsBlock(WAXED_WEATHERED_COPPER_BARS.get(), modLoc("block/weathered_copper_bars"));
        ironBarsBlock(WAXED_OXIDIZED_COPPER_BARS.get(), modLoc("block/oxidized_copper_bars"));

        buttonBlock(COPPER_BLOCK, COPPER_BUTTON.get());
        buttonBlock(EXPOSED_COPPER, EXPOSED_COPPER_BUTTON.get());
        buttonBlock(WEATHERED_COPPER, WEATHERED_COPPER_BUTTON.get());
        buttonBlock(OXIDIZED_COPPER, OXIDIZED_COPPER_BUTTON.get());

        buttonBlock(COPPER_BLOCK, WAXED_COPPER_BUTTON.get());
        buttonBlock(EXPOSED_COPPER, WAXED_EXPOSED_COPPER_BUTTON.get());
        buttonBlock(WEATHERED_COPPER, WAXED_WEATHERED_COPPER_BUTTON.get());
        buttonBlock(OXIDIZED_COPPER, WAXED_OXIDIZED_COPPER_BUTTON.get());

        /* TIN */
        block(TIN_ORE.get());
        block(DEEPSLATE_TIN_ORE.get());
        block(RAW_TIN_BLOCK.get());
        block(TIN_BLOCK.get());
        block(CUT_TIN.get());
        stairsBlock(CUT_TIN.get(), CUT_TIN_STAIRS.get());
        slabBlock(CUT_TIN.get(), CUT_TIN_SLAB.get());

        doorBlocks(TIN_DOOR.get(), TIN_TRAPDOOR.get());
        weightedPressurePlateBlock(TIN_BLOCK.get(), TIN_PRESSURE_PLATE);
        buttonBlock(TIN_BLOCK.get(), TIN_BUTTON.get());
        block(TIN_GRATE.get());
        chainBlock(TIN_CHAIN.get());
        ironBarsBlock(TIN_BARS);

        /* BRONZE */
        block(RAW_BRONZE_BLOCK.get());
        block(BRONZE_BLOCK.get());
        block(CUT_BRONZE.get());
        stairsBlock(CUT_BRONZE.get(), CUT_BRONZE_STAIRS.get());
        slabBlock(CUT_BRONZE.get(), CUT_BRONZE_SLAB.get());

        doorBlocks(BRONZE_DOOR.get(), BRONZE_TRAPDOOR.get());
        weightedPressurePlateBlock(BRONZE_BLOCK.get(), BRONZE_PRESSURE_PLATE);
        buttonBlock(BRONZE_BLOCK.get(), BRONZE_BUTTON.get());
        block(BRONZE_GRATE.get());
        chainBlock(BRONZE_CHAIN.get());
        ironBarsBlock(BRONZE_BARS);

        /* MANGANESE */
        block(MANGANESE_ORE.get());
        block(DEEPSLATE_MANGANESE_ORE.get());
        block(RAW_MANGANESE_BLOCK.get());
        block(MANGANESE_BLOCK.get());
        block(CUT_MANGANESE.get());
        stairsBlock(CUT_MANGANESE.get(), CUT_MANGANESE_STAIRS.get());
        slabBlock(CUT_MANGANESE.get(), CUT_MANGANESE_SLAB.get());

        doorBlocks(MANGANESE_DOOR.get(), MANGANESE_TRAPDOOR.get());
        weightedPressurePlateBlock(MANGANESE_BLOCK.get(), MANGANESE_PRESSURE_PLATE);
        buttonBlock(MANGANESE_BLOCK.get(), MANGANESE_BUTTON.get());
        block(MANGANESE_GRATE.get());
        chainBlock(MANGANESE_CHAIN.get());
        ironBarsBlock(MANGANESE_BARS);

        /* STEEL */
        block(PIG_IRON_BLOCK.get());
        block(STEEL_BLOCK.get());
        block(STEEL_PLATE_BLOCK.get());
        stairsBlock(STEEL_PLATE_BLOCK.get(), STEEL_PLATE_STAIRS.get());
        slabBlock(STEEL_PLATE_BLOCK.get(), STEEL_PLATE_SLAB.get());

        doorBlocks(STEEL_DOOR.get(), STEEL_TRAPDOOR.get());
        weightedPressurePlateBlock(STEEL_BLOCK.get(), STEEL_PRESSURE_PLATE);
        buttonBlock(STEEL_BLOCK.get(), STEEL_BUTTON.get());
        block(STEEL_GRATE.get());
        chainBlock(STEEL_CHAIN.get());
        ironBarsBlock(STEEL_BARS);


    }

    public void generatedItem(ItemLike item, String type) {
        generatedItem(item, item, type);
    }

    public void generatedItem(ItemLike item, ItemLike texture, String type) {
        generatedItem(item, prefix(type + "/", MNAItemModelProvider.key(texture)));
    }

    public void generatedItem(ItemLike item, ResourceLocation texture) {
        itemModels().withExistingParent(BuiltInRegistries.ITEM.getKey(item.asItem()).getPath(), "item/generated").texture("layer0", texture);
    }


    public void block(Block block) {
        simpleBlock(block);
        blockItem(block);
    }

    public void blockItem(Block block) {
        simpleBlockItem(block, new ModelFile.ExistingModelFile(blockTexture(block), models().existingFileHelper));
    }


    public void slabBlock(Block block, Block slab) {
        if (slab instanceof SlabBlock slabBlock) {
            slabBlock(slabBlock, blockTexture(block), blockTexture(block));
            blockItem(slab);
        }
    }

    public void stairsBlock(Block block, Block stairs) {
        if (stairs instanceof StairBlock stairBlock) {
            stairsBlock(stairBlock, blockTexture(block));
            blockItem(stairs);
        }
    }

    public void buttonBlock(Block block, Block button) {
        buttonBlock(button, blockTexture(block));
    }

    public void buttonBlock(Block block, ResourceLocation texture) {
        ModelFile button = models().button(name(block), texture);
        ModelFile buttonPressed = models().buttonPressed(name(block) + "_pressed", texture);
        ModelFile buttonInventoryModel = models().buttonInventory(name(block) + "_inventory", texture);
        if (block instanceof ButtonBlock buttonBlock) {
            buttonBlock(buttonBlock, button, buttonPressed);
        }

        itemModels().getBuilder(name(block)).parent(buttonInventoryModel);
    }

    public void weightedPressurePlateBlock(Block base, DeferredBlock<Block> block) {
        ModelFile pressurePlate = models().pressurePlate(name(block.get()), blockTexture(base));
        ModelFile pressurePlateDown = models().pressurePlateDown(name(block.get()) + "_down", blockTexture(base));
        this.getVariantBuilder(block.get()).forAllStates(state -> ConfiguredModel.builder().modelFile(state.getValue(WeightedPressurePlateBlock.POWER) == 0 ? pressurePlate : pressurePlateDown).build());
        this.blockItem(block.get());
    }


    public void doorBlock(Block door) {
        if (door instanceof DoorBlock doorBlock) {
            doorBlock(doorBlock, suffix(blockTexture(door), "_bottom"), suffix(blockTexture(door), "_top"));
            generatedItem(door, "item");
        }

    }

    public void trapDoorBlock(Block trapDoor) {
        if (trapDoor instanceof TrapDoorBlock trapDoorBlock) {
            trapdoorBlock(trapDoorBlock, blockTexture(trapDoor), true);
            itemModels().getBuilder(name(trapDoor)).parent(models().trapdoorOrientableBottom(name(trapDoor) + "_bottom", blockTexture(trapDoor)));
        }

    }

    public void doorBlocks(Block door, Block trapdoor) {
        doorBlock(door);
        trapDoorBlock(trapdoor);
    }

    public void ironBarsBlock(DeferredBlock<Block> bars) {
        ironBarsBlock(bars.get(), blockTexture(bars.get()));
        generatedItem(bars.get(), "block");
    }

    public void ironBarsBlock(Block block, ResourceLocation texture) {
        String name = name(block);
        ResourceLocation edgeTexture = suffix(texture, "_edge");
        ModelFile post = ironBarsBlock(name, "post", texture).texture("bars", edgeTexture);
        ModelFile postEnds = ironBarsBlock(name, "post_ends", texture).texture("edge", edgeTexture);
        ModelFile side = ironBarsBlock(name, "side", texture).texture("bars", texture).texture("edge", edgeTexture);
        ModelFile sideAlt = ironBarsBlock(name, "side_alt", texture).texture("bars", texture).texture("edge", edgeTexture);
        ModelFile cap = ironBarsBlock(name, "cap", texture).texture("bars", texture).texture("edge", edgeTexture);
        ModelFile capAlt = ironBarsBlock(name, "cap_alt", texture).texture("bars", texture).texture("edge", edgeTexture);
        paneBlock(block, post, postEnds, side, sideAlt, cap, capAlt);
        generatedItem(block, texture);

    }

    public BlockModelBuilder ironBarsBlock(String name, String suffix, ResourceLocation barsTexture) {
        return models().getBuilder(name + "_" + suffix).parent(new ModelFile.UncheckedModelFile(ResourceLocation.parse("block/iron_bars_" + suffix))).texture("particle", barsTexture);
    }

    public void paneBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile side, ModelFile sideAlt, ModelFile cap, ModelFile capAlt) {
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel().end();
        builder.part().modelFile(post).addModel().condition(BlockStateProperties.NORTH, false).condition(BlockStateProperties.WEST, false).condition(BlockStateProperties.SOUTH, false).condition(BlockStateProperties.EAST, new Boolean[]{false}).end();

        for (Direction direction : Direction.Plane.HORIZONTAL.stream().toList()) {
            builder.part().modelFile(direction != Direction.SOUTH && direction != Direction.WEST ? cap : capAlt).rotationY(direction.getAxis() == Direction.Axis.X ? 90 : 0).addModel().condition(BlockStateProperties.NORTH, PipeBlock.PROPERTY_BY_DIRECTION.get(direction) == BlockStateProperties.NORTH).condition(BlockStateProperties.WEST, PipeBlock.PROPERTY_BY_DIRECTION.get(direction) == BlockStateProperties.WEST).condition(BlockStateProperties.SOUTH, PipeBlock.PROPERTY_BY_DIRECTION.get(direction) == BlockStateProperties.SOUTH).condition(BlockStateProperties.EAST, new Boolean[]{PipeBlock.PROPERTY_BY_DIRECTION.get(direction) == BlockStateProperties.EAST}).end();
        }

        PipeBlock.PROPERTY_BY_DIRECTION.forEach((dir, value) -> {
            if (dir.getAxis().isHorizontal()) {
                builder.part().modelFile(dir != Direction.SOUTH && dir != Direction.WEST ? side : sideAlt).rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel().condition(value, new Boolean[]{true}).end();
            }

        });
    }

    public void chainBlock(Block chain) {
        chainBlock(chain, blockTexture(chain), itemTexture(chain));
    }

    public void chainBlock(Block block, ResourceLocation texture, ResourceLocation itemTexture) {
        ModelFile chainModel = models().getBuilder(name(block)).parent(models().getExistingFile(mcLoc("block/chain")))
                .texture("particle", texture.getPath()).texture("all", texture.getPath());

        getVariantBuilder(block).partialState().with(BlockStateProperties.AXIS, Direction.Axis.X).modelForState().modelFile(chainModel).rotationX(90).rotationY(90).addModel()
                .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Y).modelForState().modelFile(chainModel).addModel()
                .partialState().with(BlockStateProperties.AXIS, Direction.Axis.Z).modelForState().modelFile(chainModel).rotationX(90).addModel();
        generatedItem(block, itemTexture);

    }

    public static String name(Block block) {
        ResourceLocation key = BuiltInRegistries.BLOCK.getKey(block);
        return key.getPath();
    }

    public ResourceLocation itemTexture(ItemLike item) {
        ResourceLocation name = this.key(Block.byItem(item.asItem()));
        return ResourceLocation.fromNamespaceAndPath(name.getNamespace(), "item/" + name.getPath());
    }


    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }

    public ResourceLocation prefix(String prefix, ResourceLocation rl) {
        return ResourceLocation.fromNamespaceAndPath(rl.getNamespace(), prefix + rl.getPath());
    }

    public ResourceLocation suffix(ResourceLocation rl, String suffix) {
        String var10002 = rl.getNamespace();
        String var10003 = rl.getPath();
        return ResourceLocation.fromNamespaceAndPath(var10002, var10003 + suffix);
    }

    public ModelFile particle(Block block, ResourceLocation texture) {
        return models().getBuilder(name(block)).texture("particle", texture);
    }

    public ModelFile particle(Supplier<? extends Block> block, ResourceLocation texture) {
        return particle(block.get(), texture);
    }

    /*
    public void cubeColumnBlock(Supplier<Block> block) {
        ResourceLocation name = BuiltInRegistries.BLOCK.getKey(block.get());
        cubeColumnBlock(block, prefix("block/", ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name.getPath())), prefix("block/", suffix(ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name.getPath()), "_top")));
    }

    public void cubeColumnBlock(Supplier<Block> block, ResourceLocation sideTexture, ResourceLocation topTexture) {
        simpleBlock(block.get(), models().cubeColumn(name(block.get()), sideTexture, topTexture));
        blockItem((Block) block);
    }
     */

}
