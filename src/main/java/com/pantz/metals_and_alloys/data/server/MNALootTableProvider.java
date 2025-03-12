package com.pantz.metals_and_alloys.data.server;

import com.google.common.collect.ImmutableList;
import com.pantz.metals_and_alloys.data.server.loot.MNAArchaeologyLootTableProvider;
import com.pantz.metals_and_alloys.data.server.loot.MNABlockLootTableProvider;
import com.pantz.metals_and_alloys.data.server.loot.MNAChestLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.concurrent.CompletableFuture;

public class MNALootTableProvider extends LootTableProvider {
    public MNALootTableProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, BuiltInLootTables.all(), ImmutableList.of(
                new LootTableProvider.SubProviderEntry(MNABlockLootTableProvider::new, LootContextParamSets.BLOCK),
                new LootTableProvider.SubProviderEntry(MNAArchaeologyLootTableProvider::new, LootContextParamSets.ARCHAEOLOGY),
                new LootTableProvider.SubProviderEntry(MNAChestLootTableProvider::new, LootContextParamSets.CHEST)
        ), pRegistries);
    }

    @Override
    protected void validate(WritableRegistry<LootTable> writableregistry, ValidationContext validationcontext, ProblemReporter.Collector problemreporter$collector) {
    }
}
