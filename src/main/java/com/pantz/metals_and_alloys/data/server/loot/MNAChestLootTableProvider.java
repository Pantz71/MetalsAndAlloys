package com.pantz.metals_and_alloys.data.server.loot;

import com.pantz.metals_and_alloys.registry.MNABlocks;
import com.pantz.metals_and_alloys.registry.MNAItems;
import com.pantz.metals_and_alloys.registry.MNALootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public record MNAChestLootTableProvider(HolderLookup.Provider provider) implements LootTableSubProvider {
    public MNAChestLootTableProvider(HolderLookup.Provider provider) {
        this.provider = provider;
    }
    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        output.accept(
                MNALootTables.SMALL_METALS,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(UniformGenerator.between(0, 2))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_INGOT).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3)))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_NUGGET).setWeight(3)).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 7)))

                        )
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1))
                                        .add(LootItem.lootTableItem(MNAItems.MANGANESE_INGOT).setWeight(7)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 3)))
                                        .add(LootItem.lootTableItem(MNAItems.MANGANESE_NUGGET).setWeight(9)).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4)))
                        )
        );
        output.accept(
                MNALootTables.LARGE_METALS,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(UniformGenerator.between(1, 4))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_INGOT).setWeight(7)).apply(SetItemCountFunction.setCount(UniformGenerator.between(3, 5)))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_NUGGET).setWeight(6)).apply(SetItemCountFunction.setCount(UniformGenerator.between(3, 7)))
                                        .add(LootItem.lootTableItem(MNABlocks.TIN_BLOCK).setWeight(2)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3)))
                        )
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(2))
                                        .add(LootItem.lootTableItem(MNAItems.MANGANESE_NUGGET).setWeight(8)).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6)))
                                        .add(LootItem.lootTableItem(MNABlocks.MANGANESE_BLOCK).setWeight(2)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 1)))



                        )
        );
        output.accept(
                MNALootTables.MEDIUM_METALS,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(UniformGenerator.between(1, 5))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_INGOT).setWeight(4)).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4)))
                                        .add(LootItem.lootTableItem(MNAItems.TIN_NUGGET).setWeight(9)).apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 6)))
                                        .add(LootItem.lootTableItem(MNABlocks.TIN_BLOCK).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2)))

                        )
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(UniformGenerator.between(0, 2))
                                        .add(LootItem.lootTableItem(MNAItems.MANGANESE_INGOT).setWeight(2)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 5)))
                                        .add(LootItem.lootTableItem(MNAItems.MANGANESE_NUGGET).setWeight(4)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 4)))
                                        .add(LootItem.lootTableItem(MNABlocks.MANGANESE_BLOCK).setWeight(1)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 1)))


                        )
        );

        output.accept(
                MNALootTables.BRONZE,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(2))
                                        .add(LootItem.lootTableItem(MNAItems.BRONZE_INGOT).setWeight(4)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 5)))
                                        .add(LootItem.lootTableItem(MNAItems.BRONZE_NUGGET).setWeight(7)).apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 7)))

                        )
        );

        output.accept(
                MNALootTables.STEEL,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(UniformGenerator.between(0, 1))
                                        .add(LootItem.lootTableItem(MNAItems.STEEL_INGOT).setWeight(2)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 2)))
                                        .add(LootItem.lootTableItem(MNAItems.STEEL_NUGGET).setWeight(5)).apply(SetItemCountFunction.setCount(UniformGenerator.between(0, 5)))

                        )
        );

        output.accept(
                MNALootTables.HORSE_ARMOR,
                LootTable.lootTable()
                        .withPool(
                                LootPool.lootPool()
                                        .setRolls(UniformGenerator.between(0, 2))
                                        .add(LootItem.lootTableItem(MNAItems.COPPER_HORSE_ARMOR).setWeight(10)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .add(LootItem.lootTableItem(MNAItems.BRONZE_HORSE_ARMOR).setWeight(10)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))
                                        .add(LootItem.lootTableItem(MNAItems.STEEL_HORSE_ARMOR).setWeight(10)).apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)))

                        )
        );
    }
}
