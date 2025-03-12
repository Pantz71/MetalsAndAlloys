package com.pantz.metals_and_alloys.registry;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;

import java.util.Map;

public class MNATrimMaterials {
    public static final ResourceKey<TrimMaterial> TIN = registryKey("tin");
    public static final ResourceKey<TrimMaterial> BRONZE = registryKey("bronze");
    public static final ResourceKey<TrimMaterial> MANGANESE = registryKey("manganese");
    public static final ResourceKey<TrimMaterial> STEEL = registryKey("steel");
    public static final ResourceKey<TrimMaterial> PIG_IRON = registryKey("pig_iron");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, TIN, MNAItems.TIN_INGOT.get(), Style.EMPTY.withColor(0xc8d5dd), 0.11f);
        register(context, BRONZE, MNAItems.BRONZE_INGOT.get(), Style.EMPTY.withColor(0xc28540), 0.51f, Map.of(MNAArmorMaterials.BRONZE, "bronze_darker"));
        register(context, MANGANESE, MNAItems.MANGANESE_INGOT.get(), Style.EMPTY.withColor(0xe7b3e2), 0.91f);
        register(context, STEEL, MNAItems.STEEL_INGOT.get(), Style.EMPTY.withColor(0x4c4c4c), 0.21f, Map.of(MNAArmorMaterials.STEEL, "steel_darker"));
        register(context, PIG_IRON, MNAItems.PIG_IRON_INGOT.get(), Style.EMPTY.withColor(0x918591), 0.22f);

    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex) {
        register(context, materialKey, ingredient, style, itemModelIndex, Map.of());
    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> materialKey, Item ingredient, Style style, float itemModelIndex, Map<Holder<ArmorMaterial>, String> overrideArmorMaterials) {
        TrimMaterial trimmaterial = TrimMaterial.create(materialKey.location().getPath(), ingredient, itemModelIndex, Component.translatable(Util.makeDescriptionId("trim_material", materialKey.location())).withStyle(style), overrideArmorMaterials);
        context.register(materialKey, trimmaterial);
    }

    private static ResourceKey<TrimMaterial> registryKey(String key) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MetalsAndAlloys.MOD_ID, key));
    }
}
