package com.pantz.metals_and_alloys.registry;

import com.pantz.metals_and_alloys.registry.tags.MNABlockTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class MNAToolTiers {

    public static final Tier COPPER = new SimpleTier(MNABlockTags.INCORRECT_FOR_COPPER_TOOL,
            235, 5f, 1.5f, 7,
            () -> Ingredient.of(Items.COPPER_INGOT));

    public static final Tier BRONZE = new SimpleTier(BlockTags.INCORRECT_FOR_IRON_TOOL,
            274, 4f, 2f, 10,
            () -> Ingredient.of(MNAItems.BRONZE_INGOT));

    public static final Tier STEEL = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            658, 6f, 2.5f, 9,
            () -> Ingredient.of(MNAItems.STEEL_INGOT));
}
