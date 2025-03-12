package com.pantz.metals_and_alloys.data.server.loot;

import com.pantz.metals_and_alloys.registry.MNAItems;
import com.pantz.metals_and_alloys.registry.MNALootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

import java.util.function.BiConsumer;

public record MNAArchaeologyLootTableProvider(HolderLookup.Provider registries) implements LootTableSubProvider {
    public MNAArchaeologyLootTableProvider(HolderLookup.Provider registries) {
        this.registries = registries;
    }
    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        output.accept(
                MNALootTables.METALS_ARCHAEOLOGY,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1))
                                        .add(LootItem.lootTableItem(MNAItems.BRONZE_INGOT).setWeight(2))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_INGOT).setWeight(2))
                                        .add(LootItem.lootTableItem(MNAItems.MANGANESE_INGOT).setWeight(2))

                        )
        );
    }
}
