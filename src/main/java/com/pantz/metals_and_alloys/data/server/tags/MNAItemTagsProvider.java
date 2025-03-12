package com.pantz.metals_and_alloys.data.server.tags;

import com.pantz.metals_and_alloys.MetalsAndAlloys;
import com.pantz.metals_and_alloys.registry.tags.MNAItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.pantz.metals_and_alloys.registry.MNAItems.*;


public class MNAItemTagsProvider extends ItemTagsProvider {
    public MNAItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, MetalsAndAlloys.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.TRIMMABLE_ARMOR).add(COPPER_HELMET.get(), COPPER_CHESTPLATE.get(), COPPER_LEGGINGS.get(), COPPER_BOOTS.get(),
                BRONZE_HELMET.get(), BRONZE_CHESTPLATE.get(), BRONZE_LEGGINGS.get(), BRONZE_BOOTS.get(),
                STEEL_HELMET.get(), STEEL_CHESTPLATE.get(), STEEL_LEGGINGS.get(), STEEL_BOOTS.get());
        tag(ItemTags.TRIM_MATERIALS).add(BRONZE_INGOT.get(), TIN_INGOT.get(), MANGANESE_INGOT.get(), PIG_IRON_INGOT.get(), STEEL_INGOT.get());
        tag(ItemTags.HEAD_ARMOR).add(COPPER_HELMET.get(), BRONZE_HELMET.get(), STEEL_HELMET.get());
        tag(ItemTags.CHEST_ARMOR).add(COPPER_CHESTPLATE.get(), BRONZE_CHESTPLATE.get(), STEEL_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR).add(COPPER_LEGGINGS.get(), BRONZE_LEGGINGS.get(), STEEL_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR).add(COPPER_BOOTS.get(), BRONZE_BOOTS.get(), STEEL_BOOTS.get());
        tag(ItemTags.SWORDS).add(COPPER_SWORD.get(), BRONZE_SWORD.get(), STEEL_SWORD.get());
        tag(ItemTags.SHOVELS).add(COPPER_SHOVEL.get(), BRONZE_SHOVEL.get(), STEEL_SHOVEL.get());
        tag(ItemTags.PICKAXES).add(COPPER_PICKAXE.get(), BRONZE_PICKAXE.get(), STEEL_PICKAXE.get());
        tag(ItemTags.AXES).add(COPPER_AXE.get(), BRONZE_AXE.get(), STEEL_AXE.get());
        tag(ItemTags.HOES).add(COPPER_HOE.get(), BRONZE_HOE.get(), STEEL_HOE.get());

        tag(MNAItemTags.INGOTS_TIN).add(TIN_INGOT.get());
        tag(MNAItemTags.INGOTS_BRONZE).add(BRONZE_INGOT.get());
        tag(MNAItemTags.INGOTS_MANGANESE).add(MANGANESE_INGOT.get());
        tag(MNAItemTags.INGOTS_PIG_IRON).add(PIG_IRON_INGOT.get());
        tag(MNAItemTags.INGOTS_STEEL).add(STEEL_INGOT.get());

        tag(MNAItemTags.NUGGETS_COPPER).add(COPPER_NUGGET.get());
        tag(MNAItemTags.NUGGETS_BRONZE).add(BRONZE_NUGGET.get());
        tag(MNAItemTags.NUGGETS_TIN).add(TIN_NUGGET.get());
        tag(MNAItemTags.NUGGETS_MANGANESE).add(MANGANESE_NUGGET.get());
        tag(MNAItemTags.NUGGETS_STEEL).add(STEEL_NUGGET.get());

        tag(MNAItemTags.RAW_MATERIALS_TIN).add(RAW_TIN.get());
        tag(MNAItemTags.RAW_MATERIALS_BRONZE).add(RAW_BRONZE.get());
        tag(MNAItemTags.RAW_MATERIALS_MANGANESE).add(RAW_MANGANESE.get());

        tag(Tags.Items.RAW_MATERIALS).addTag(MNAItemTags.RAW_MATERIALS_BRONZE).addTag(MNAItemTags.RAW_MATERIALS_TIN).addTag(MNAItemTags.RAW_MATERIALS_MANGANESE);
        tag(Tags.Items.INGOTS).addTag(MNAItemTags.INGOTS_BRONZE).addTag(MNAItemTags.INGOTS_TIN).addTag(MNAItemTags.INGOTS_MANGANESE).addTag(MNAItemTags.INGOTS_PIG_IRON).addTag(MNAItemTags.INGOTS_STEEL);
        tag(Tags.Items.NUGGETS).addTag(MNAItemTags.NUGGETS_TIN).addTag(MNAItemTags.NUGGETS_COPPER).addTag(MNAItemTags.NUGGETS_BRONZE).addTag(MNAItemTags.NUGGETS_MANGANESE).addTag(MNAItemTags.NUGGETS_STEEL);

        tag(ItemTags.BEACON_PAYMENT_ITEMS).add(BRONZE_INGOT.get(), STEEL_INGOT.get(), PIG_IRON_INGOT.get());

    }
}
