package com.pantz.metals_and_alloys.registry;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.HashSet;
import java.util.Set;

public class MNALootTables {
    private static final Set<ResourceKey<LootTable>> LOCATIONS = new HashSet<>();
    public static final ResourceKey<LootTable> SMALL_METALS = register("chests/small_metals");
    public static final ResourceKey<LootTable> MEDIUM_METALS = register("chests/medium_metals");
    public static final ResourceKey<LootTable> LARGE_METALS = register("chests/large_metals");
    public static final ResourceKey<LootTable> STEEL = register("chests/steel");
    public static final ResourceKey<LootTable> BRONZE = register("chests/bronze");
    public static final ResourceKey<LootTable> METALS_ARCHAEOLOGY = register("archaeology/metals_archaeology");
    public static final ResourceKey<LootTable> HORSE_ARMOR = register("chests/horse_armor");

    private static ResourceKey<LootTable> register(String name) {
        return register(ResourceKey.create(Registries.LOOT_TABLE, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name)));
    }

    private static ResourceKey<LootTable> register(ResourceKey<LootTable> name) {
        if (LOCATIONS.add(name)) {
            return name;
        } else {
            throw new IllegalArgumentException(name.location() + " is already a registered built-in loot table");
        }
    }
}
