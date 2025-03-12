package com.pantz.metals_and_alloys.util;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;
import net.minecraft.world.level.block.Block;

import java.util.Optional;
import java.util.function.Supplier;

import static com.pantz.metals_and_alloys.registry.MNABlocks.*;

public class CopperConversion {
    private static final Supplier<BiMap<Block, Block>> WEATHERING_BLOCKS = Suppliers.memoize(() -> ImmutableBiMap.<Block, Block>builder()
            .put(COPPER_BARS.get(), EXPOSED_COPPER_BARS.get())
            .put(EXPOSED_COPPER_BARS.get(), WEATHERED_COPPER_BARS.get())
            .put(WEATHERED_COPPER_BARS.get(), OXIDIZED_COPPER_BARS.get())
            .put(COPPER_BUTTON.get(), EXPOSED_COPPER_BUTTON.get())
            .put(EXPOSED_COPPER_BUTTON.get(), WEATHERED_COPPER_BUTTON.get())
            .put(WEATHERED_COPPER_BUTTON.get(), OXIDIZED_COPPER_BUTTON.get())
            .put(COPPER_PRESSURE_PLATE.get(), EXPOSED_COPPER_PRESSURE_PLATE.get())
            .put(EXPOSED_COPPER_PRESSURE_PLATE.get(), WEATHERED_COPPER_PRESSURE_PLATE.get())
            .put(WEATHERED_COPPER_PRESSURE_PLATE.get(), OXIDIZED_COPPER_PRESSURE_PLATE.get())
            .put(COPPER_CHAIN.get(), EXPOSED_COPPER_CHAIN.get())
            .put(EXPOSED_COPPER_CHAIN.get(), WEATHERED_COPPER_CHAIN.get())
            .put(WEATHERED_COPPER_CHAIN.get(), OXIDIZED_COPPER_CHAIN.get())
            .build());
    public static Optional<Block> getWeatheredVersion(Block block) {
        return Optional.ofNullable(WEATHERING_BLOCKS.get().get(block));
    }

}
