package com.pantz.metals_and_alloys.event;

import com.pantz.metals_and_alloys.registry.MNABlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

@SuppressWarnings({"unsafe", "deprecated"})
public class MNAClients {
    public static void registerRenderLayers() {
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.IRON_GRATE.get(), RenderType.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.GOLD_GRATE.get(), RenderType.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.GOLD_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.GOLD_DOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.GOLD_BARS.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.COPPER_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.EXPOSED_COPPER_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WEATHERED_COPPER_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.OXIDIZED_COPPER_CHAIN.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_COPPER_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_EXPOSED_COPPER_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_WEATHERED_COPPER_CHAIN.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_OXIDIZED_COPPER_CHAIN.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.COPPER_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.EXPOSED_COPPER_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WEATHERED_COPPER_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.OXIDIZED_COPPER_BARS.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_COPPER_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_EXPOSED_COPPER_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_WEATHERED_COPPER_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.WAXED_OXIDIZED_COPPER_BARS.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.TIN_GRATE.get(), RenderType.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.TIN_DOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.TIN_TRAPDOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.TIN_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.TIN_CHAIN.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.BRONZE_GRATE.get(), RenderType.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.BRONZE_DOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.BRONZE_TRAPDOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.BRONZE_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.BRONZE_CHAIN.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.MANGANESE_GRATE.get(), RenderType.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.MANGANESE_DOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.MANGANESE_TRAPDOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.MANGANESE_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.MANGANESE_CHAIN.get(), RenderType.CUTOUT);

        ItemBlockRenderTypes.setRenderLayer(MNABlocks.STEEL_GRATE.get(), RenderType.TRANSLUCENT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.STEEL_DOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.STEEL_TRAPDOOR.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.STEEL_BARS.get(), RenderType.CUTOUT);
        ItemBlockRenderTypes.setRenderLayer(MNABlocks.STEEL_CHAIN.get(), RenderType.CUTOUT);


    }
}
