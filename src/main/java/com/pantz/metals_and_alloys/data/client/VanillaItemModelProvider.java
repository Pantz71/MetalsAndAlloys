package com.pantz.metals_and_alloys.data.client;

import com.pantz.metals_and_alloys.registry.MNATrimMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.LinkedHashMap;

public class VanillaItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(MNATrimMaterials.TIN, 0.11f);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(MNATrimMaterials.STEEL, 0.21F);
        trimMaterials.put(MNATrimMaterials.PIG_IRON, 0.22F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(MNATrimMaterials.BRONZE, 0.51F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(MNATrimMaterials.MANGANESE, 0.91F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public VanillaItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, "minecraft", existingFileHelper);
    }

    @Override
    protected void registerModels() {

        trimmedArmorItem((ArmorItem) Items.LEATHER_HELMET);
        trimmedArmorItem((ArmorItem) Items.LEATHER_CHESTPLATE);
        trimmedArmorItem((ArmorItem) Items.LEATHER_LEGGINGS);
        trimmedArmorItem((ArmorItem) Items.LEATHER_BOOTS);
        trimmedArmorItem((ArmorItem) Items.CHAINMAIL_HELMET);
        trimmedArmorItem((ArmorItem) Items.CHAINMAIL_CHESTPLATE);
        trimmedArmorItem((ArmorItem) Items.CHAINMAIL_LEGGINGS);
        trimmedArmorItem((ArmorItem) Items.CHAINMAIL_BOOTS);
        trimmedArmorItem((ArmorItem) Items.IRON_HELMET);
        trimmedArmorItem((ArmorItem) Items.IRON_CHESTPLATE);
        trimmedArmorItem((ArmorItem) Items.IRON_LEGGINGS);
        trimmedArmorItem((ArmorItem) Items.IRON_BOOTS);
        trimmedArmorItem((ArmorItem) Items.GOLDEN_HELMET);
        trimmedArmorItem((ArmorItem) Items.GOLDEN_CHESTPLATE);
        trimmedArmorItem((ArmorItem) Items.GOLDEN_LEGGINGS);
        trimmedArmorItem((ArmorItem) Items.GOLDEN_BOOTS);
        trimmedArmorItem((ArmorItem) Items.DIAMOND_HELMET);
        trimmedArmorItem((ArmorItem) Items.DIAMOND_CHESTPLATE);
        trimmedArmorItem((ArmorItem) Items.DIAMOND_LEGGINGS);
        trimmedArmorItem((ArmorItem) Items.DIAMOND_BOOTS);
        trimmedArmorItem((ArmorItem) Items.NETHERITE_HELMET);
        trimmedArmorItem((ArmorItem) Items.NETHERITE_CHESTPLATE);
        trimmedArmorItem((ArmorItem) Items.NETHERITE_LEGGINGS);
        trimmedArmorItem((ArmorItem) Items.NETHERITE_BOOTS);
        trimmedArmorItem((ArmorItem) Items.TURTLE_HELMET);

    }

    private void trimmedArmorItem(ArmorItem armorItem) {
        ResourceLocation armorItemResLoc = BuiltInRegistries.ITEM.getKey(armorItem);

        trimMaterials.forEach((trimMaterial, value) -> {
            float trimValue = value;

            String armorType = switch (armorItem.getEquipmentSlot()) {
                case HEAD -> "helmet";
                case CHEST -> "chestplate";
                case LEGS -> "leggings";
                case FEET -> "boots";
                default -> "";
            };

            boolean isDiamondArmor = armorItem.getMaterial() == ArmorMaterials.DIAMOND;
            boolean isDiamondTrim = trimMaterial == TrimMaterials.DIAMOND;

            boolean isGoldenArmor = armorItem.getMaterial() == ArmorMaterials.GOLD;
            boolean isGoldTrim = trimMaterial == TrimMaterials.GOLD;

            boolean isIronArmor = armorItem.getMaterial() == ArmorMaterials.IRON;
            boolean isIronTrim = trimMaterial == TrimMaterials.IRON;

            boolean isNetheriteArmor = armorItem.getMaterial() == ArmorMaterials.NETHERITE;
            boolean isNetheriteTrim = trimMaterial == TrimMaterials.NETHERITE;

            boolean isLeatherArmor = armorItem.getMaterial() == ArmorMaterials.LEATHER;


            String trimPath;
            String trimSuffix;
            if (isDiamondArmor && isDiamondTrim) {
                trimPath = "trims/items/" + armorType + "_trim_diamond_darker";
                trimSuffix = "_diamond_darker_trim";
            } else if (isGoldenArmor && isGoldTrim) {
                trimPath = "trims/items/" + armorType + "_trim_gold_darker";
                trimSuffix = "_gold_darker_trim";
            } else if (isIronArmor && isIronTrim) {
                trimPath = "trims/items/" + armorType + "_trim_iron_darker";
                trimSuffix = "_iron_darker_trim";
            } else if (isNetheriteArmor && isNetheriteTrim) {
                trimPath = "trims/items/" + armorType + "_trim_netherite_darker";
                trimSuffix = "_netherite_darker_trim";
            } else {
                trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                trimSuffix = "_" + trimMaterial.location().getPath() + "_trim";
            }

            String currentTrimName = armorItemResLoc.getPath() + trimSuffix;
            ResourceLocation trimResLoc = ResourceLocation.withDefaultNamespace(trimPath);
            ResourceLocation trimNameResLoc = ResourceLocation.withDefaultNamespace("item/" + currentTrimName);

            existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

            getBuilder(currentTrimName)
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                    .texture("layer1", trimResLoc);

            this.withExistingParent(armorItemResLoc.getPath(), mcLoc("item/generated"))
                    .override()
                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getPath()))
                    .predicate(mcLoc("trim_type"), trimValue).end()
                    .texture("layer0", ResourceLocation.withDefaultNamespace("item/" + armorItemResLoc.getPath()));

            if (isLeatherArmor) {
            this.withExistingParent(armorItemResLoc.getPath(), mcLoc("item/generated"))
                    .override()
                    .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getPath()))
                    .predicate(mcLoc("trim_type"), trimValue).end()
                    .texture("layer0", ResourceLocation.withDefaultNamespace("item/leather_" + armorType))
                    .texture("layer1", ResourceLocation.withDefaultNamespace("item/leather_" + armorType + "_overlay"));

            }

        });

    }
}
