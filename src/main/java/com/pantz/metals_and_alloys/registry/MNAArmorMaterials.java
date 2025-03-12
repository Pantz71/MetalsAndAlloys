package com.pantz.metals_and_alloys.registry;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class MNAArmorMaterials {

    public static final Holder<ArmorMaterial> COPPER = register("copper", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.CHESTPLATE, 5);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.BOOTS, 1);
        attribute.put(ArmorItem.Type.BODY, 5);
    }), 7, 0f, 0f, SoundEvents.ARMOR_EQUIP_IRON, () -> Items.COPPER_INGOT);

    public static final Holder<ArmorMaterial> BRONZE = register("bronze", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.BOOTS, 1);
        attribute.put(ArmorItem.Type.BODY, 6);
    }), 10, 0f, 0f, SoundEvents.ARMOR_EQUIP_IRON, MNAItems.BRONZE_INGOT);

    public static final Holder<ArmorMaterial> STEEL = register("steel", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 3);
        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
        attribute.put(ArmorItem.Type.LEGGINGS, 6);
        attribute.put(ArmorItem.Type.BOOTS, 2);
        attribute.put(ArmorItem.Type.BODY, 7);
    }), 9, 1f, 0f, SoundEvents.ARMOR_EQUIP_IRON, MNAItems.STEEL_INGOT);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection, int enchantability, float toughness, float knockbackResistance, Holder<SoundEvent> equipSound, Supplier<Item> ingredientItem) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));
        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }
}
