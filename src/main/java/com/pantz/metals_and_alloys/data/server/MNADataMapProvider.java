package com.pantz.metals_and_alloys.data.server;

import com.pantz.metals_and_alloys.registry.MNABlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;
import net.neoforged.neoforge.registries.datamaps.builtin.Waxable;

import java.util.concurrent.CompletableFuture;

public class MNADataMapProvider extends DataMapProvider {
    public MNADataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        final var oxidizables = builder(NeoForgeDataMaps.OXIDIZABLES);
        final var waxables = builder(NeoForgeDataMaps.WAXABLES);

        MNABlocks.BLOCKS.getEntries().forEach(holder -> {
            if (holder.getId().getPath().startsWith("copper_")) {
                oxidizables.add(holder, new Oxidizable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "exposed_" + p))), false);
                oxidizables.add(holder.getId().withPath(p -> "exposed_" + p), new Oxidizable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "weathered_" + p))), false);
                oxidizables.add(holder.getId().withPath(p -> "weathered_" + p), new Oxidizable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "oxidized_" + p))), false);

                waxables.add(holder, new Waxable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "waxed_" + p))), false);
                waxables.add(holder.getId().withPath(p -> "exposed_" + p), new Waxable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "waxed_exposed_" + p))), false);
                waxables.add(holder.getId().withPath(p -> "weathered_" + p), new Waxable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "waxed_weathered_" + p))), false);
                waxables.add(holder.getId().withPath(p -> "oxidized_" + p), new Waxable(BuiltInRegistries.BLOCK.get(holder.getId().withPath(p -> "waxed_oxidized_" + p))), false);
            }
        });

    }
}
