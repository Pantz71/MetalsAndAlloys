package com.pantz.metals_and_alloys.data.server;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.registry.MNATrimMaterials;
import com.pantz.metals_and_alloys.worldgen.MNABiomeModifiers;
import com.pantz.metals_and_alloys.worldgen.MNAConfiguredFeatures;
import com.pantz.metals_and_alloys.worldgen.MNAPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class MNADatapackProvider extends DatapackBuiltinEntriesProvider {
    public MNADatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MetalsAndAlloys.MOD_ID));
    }

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, MNAConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, MNAPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, MNABiomeModifiers::bootstrap)
            .add(Registries.TRIM_MATERIAL, MNATrimMaterials::bootstrap);
}
