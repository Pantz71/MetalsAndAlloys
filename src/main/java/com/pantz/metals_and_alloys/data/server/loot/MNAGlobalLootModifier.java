package com.pantz.metals_and_alloys.data.server.loot;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.registry.MNALootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.AddTableLootModifier;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class MNAGlobalLootModifier extends GlobalLootModifierProvider {
    public MNAGlobalLootModifier(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, MetalsAndAlloys.MOD_ID);
    }

    @Override
    protected void start() {
        add("add_metals_to_desert_pyramid", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.45f).build()
        }, MNALootTables.MEDIUM_METALS));
        add("add_metals_to_jungle_temple", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.55f).build()
        }, MNALootTables.MEDIUM_METALS));
        add("add_metals_to_stronghold", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, MNALootTables.SMALL_METALS));
        add("add_metals_to_shipwreck", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/shipwreck_supply")).build(),
                LootItemRandomChanceCondition.randomChance(0.7f).build()
        }, MNALootTables.LARGE_METALS));
        add("add_metals_to_underwater_ruin", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/underwater_ruin_small")).build(),
                LootItemRandomChanceCondition.randomChance(0.71f).build()
        }, MNALootTables.SMALL_METALS));
        add("add_metals_to_mineshaft", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, MNALootTables.MEDIUM_METALS));

        add("add_bronze_to_underwater_ruin", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/underwater_ruin_big")).build(),
                LootItemRandomChanceCondition.randomChance(0.59f).build()
        }, MNALootTables.BRONZE));

        add("add_bronze_to_mineshaft", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/abandoned_mineshaft")).build(),
                LootItemRandomChanceCondition.randomChance(0.517f).build()
        }, MNALootTables.BRONZE));

        add("add_steel_to_stronghold", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/stronghold_corridor")).build(),
                LootItemRandomChanceCondition.randomChance(0.6f).build()
        }, MNALootTables.STEEL));

        add("add_steel_to_dungeon", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.58f).build()
        }, MNALootTables.STEEL));

        add("add_horse_armor_to_dungeon", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/simple_dungeon")).build(),
                LootItemRandomChanceCondition.randomChance(0.567f).build()
        }, MNALootTables.HORSE_ARMOR));

        add("add_horse_armor_to_jungle_temple", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.578f).build()
        }, MNALootTables.HORSE_ARMOR));

        add("add_horse_armor_to_desert_pyramid", new AddTableLootModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(ResourceLocation.parse("chests/desert_pyramid")).build(),
                LootItemRandomChanceCondition.randomChance(0.67f).build()
        }, MNALootTables.HORSE_ARMOR));

    }


}
