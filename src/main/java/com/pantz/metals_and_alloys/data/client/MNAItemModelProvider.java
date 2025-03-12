package com.pantz.metals_and_alloys.data.client;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.registry.MNAArmorMaterials;
import com.pantz.metals_and_alloys.registry.MNATrimMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.LinkedHashMap;

import static com.pantz.metals_and_alloys.registry.MNAItems.*;

public class MNAItemModelProvider extends ItemModelProvider {
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
    public MNAItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MetalsAndAlloys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        /* MISC */
        item(IRON_PLATE, "generated");
        item(COPPER_NUGGET, "generated");

        item(RAW_TIN, "generated");
        item(TIN_INGOT, "generated");
        item(TIN_NUGGET, "generated");

        item(RAW_BRONZE, "generated");
        item(BRONZE_INGOT, "generated");
        item(BRONZE_NUGGET, "generated");

        item(RAW_MANGANESE, "generated");
        item(MANGANESE_INGOT, "generated");
        item(MANGANESE_NUGGET, "generated");

        item(PIG_IRON_INGOT, "generated");
        item(STEEL_INGOT, "generated");
        item(STEEL_NUGGET, "generated");
        item(STEEL_PLATE, "generated");

        /* TOOLS */
        item(COPPER_SWORD, "handheld");
        item(COPPER_SHOVEL, "handheld");
        item(COPPER_PICKAXE, "handheld");
        item(COPPER_AXE, "handheld");
        item(COPPER_HOE, "handheld");

        item(BRONZE_SWORD, "handheld");
        item(BRONZE_SHOVEL, "handheld");
        item(BRONZE_PICKAXE, "handheld");
        item(BRONZE_AXE, "handheld");
        item(BRONZE_HOE, "handheld");

        item(STEEL_SWORD, "handheld");
        item(STEEL_SHOVEL, "handheld");
        item(STEEL_PICKAXE, "handheld");
        item(STEEL_AXE, "handheld");
        item(STEEL_HOE, "handheld");

        /* ARMOR */
        trimmedArmorItem(COPPER_HELMET);
        trimmedArmorItem(COPPER_CHESTPLATE);
        trimmedArmorItem(COPPER_LEGGINGS);
        trimmedArmorItem(COPPER_BOOTS);
        item(COPPER_HORSE_ARMOR, "generated");


        trimmedArmorItem(BRONZE_HELMET);
        trimmedArmorItem(BRONZE_CHESTPLATE);
        trimmedArmorItem(BRONZE_LEGGINGS);
        trimmedArmorItem(BRONZE_BOOTS);
        item(BRONZE_HORSE_ARMOR, "generated");

        trimmedArmorItem(STEEL_HELMET);
        trimmedArmorItem(STEEL_CHESTPLATE);
        trimmedArmorItem(STEEL_LEGGINGS);
        trimmedArmorItem(STEEL_BOOTS);
        item(STEEL_HORSE_ARMOR, "generated");



    }

    public ItemModelBuilder item(DeferredItem<? extends ItemLike> item, String type) {
        return withExistingParent(name(item.get()), "item/" + type).texture("layer0", itemTexture(item.get()));
    }

    public ItemModelBuilder item(DeferredItem<? extends ItemLike> item, String path, String type) {
        return withExistingParent(name(item.get()), "item/" + type).texture("layer0", ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, "item/" + path));
    }

    public ItemModelBuilder item(ResourceLocation location, String type) {
        return withExistingParent(location.getPath(), "item/" + type).texture("layer0", ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, "item/" + location.getPath()));
    }

    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = MetalsAndAlloys.MOD_ID; // Change this to your mod ID

        if (itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                boolean isCopperArmor = armorItem.getMaterial() == MNAArmorMaterials.COPPER;
                boolean isCopperTrim = trimMaterial == TrimMaterials.COPPER;

                boolean isBronzeArmor = armorItem.getMaterial() == MNAArmorMaterials.BRONZE;
                boolean isBronzeTrim = trimMaterial == MNATrimMaterials.BRONZE;

                boolean isSteelArmor = armorItem.getMaterial() == MNAArmorMaterials.STEEL;
                boolean isSteelTrim = trimMaterial == MNATrimMaterials.STEEL;


                String trimPath;
                String trimSuffix;
                if (isCopperArmor && isCopperTrim) {
                    trimPath = "trims/items/" + armorType + "_trim_copper_darker";
                    trimSuffix = "_copper_darker_trim";
                } else if (isBronzeArmor && isBronzeTrim) {
                    trimPath = "trims/items/" + armorType + "_trim_bronze_darker";
                    trimSuffix = "_bronze_darker_trim";
                } else if (isSteelArmor && isSteelTrim) {
                    trimPath = "trims/items/" + armorType + "_trim_steel_darker";
                    trimSuffix = "_steel_darker_trim";
                } else {
                    trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                    trimSuffix = "_" + trimMaterial.location().getPath() + "_trim";
                }



                String armorItemPath = armorItem.toString();
                String currentTrimName = armorItemPath + trimSuffix;
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath);
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemDeferredItem.getId().getPath(), mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace() + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }


    public static ResourceLocation key(ItemLike item) {
        return BuiltInRegistries.ITEM.getKey(item.asItem());
    }

    public static String name(ItemLike item) {
        return key(item).getPath();
    }

    public static ResourceLocation itemTexture(ItemLike item) {
        ResourceLocation name = key(item);
        return ResourceLocation.fromNamespaceAndPath(name.getNamespace(), "item/" + name.getPath());
    }
}
