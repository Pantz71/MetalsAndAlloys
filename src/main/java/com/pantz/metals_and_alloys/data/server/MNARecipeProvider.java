package com.pantz.metals_and_alloys.data.server;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;
import static com.pantz.metals_and_alloys.registry.MNABlocks.BRONZE_BARS;
import static com.pantz.metals_and_alloys.registry.MNAItems.*;
import static net.minecraft.world.item.Items.*;
import static net.minecraft.world.item.crafting.Ingredient.of;

public class MNARecipeProvider extends RecipeProvider {


    public MNARecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        /* IRON */
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, IRON_GRATE).define('I', IRON_INGOT).pattern(" I ").pattern("I I").pattern(" I ").unlockedBy(getHasName(IRON_INGOT), has(IRON_INGOT)).save(recipeOutput);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, IRON_GRATE, IRON_BLOCK, 4);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, IRON_PLATE, 3).requires(IRON_INGOT, 3).unlockedBy(getHasName(IRON_INGOT), has(IRON_INGOT)).save(recipeOutput);
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, IRON_PLATE_BLOCK, IRON_PLATE);

        stairBuilder(IRON_PLATE_STAIRS, of(IRON_PLATE_BLOCK)).unlockedBy(getHasName(IRON_PLATE_BLOCK), has(IRON_PLATE_BLOCK)).save(recipeOutput);
        slabBuilder(IRON_PLATE_SLAB, of(IRON_PLATE_BLOCK)).unlockedBy(getHasName(IRON_PLATE_BLOCK), has(IRON_PLATE_BLOCK)).save(recipeOutput);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, IRON_PLATE_STAIRS, IRON_PLATE_BLOCK);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, IRON_PLATE_SLAB, IRON_PLATE_BLOCK,2);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, IRON_BUTTON).requires(STONE_BUTTON).requires(IRON_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(IRON_INGOT), has(IRON_INGOT)).save(recipeOutput);

        /* GOLD */
        doorBuilder(GOLD_DOOR, of(GOLD_INGOT)).unlockedBy(getHasName(GOLD_INGOT), has(GOLD_INGOT)).save(recipeOutput);
        trapdoorBuilder(GOLD_TRAPDOOR, of(GOLD_INGOT)).unlockedBy(getHasName(GOLD_INGOT), has(GOLD_INGOT)).save(recipeOutput);
        barsBuilder(GOLD_BARS, of(GOLD_INGOT)).unlockedBy(getHasName(GOLD_INGOT), has(GOLD_INGOT)).save(recipeOutput);
        chainBuilder(GOLD_CHAIN, of(GOLD_NUGGET), of(GOLD_INGOT)).unlockedBy(getHasName(GOLD_NUGGET), has(GOLD_NUGGET)).unlockedBy(getHasName(GOLD_INGOT), has(GOLD_INGOT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, GOLD_BUTTON).requires(STONE_BUTTON).requires(GOLD_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(GOLD_INGOT), has(GOLD_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, GOLD_GRATE).define('I', GOLD_INGOT).pattern(" I ").pattern("I I").pattern(" I ").unlockedBy(getHasName(GOLD_INGOT), has(GOLD_INGOT)).save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, CHISELED_GOLD).requires(GOLD_BLOCK).unlockedBy(getHasName(GOLD_BLOCK), has(GOLD_BLOCK)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, GOLD_BLOCK).requires(CHISELED_GOLD).unlockedBy(getHasName(CHISELED_GOLD), has(CHISELED_GOLD)).save(recipeOutput, getModConversionRecipeName(GOLD_BLOCK, CHISELED_GOLD));
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CHISELED_GOLD, GOLD_BLOCK);

        /* COPPER */
        chainBuilder(COPPER_CHAIN, of(COPPER_NUGGET), of(COPPER_INGOT)).unlockedBy(getHasName(COPPER_NUGGET), has(COPPER_NUGGET)).unlockedBy(getHasName(COPPER_INGOT), has(COPPER_INGOT)).save(recipeOutput);
        pressurePlate(recipeOutput, COPPER_PRESSURE_PLATE, COPPER_INGOT);
        barsBuilder(COPPER_BARS, of(COPPER_INGOT)).unlockedBy(getHasName(COPPER_INGOT), has(COPPER_INGOT)).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, COPPER_BUTTON).requires(STONE_BUTTON).requires(COPPER_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(COPPER_INGOT), has(COPPER_INGOT)).save(recipeOutput);

        SimpleCookingRecipeBuilder.blasting(of(COPPER_PICKAXE, COPPER_SHOVEL, COPPER_AXE, COPPER_HOE, COPPER_SWORD, COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS, COPPER_HORSE_ARMOR), RecipeCategory.MISC, COPPER_NUGGET, 0.1F, 100).unlockedBy(getHasName(COPPER_PICKAXE), has(COPPER_PICKAXE)).unlockedBy(getHasName(COPPER_SHOVEL), has(COPPER_SHOVEL)).unlockedBy(getHasName(COPPER_AXE), has(COPPER_AXE)).unlockedBy(getHasName(COPPER_HOE), has(COPPER_HOE)).unlockedBy(getHasName(COPPER_SWORD), has(COPPER_SWORD)).unlockedBy(getHasName(COPPER_HELMET), has(COPPER_HELMET)).unlockedBy(getHasName(COPPER_CHESTPLATE), has(COPPER_CHESTPLATE)).unlockedBy(getHasName(COPPER_LEGGINGS), has(COPPER_LEGGINGS)).unlockedBy(getHasName(COPPER_BOOTS), has(COPPER_BOOTS)).unlockedBy(getHasName(COPPER_HORSE_ARMOR), has(COPPER_HORSE_ARMOR)).save(recipeOutput,  MetalsAndAlloys.MOD_ID + ":" + getBlastingRecipeName(COPPER_NUGGET));
        SimpleCookingRecipeBuilder.smelting(of(COPPER_PICKAXE, COPPER_SHOVEL, COPPER_AXE, COPPER_HOE, COPPER_SWORD, COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS, COPPER_HORSE_ARMOR), RecipeCategory.MISC, COPPER_NUGGET, 0.1F, 100).unlockedBy(getHasName(COPPER_PICKAXE), has(COPPER_PICKAXE)).unlockedBy(getHasName(COPPER_SHOVEL), has(COPPER_SHOVEL)).unlockedBy(getHasName(COPPER_AXE), has(COPPER_AXE)).unlockedBy(getHasName(COPPER_HOE), has(COPPER_HOE)).unlockedBy(getHasName(COPPER_SWORD), has(COPPER_SWORD)).unlockedBy(getHasName(COPPER_HELMET), has(COPPER_HELMET)).unlockedBy(getHasName(COPPER_CHESTPLATE), has(COPPER_CHESTPLATE)).unlockedBy(getHasName(COPPER_LEGGINGS), has(COPPER_LEGGINGS)).unlockedBy(getHasName(COPPER_BOOTS), has(COPPER_BOOTS)).unlockedBy(getHasName(COPPER_HORSE_ARMOR), has(COPPER_HORSE_ARMOR)).save(recipeOutput,  MetalsAndAlloys.MOD_ID + ":" + getSmeltingRecipeName(COPPER_NUGGET));

        nineBlockStorageRecipesWithCustomPacking(recipeOutput, RecipeCategory.MISC, COPPER_NUGGET, RecipeCategory.MISC, COPPER_INGOT, "copper_ingot_from_nuggets", "copper_ingot");
        armor(recipeOutput, COPPER_INGOT, COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS);
        tool(recipeOutput, COPPER_INGOT, COPPER_SWORD, COPPER_SHOVEL, COPPER_PICKAXE, COPPER_AXE, COPPER_HOE);

        waxRecipe(recipeOutput, COPPER_BARS, WAXED_COPPER_BARS);
        waxRecipe(recipeOutput, EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_BARS);
        waxRecipe(recipeOutput, WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_BARS);
        waxRecipe(recipeOutput, OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_BARS);

        waxRecipe(recipeOutput, COPPER_CHAIN, WAXED_COPPER_CHAIN);
        waxRecipe(recipeOutput, EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_CHAIN);
        waxRecipe(recipeOutput, WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_CHAIN);
        waxRecipe(recipeOutput, OXIDIZED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_CHAIN);

        waxRecipe(recipeOutput, COPPER_PRESSURE_PLATE, WAXED_COPPER_PRESSURE_PLATE);
        waxRecipe(recipeOutput, EXPOSED_COPPER_PRESSURE_PLATE, WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        waxRecipe(recipeOutput, WEATHERED_COPPER_PRESSURE_PLATE, WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        waxRecipe(recipeOutput, OXIDIZED_COPPER_PRESSURE_PLATE, WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);

        waxRecipe(recipeOutput, COPPER_BUTTON, WAXED_COPPER_BUTTON);
        waxRecipe(recipeOutput, EXPOSED_COPPER_BUTTON, WAXED_EXPOSED_COPPER_BUTTON);
        waxRecipe(recipeOutput, WEATHERED_COPPER_BUTTON, WAXED_WEATHERED_COPPER_BUTTON);
        waxRecipe(recipeOutput, OXIDIZED_COPPER_BUTTON, WAXED_OXIDIZED_COPPER_BUTTON);

        /* TIN */
        List<ItemLike> TIN_SMELTABLES = List.of(RAW_TIN, TIN_ORE, DEEPSLATE_TIN_ORE);

        oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, TIN_INGOT, 0.3f, 200, "tin");
        oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, TIN_INGOT, 0.3f, 100, "tin");
        nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, TIN_INGOT, RecipeCategory.BUILDING_BLOCKS, TIN_BLOCK, "tin_ingot_from_tin_block", "tin_ingot");
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, RAW_TIN, RecipeCategory.BUILDING_BLOCKS, RAW_TIN_BLOCK);
        nineBlockStorageRecipesWithCustomPacking(recipeOutput, RecipeCategory.MISC, TIN_NUGGET, RecipeCategory.MISC, TIN_INGOT, "tin_ingot_from_nuggets", "tin_ingot");

        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_TIN, TIN_BLOCK);
        stairBuilder(CUT_TIN_STAIRS, of(CUT_TIN)).unlockedBy(getHasName(CUT_TIN), has(CUT_TIN)).save(recipeOutput);
        slabBuilder(CUT_TIN_SLAB, of(CUT_TIN)).unlockedBy(getHasName(CUT_TIN), has(CUT_TIN)).save(recipeOutput);

        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_TIN_STAIRS, TIN_BLOCK, 4);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_TIN_SLAB, TIN_BLOCK, 8);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_TIN, TIN_BLOCK, 4);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_TIN_STAIRS, CUT_TIN);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_TIN_SLAB, CUT_TIN, 2);

        doorBuilder(TIN_DOOR, of(TIN_INGOT)).unlockedBy(getHasName(TIN_INGOT), has(TIN_INGOT)).save(recipeOutput);
        trapdoorBuilder(TIN_TRAPDOOR, of(TIN_INGOT)).unlockedBy(getHasName(TIN_INGOT), has(TIN_INGOT)).save(recipeOutput);
        barsBuilder(TIN_BARS, of(TIN_INGOT)).unlockedBy(getHasName(TIN_INGOT), has(TIN_INGOT)).save(recipeOutput);
        chainBuilder(TIN_CHAIN, of(TIN_NUGGET), of(TIN_INGOT)).unlockedBy(getHasName(TIN_NUGGET), has(TIN_NUGGET)).unlockedBy(getHasName(TIN_INGOT), has(TIN_INGOT)).save(recipeOutput);
        pressurePlate(recipeOutput, TIN_PRESSURE_PLATE, TIN_INGOT);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, TIN_BUTTON).requires(STONE_BUTTON).requires(TIN_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(TIN_INGOT), has(TIN_INGOT)).save(recipeOutput);
        grate(recipeOutput, TIN_GRATE.get(), TIN_BLOCK.get());
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, TIN_GRATE, TIN_BLOCK, 4);


        /* BRONZE */
        List<ItemLike> BRONZE_SMELTABLES = List.of(RAW_BRONZE);

        oreSmelting(recipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, BRONZE_INGOT, 0.5f, 200, "bronze");
        oreBlasting(recipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, BRONZE_INGOT, 0.5f, 100, "bronze");
        nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, BRONZE_INGOT, RecipeCategory.BUILDING_BLOCKS, BRONZE_BLOCK, "bronze_ingot_from_bronze_block", "bronze_ingot");
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, RAW_BRONZE, RecipeCategory.BUILDING_BLOCKS, RAW_BRONZE_BLOCK);
        nineBlockStorageRecipesWithCustomPacking(recipeOutput, RecipeCategory.MISC, BRONZE_NUGGET, RecipeCategory.MISC, BRONZE_INGOT, "bronze_ingot_from_nuggets", "bronze_ingot");

        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_BRONZE, BRONZE_BLOCK);
        stairBuilder(CUT_BRONZE_STAIRS, of(CUT_BRONZE)).unlockedBy(getHasName(CUT_BRONZE), has(CUT_BRONZE)).save(recipeOutput);
        slabBuilder(CUT_BRONZE_SLAB, of(CUT_BRONZE)).unlockedBy(getHasName(CUT_BRONZE), has(CUT_BRONZE)).save(recipeOutput);

        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_BRONZE, BRONZE_BLOCK, 4);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_BRONZE_SLAB, BRONZE_BLOCK, 8);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_BRONZE_STAIRS, BRONZE_BLOCK, 4);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_BRONZE_STAIRS, CUT_BRONZE);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_BRONZE_SLAB, CUT_BRONZE, 2);

        doorBuilder(BRONZE_DOOR, of(BRONZE_INGOT)).unlockedBy(getHasName(BRONZE_INGOT), has(BRONZE_INGOT)).save(recipeOutput);
        trapdoorBuilder(BRONZE_TRAPDOOR, of(BRONZE_INGOT)).unlockedBy(getHasName(BRONZE_INGOT), has(BRONZE_INGOT)).save(recipeOutput);
        barsBuilder(BRONZE_BARS, of(BRONZE_INGOT)).unlockedBy(getHasName(BRONZE_INGOT), has(BRONZE_INGOT)).save(recipeOutput);
        chainBuilder(BRONZE_CHAIN, of(BRONZE_NUGGET), of(BRONZE_INGOT)).unlockedBy(getHasName(BRONZE_NUGGET), has(BRONZE_NUGGET)).unlockedBy(getHasName(BRONZE_INGOT), has(BRONZE_INGOT)).save(recipeOutput);
        pressurePlate(recipeOutput, BRONZE_PRESSURE_PLATE, BRONZE_INGOT);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, BRONZE_BUTTON).requires(STONE_BUTTON).requires(BRONZE_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(BRONZE_INGOT), has(BRONZE_INGOT)).save(recipeOutput);
        grate(recipeOutput, BRONZE_GRATE.get(), BRONZE_BLOCK.get());
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, BRONZE_GRATE, BRONZE_BLOCK, 4);


        armor(recipeOutput, BRONZE_INGOT, BRONZE_HELMET, BRONZE_CHESTPLATE, BRONZE_LEGGINGS, BRONZE_BOOTS);
        tool(recipeOutput, BRONZE_INGOT, BRONZE_SWORD, BRONZE_SHOVEL, BRONZE_PICKAXE, BRONZE_AXE, BRONZE_HOE);

        SimpleCookingRecipeBuilder.smelting(of(BRONZE_PICKAXE, BRONZE_SHOVEL, BRONZE_AXE, BRONZE_HOE, BRONZE_SWORD, BRONZE_HELMET, BRONZE_CHESTPLATE, BRONZE_LEGGINGS, BRONZE_BOOTS, BRONZE_HORSE_ARMOR), RecipeCategory.MISC, BRONZE_NUGGET, 0.1F, 200).unlockedBy(getHasName(BRONZE_PICKAXE), has(BRONZE_PICKAXE)).unlockedBy(getHasName(BRONZE_SHOVEL), has(BRONZE_SHOVEL)).unlockedBy(getHasName(BRONZE_AXE), has(BRONZE_AXE)).unlockedBy(getHasName(BRONZE_HOE), has(BRONZE_HOE)).unlockedBy(getHasName(BRONZE_SWORD), has(BRONZE_SWORD)).unlockedBy(getHasName(BRONZE_HELMET), has(BRONZE_HELMET)).unlockedBy(getHasName(BRONZE_CHESTPLATE), has(BRONZE_CHESTPLATE)).unlockedBy(getHasName(BRONZE_LEGGINGS), has(BRONZE_LEGGINGS)).unlockedBy(getHasName(BRONZE_BOOTS), has(BRONZE_BOOTS)).unlockedBy(getHasName(BRONZE_HORSE_ARMOR), has(BRONZE_HORSE_ARMOR)).save(recipeOutput,  MetalsAndAlloys.MOD_ID + ":" + getSmeltingRecipeName(BRONZE_NUGGET));
        SimpleCookingRecipeBuilder.blasting(of(BRONZE_PICKAXE, BRONZE_SHOVEL, BRONZE_AXE, BRONZE_HOE, BRONZE_SWORD, BRONZE_HELMET, BRONZE_CHESTPLATE, BRONZE_LEGGINGS, BRONZE_BOOTS, BRONZE_HORSE_ARMOR), RecipeCategory.MISC, BRONZE_NUGGET, 0.1F, 100).unlockedBy(getHasName(BRONZE_PICKAXE), has(BRONZE_PICKAXE)).unlockedBy(getHasName(BRONZE_SHOVEL), has(BRONZE_SHOVEL)).unlockedBy(getHasName(BRONZE_AXE), has(BRONZE_AXE)).unlockedBy(getHasName(BRONZE_HOE), has(BRONZE_HOE)).unlockedBy(getHasName(BRONZE_SWORD), has(BRONZE_SWORD)).unlockedBy(getHasName(BRONZE_HELMET), has(BRONZE_HELMET)).unlockedBy(getHasName(BRONZE_CHESTPLATE), has(BRONZE_CHESTPLATE)).unlockedBy(getHasName(BRONZE_LEGGINGS), has(BRONZE_LEGGINGS)).unlockedBy(getHasName(BRONZE_BOOTS), has(BRONZE_BOOTS)).unlockedBy(getHasName(BRONZE_HORSE_ARMOR), has(BRONZE_HORSE_ARMOR)).save(recipeOutput,  MetalsAndAlloys.MOD_ID + ":" + getBlastingRecipeName(BRONZE_NUGGET));


        /* MANGANESE */
        List<ItemLike> MANGANESE_SMELTABLES = List.of(MANGANESE_ORE, DEEPSLATE_MANGANESE_ORE, RAW_MANGANESE);

        oreSmelting(recipeOutput, MANGANESE_SMELTABLES, RecipeCategory.MISC, MANGANESE_INGOT, 0.3f, 200, "manganese");
        oreBlasting(recipeOutput, MANGANESE_SMELTABLES, RecipeCategory.MISC, MANGANESE_INGOT, 0.3f, 100, "manganese");
        nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, MANGANESE_INGOT, RecipeCategory.BUILDING_BLOCKS, MANGANESE_BLOCK, "manganese_ingot_from_tin_block", "manganese_ingot");
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, RAW_MANGANESE, RecipeCategory.BUILDING_BLOCKS, RAW_MANGANESE_BLOCK);
        nineBlockStorageRecipesWithCustomPacking(recipeOutput, RecipeCategory.MISC, MANGANESE_NUGGET, RecipeCategory.MISC, MANGANESE_INGOT, "manganese_ingot_from_nuggets", "manganese_ingot");

        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_MANGANESE, MANGANESE_BLOCK);
        stairBuilder(CUT_MANGANESE_STAIRS, of(CUT_MANGANESE)).unlockedBy(getHasName(CUT_MANGANESE), has(CUT_MANGANESE)).save(recipeOutput);
        slabBuilder(CUT_MANGANESE_SLAB, of(CUT_MANGANESE)).unlockedBy(getHasName(CUT_MANGANESE), has(CUT_MANGANESE)).save(recipeOutput);

        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_MANGANESE_STAIRS, MANGANESE_BLOCK, 4);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_MANGANESE_SLAB, MANGANESE_BLOCK, 8);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_MANGANESE, MANGANESE_BLOCK, 4);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_MANGANESE_STAIRS, CUT_MANGANESE);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, CUT_MANGANESE_SLAB, CUT_MANGANESE, 2);

        doorBuilder(MANGANESE_DOOR, of(MANGANESE_INGOT)).unlockedBy(getHasName(MANGANESE_INGOT), has(MANGANESE_INGOT)).save(recipeOutput);
        trapdoorBuilder(MANGANESE_TRAPDOOR, of(MANGANESE_INGOT)).unlockedBy(getHasName(MANGANESE_INGOT), has(MANGANESE_INGOT)).save(recipeOutput);
        barsBuilder(MANGANESE_BARS, of(MANGANESE_INGOT)).unlockedBy(getHasName(MANGANESE_INGOT), has(MANGANESE_INGOT)).save(recipeOutput);
        chainBuilder(MANGANESE_CHAIN, of(MANGANESE_NUGGET), of(MANGANESE_INGOT)).unlockedBy(getHasName(MANGANESE_NUGGET), has(MANGANESE_NUGGET)).unlockedBy(getHasName(MANGANESE_INGOT), has(MANGANESE_INGOT)).save(recipeOutput);
        pressurePlate(recipeOutput, MANGANESE_PRESSURE_PLATE, MANGANESE_INGOT);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, MANGANESE_BUTTON).requires(STONE_BUTTON).requires(MANGANESE_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(MANGANESE_INGOT), has(MANGANESE_INGOT)).save(recipeOutput);
        grate(recipeOutput, MANGANESE_GRATE.get(), MANGANESE_BLOCK.get());
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, MANGANESE_GRATE, MANGANESE_BLOCK, 4);


        /* STEEL */
        List<ItemLike> PIG_IRON = List.of(IRON_INGOT);

        oreSmelting(recipeOutput, PIG_IRON, RecipeCategory.MISC, PIG_IRON_INGOT, 0.5f, 200, "pig_iron");
        oreBlasting(recipeOutput, PIG_IRON, RecipeCategory.MISC, PIG_IRON_INGOT, 0.5f, 100, "pig_iron");
        nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, STEEL_INGOT, RecipeCategory.BUILDING_BLOCKS, STEEL_BLOCK, "steel_ingot_from_steel_block", "steel_ingot");
        nineBlockStorageRecipesRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, PIG_IRON_INGOT, RecipeCategory.BUILDING_BLOCKS, PIG_IRON_BLOCK, "pig_iron_ingot_from_steel_block", "pig_iron_ingot");
        nineBlockStorageRecipesWithCustomPacking(recipeOutput, RecipeCategory.MISC, STEEL_NUGGET, RecipeCategory.MISC, STEEL_INGOT, "steel_ingot_from_nuggets", "steel_ingot");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, STEEL_PLATE, 3).requires(STEEL_INGOT, 3).unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, STEEL_PLATE_BLOCK, STEEL_PLATE);

        stairBuilder(STEEL_PLATE_STAIRS, of(STEEL_PLATE_BLOCK)).unlockedBy(getHasName(STEEL_PLATE_BLOCK), has(STEEL_PLATE_BLOCK)).save(recipeOutput);
        slabBuilder(STEEL_PLATE_SLAB, of(STEEL_PLATE_BLOCK)).unlockedBy(getHasName(STEEL_PLATE_BLOCK), has(STEEL_PLATE_BLOCK)).save(recipeOutput);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, STEEL_PLATE_STAIRS, STEEL_PLATE_BLOCK);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, STEEL_PLATE_SLAB, STEEL_PLATE_BLOCK,2);

        doorBuilder(STEEL_DOOR, of(STEEL_INGOT)).unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        trapdoorBuilder(STEEL_TRAPDOOR, of(STEEL_INGOT)).unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        barsBuilder(STEEL_BARS, of(STEEL_INGOT)).unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        chainBuilder(STEEL_CHAIN, of(STEEL_NUGGET), of(STEEL_INGOT)).unlockedBy(getHasName(STEEL_NUGGET), has(STEEL_NUGGET)).unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        pressurePlate(recipeOutput, STEEL_PRESSURE_PLATE, STEEL_INGOT);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, STEEL_BUTTON).requires(STONE_BUTTON).requires(STEEL_INGOT).unlockedBy(getHasName(STONE_BUTTON), has(STONE_BUTTON)).unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, STEEL_GRATE).define('I', STEEL_INGOT).pattern(" I ").pattern("I I").pattern(" I ").unlockedBy(getHasName(STEEL_INGOT), has(STEEL_INGOT)).save(recipeOutput);
        stonecutterRecipe(recipeOutput, RecipeCategory.BUILDING_BLOCKS, STEEL_GRATE, STEEL_BLOCK, 4);

        armor(recipeOutput, STEEL_INGOT, STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS);
        tool(recipeOutput, STEEL_INGOT, STEEL_SWORD, STEEL_SHOVEL, STEEL_PICKAXE, STEEL_AXE, STEEL_HOE);

        SimpleCookingRecipeBuilder.smelting(of(STEEL_PICKAXE, STEEL_SHOVEL, STEEL_AXE, STEEL_HOE, STEEL_SWORD, STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS, STEEL_HORSE_ARMOR), RecipeCategory.MISC, STEEL_NUGGET, 0.1F, 200).unlockedBy(getHasName(STEEL_PICKAXE), has(STEEL_PICKAXE)).unlockedBy(getHasName(STEEL_SHOVEL), has(STEEL_SHOVEL)).unlockedBy(getHasName(STEEL_AXE), has(STEEL_AXE)).unlockedBy(getHasName(STEEL_HOE), has(STEEL_HOE)).unlockedBy(getHasName(STEEL_SWORD), has(STEEL_SWORD)).unlockedBy(getHasName(STEEL_HELMET), has(STEEL_HELMET)).unlockedBy(getHasName(STEEL_CHESTPLATE), has(STEEL_CHESTPLATE)).unlockedBy(getHasName(STEEL_LEGGINGS), has(STEEL_LEGGINGS)).unlockedBy(getHasName(STEEL_BOOTS), has(STEEL_BOOTS)).unlockedBy(getHasName(STEEL_HORSE_ARMOR), has(STEEL_HORSE_ARMOR)).save(recipeOutput,  MetalsAndAlloys.MOD_ID + ":" + getSmeltingRecipeName(STEEL_NUGGET));
        SimpleCookingRecipeBuilder.blasting(of(STEEL_PICKAXE, STEEL_SHOVEL, STEEL_AXE, STEEL_HOE, STEEL_SWORD, STEEL_HELMET, STEEL_CHESTPLATE, STEEL_LEGGINGS, STEEL_BOOTS, STEEL_HORSE_ARMOR), RecipeCategory.MISC, STEEL_NUGGET, 0.1F, 100).unlockedBy(getHasName(STEEL_PICKAXE), has(STEEL_PICKAXE)).unlockedBy(getHasName(STEEL_SHOVEL), has(STEEL_SHOVEL)).unlockedBy(getHasName(STEEL_AXE), has(STEEL_AXE)).unlockedBy(getHasName(STEEL_HOE), has(STEEL_HOE)).unlockedBy(getHasName(STEEL_SWORD), has(STEEL_SWORD)).unlockedBy(getHasName(STEEL_HELMET), has(STEEL_HELMET)).unlockedBy(getHasName(STEEL_CHESTPLATE), has(STEEL_CHESTPLATE)).unlockedBy(getHasName(STEEL_LEGGINGS), has(STEEL_LEGGINGS)).unlockedBy(getHasName(STEEL_BOOTS), has(STEEL_BOOTS)).unlockedBy(getHasName(STEEL_HORSE_ARMOR), has(STEEL_HORSE_ARMOR)).save(recipeOutput,  MetalsAndAlloys.MOD_ID + ":" + getBlastingRecipeName(STEEL_NUGGET));

        /* Alloys */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_BRONZE).requires(RAW_TIN, 4).requires(RAW_COPPER, 4).unlockedBy(getHasName(RAW_TIN), has(RAW_TIN)).unlockedBy(getHasName(RAW_COPPER), has(RAW_COPPER)).save(recipeOutput, getAlloyingRecipeName(RAW_BRONZE));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, STEEL_INGOT).requires(PIG_IRON_INGOT, 4).requires(MANGANESE_INGOT, 4).unlockedBy(getHasName(PIG_IRON_INGOT), has(PIG_IRON_INGOT)).unlockedBy(getHasName(MANGANESE_INGOT), has(MANGANESE_INGOT)).save(recipeOutput, getAlloyingRecipeName(STEEL_INGOT));
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, MetalsAndAlloys.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void twoByTwoPacker(RecipeOutput recipeOutput, RecipeCategory category, ItemLike packed, ItemLike unpacked) {
        ShapedRecipeBuilder.shaped(category, packed, 4).define('#', unpacked).pattern("##").pattern("##").unlockedBy(getHasName(unpacked), has(unpacked)).save(recipeOutput);
    }

    protected static void nineBlockStorageRecipes(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed) {
        nineBlockStorageRecipes(recipeOutput, unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, getSimpleRecipeName(unpacked), null);
    }

    protected static void nineBlockStorageRecipesRecipesWithCustomUnpacking(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed, String unpackedName, String unpackedGroup) {
        nineBlockStorageRecipes(recipeOutput, unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, unpackedName, unpackedGroup);
    }

    protected static void nineBlockStorageRecipesWithCustomPacking(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed, String packedName, String packedGroup) {
        nineBlockStorageRecipes(recipeOutput, unpackedCategory, unpacked, packedCategory, packed, packedName, packedGroup, getSimpleRecipeName(unpacked), null);
    }

    protected static void nineBlockStorageRecipes(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed, String packedName, @Nullable String packedGroup, String unpackedName, @Nullable String unpackedGroup) {
        ShapelessRecipeBuilder.shapeless(unpackedCategory, unpacked, 9).requires(packed).group(unpackedGroup).unlockedBy(getHasName(packed), has(packed)).save(recipeOutput, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, unpackedName));
        ShapedRecipeBuilder.shaped(packedCategory, packed).define('#', unpacked).pattern("###").pattern("###").pattern("###").group(packedGroup).unlockedBy(getHasName(unpacked), has(unpacked)).save(recipeOutput, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, packedName));
    }

    private void armor(RecipeOutput recipeOutput, ItemLike ingredient, ItemLike helmet, ItemLike chestplate, ItemLike leggings, ItemLike boots) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, helmet).define('#', ingredient).pattern("###").pattern("# #").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, chestplate).define('#', ingredient).pattern("# #").pattern("###").pattern("###").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, leggings).define('#', ingredient).pattern("###").pattern("# #").pattern("# #").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, boots).define('#', ingredient).pattern("# #").pattern("# #").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
    }


    private void tool(RecipeOutput recipeOutput, ItemLike ingredient, ItemLike sword, ItemLike shovel, ItemLike pickaxe, ItemLike axe, ItemLike hoe) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, sword).define('#', ingredient).define('I', STICK).pattern("#").pattern("#").pattern("I").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, shovel).define('#', ingredient).define('I', STICK).pattern("#").pattern("I").pattern("I").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, pickaxe).define('#', ingredient).define('I', STICK).pattern("###").pattern(" I ").pattern(" I ").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, axe).define('#', ingredient).define('I', STICK).pattern("##").pattern("#I").pattern(" I").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, hoe).define('#', ingredient).define('I', STICK).pattern("##").pattern(" I").pattern(" I").unlockedBy(getHasName(ingredient), has(ingredient)).save(recipeOutput);
    }

    private static RecipeBuilder barsBuilder(ItemLike bars, Ingredient ingredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, bars, 16).define('#', ingredient).pattern("###").pattern("###");
    }

    protected static RecipeBuilder slabBuilder(ItemLike slab, Ingredient material) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slab, 6).define('#', material).pattern("###");
    }

    private static RecipeBuilder chainBuilder(ItemLike chains, Ingredient ingredient, Ingredient secondIngredient) {
        return ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, chains).define('I', ingredient).define('N', secondIngredient).pattern("I").pattern("N").pattern("I");
    }

    private void waxRecipe(RecipeOutput recipeOutput, ItemLike unwaxed, ItemLike waxed) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, waxed).requires(unwaxed).requires(HONEYCOMB).unlockedBy(getHasName(HONEYCOMB), has(HONEYCOMB)).save(recipeOutput, getModConversionRecipeName(waxed, HONEYCOMB));
    }

    private void stonecutterRecipe(RecipeOutput recipe, RecipeCategory category, ItemLike output, ItemLike input) {
        this.stonecutterRecipe(recipe, category, output, input, 1);
    }

    private void stonecutterRecipe(RecipeOutput recipe, RecipeCategory category, ItemLike output, ItemLike input, int count) {
        SingleItemRecipeBuilder var10000 = SingleItemRecipeBuilder.stonecutting(of(input), category, output, count).unlockedBy(getHasName(input), has(input));
        ResourceLocation var10002 = getModConversionRecipeName(output, input);
        var10000.save(recipe, var10002 + "_stonecutting");
    }

    public static ResourceLocation getModConversionRecipeName(ItemLike output, ItemLike input) {
        return ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, getConversionRecipeName(output, input));
    }

    public static ResourceLocation getAlloyingRecipeName(ItemLike output) {
        return ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, getItemName(output) + "_from_alloying");
    }
}
