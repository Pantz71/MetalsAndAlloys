package com.pantz.metals_and_alloys.registry;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MNAItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MetalsAndAlloys.MOD_ID);



    public static final DeferredItem<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(MNAToolTiers.COPPER, new Item.Properties().attributes(SwordItem.createAttributes(MNAToolTiers.COPPER, 3f, -2.4f))));
    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(MNAToolTiers.COPPER, new Item.Properties().attributes(ShovelItem.createAttributes(MNAToolTiers.COPPER, 1.5f, -3f))));
    public static final DeferredItem<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(MNAToolTiers.COPPER, new Item.Properties().attributes(PickaxeItem.createAttributes(MNAToolTiers.COPPER, 1f, -2.8f))));
    public static final DeferredItem<Item> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(MNAToolTiers.COPPER, new Item.Properties().attributes(AxeItem.createAttributes(MNAToolTiers.COPPER, 7.2f, -3.2f))));
    public static final DeferredItem<Item> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(MNAToolTiers.COPPER, new Item.Properties().attributes(HoeItem.createAttributes(MNAToolTiers.COPPER, -0.5f, -4f))));

    public static final DeferredItem<ArmorItem> COPPER_HELMET = ITEMS.register("copper_helmet", () -> new ArmorItem(MNAArmorMaterials.COPPER, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(13))));
    public static final DeferredItem<ArmorItem> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", () -> new ArmorItem(MNAArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(13))));
    public static final DeferredItem<ArmorItem> COPPER_LEGGINGS = ITEMS.register("copper_leggings", () -> new ArmorItem(MNAArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(13))));
    public static final DeferredItem<ArmorItem> COPPER_BOOTS = ITEMS.register("copper_boots", () -> new ArmorItem(MNAArmorMaterials.COPPER, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(13))));
    public static final DeferredItem<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor", () -> new AnimalArmorItem(MNAArmorMaterials.COPPER, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BRONZE = ITEMS.register("raw_bronze", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties()));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(MNAArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15))));
    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(MNAArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15))));
    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(MNAArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15))));
    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(MNAArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15))));
    public static final DeferredItem<Item> BRONZE_HORSE_ARMOR = ITEMS.register("bronze_horse_armor", () -> new AnimalArmorItem(MNAArmorMaterials.BRONZE, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(MNAToolTiers.BRONZE, new Item.Properties().attributes(SwordItem.createAttributes(MNAToolTiers.BRONZE, 3f, -2.4f))));
    public static final DeferredItem<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(MNAToolTiers.BRONZE, new Item.Properties().attributes(ShovelItem.createAttributes(MNAToolTiers.BRONZE, 1.5f, -3f))));
    public static final DeferredItem<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(MNAToolTiers.BRONZE, new Item.Properties().attributes(PickaxeItem.createAttributes(MNAToolTiers.BRONZE, 1f, -2.8f))));
    public static final DeferredItem<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(MNAToolTiers.BRONZE, new Item.Properties().attributes(AxeItem.createAttributes(MNAToolTiers.BRONZE, 7f, -3.2f))));
    public static final DeferredItem<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(MNAToolTiers.BRONZE, new Item.Properties().attributes(HoeItem.createAttributes(MNAToolTiers.BRONZE, -1f, -3f))));

    public static final DeferredItem<Item> RAW_MANGANESE = ITEMS.register("raw_manganese", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MANGANESE_NUGGET = ITEMS.register("manganese_nugget", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PIG_IRON_INGOT = ITEMS.register("pig_iron_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties()));

    public static final DeferredItem<ArmorItem> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(MNAArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(17))));
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(MNAArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(17))));
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(MNAArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(17))));
    public static final DeferredItem<ArmorItem> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(MNAArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(17))));
    public static final DeferredItem<Item> STEEL_HORSE_ARMOR = ITEMS.register("steel_horse_armor", () -> new AnimalArmorItem(MNAArmorMaterials.STEEL, AnimalArmorItem.BodyType.EQUESTRIAN, false, new Item.Properties().stacksTo(1)));

    public static final DeferredItem<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(MNAToolTiers.STEEL, new Item.Properties().attributes(SwordItem.createAttributes(MNAToolTiers.STEEL, 3f, -2.4f))));
    public static final DeferredItem<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(MNAToolTiers.STEEL, new Item.Properties().attributes(ShovelItem.createAttributes(MNAToolTiers.STEEL, 1.5f, -3f))));
    public static final DeferredItem<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(MNAToolTiers.STEEL, new Item.Properties().attributes(PickaxeItem.createAttributes(MNAToolTiers.STEEL, 1f, -2.8f))));
    public static final DeferredItem<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(MNAToolTiers.STEEL, new Item.Properties().attributes(AxeItem.createAttributes(MNAToolTiers.STEEL, 6.5f, -3.1f))));
    public static final DeferredItem<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(MNAToolTiers.STEEL, new Item.Properties().attributes(HoeItem.createAttributes(MNAToolTiers.STEEL, -1.5f, -5f))));


    public static void register(IEventBus event) {
        ITEMS.register(event);
    }
}
