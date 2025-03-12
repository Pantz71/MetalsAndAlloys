package com.pantz.metals_and_alloys.registry.tags;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class MNAItemTags {
    public static final TagKey<Item> INGOTS_TIN = tagKey("ingots/tin");
    public static final TagKey<Item> INGOTS_BRONZE = tagKey("ingots/bronze");
    public static final TagKey<Item> INGOTS_MANGANESE = tagKey("ingots/manganese");
    public static final TagKey<Item> INGOTS_PIG_IRON = tagKey("ingots/pig_iron");
    public static final TagKey<Item> INGOTS_STEEL = tagKey("ingots/steel");

    public static final TagKey<Item> NUGGETS_COPPER = tagKey("nuggets/copper");
    public static final TagKey<Item> NUGGETS_TIN = tagKey("nuggets/tin");
    public static final TagKey<Item> NUGGETS_BRONZE = tagKey("nuggets/bronze");
    public static final TagKey<Item> NUGGETS_MANGANESE = tagKey("nuggets/manganese");
    public static final TagKey<Item> NUGGETS_STEEL = tagKey("nuggets/steel");

    public static final TagKey<Item> RAW_MATERIALS_TIN = tagKey("raw_materials/tin");
    public static final TagKey<Item> RAW_MATERIALS_BRONZE = tagKey("raw_materials/bronze");
    public static final TagKey<Item> RAW_MATERIALS_MANGANESE = tagKey("raw_materials/manganese");


    private static TagKey<Item> tagKey(String name) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
    }

    public static TagKey<Item> create(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name));
    }
}
