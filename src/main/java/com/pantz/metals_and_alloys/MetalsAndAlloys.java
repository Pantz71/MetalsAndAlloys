package com.pantz.metals_and_alloys;

import com.pantz.metals_and_alloys.data.client.MNABlockStateProvider;
import com.pantz.metals_and_alloys.data.client.MNAItemModelProvider;
import com.pantz.metals_and_alloys.data.client.MNALanguageProvider;
import com.pantz.metals_and_alloys.data.client.VanillaItemModelProvider;
import com.pantz.metals_and_alloys.data.server.*;
import com.pantz.metals_and_alloys.data.server.loot.MNAGlobalLootModifier;
import com.pantz.metals_and_alloys.data.server.tags.MNABlockTagsProvider;
import com.pantz.metals_and_alloys.data.server.tags.MNAItemTagsProvider;
import com.pantz.metals_and_alloys.registry.MNABlocks;
import com.pantz.metals_and_alloys.registry.MNAItems;
import com.pantz.metals_and_alloys.event.MNAClients;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.concurrent.CompletableFuture;

@Mod(MetalsAndAlloys.MOD_ID)
public class MetalsAndAlloys
{
    public static final String MOD_ID = "metals_and_alloys";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MetalsAndAlloys(IEventBus bus, ModContainer modContainer)
    {
        bus.addListener(this::commonSetup);
        bus.addListener(this::clientSetup);
        bus.addListener(this::dataSetup);

        NeoForge.EVENT_BUS.register(this);

        MNABlocks.register(bus);
        MNAItems.register(bus);

        modContainer.registerConfig(ModConfig.Type.COMMON, MNACommonConfig.CONFIG);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MNAClients.registerRenderLayers();
        });
    }

    private void dataSetup(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ExistingFileHelper helper = event.getExistingFileHelper();

        boolean client = event.includeClient();

        gen.addProvider(client, new MNABlockStateProvider(output, helper));
        gen.addProvider(client, new MNAItemModelProvider(output, helper));
        gen.addProvider(client, new VanillaItemModelProvider(output, helper));
        gen.addProvider(client, new MNALanguageProvider(output));

        boolean server = event.includeServer();


        BlockTagsProvider blockTagsProvider = new MNABlockTagsProvider(output, provider, helper);
        gen.addProvider(server, blockTagsProvider);
        gen.addProvider(server, new MNAItemTagsProvider(output, provider, blockTagsProvider.contentsGetter(), helper));
        gen.addProvider(server, new MNARecipeProvider(output, provider));
        gen.addProvider(server, new MNALootTableProvider(output, provider));
        gen.addProvider(server, new MNADataMapProvider(output, provider));
        gen.addProvider(server, new MNAGlobalLootModifier(output, provider));
        gen.addProvider(server, new MNAAdvancementProvider(output, provider, helper));
        gen.addProvider(server, new MNADatapackProvider(output, provider));
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
