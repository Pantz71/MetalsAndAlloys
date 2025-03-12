package com.pantz.metals_and_alloys.util;

import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public interface MNAWeatheringCopper extends WeatheringCopper {
    default Optional<BlockState> getNext(BlockState state) {
        return CopperConversion.getWeatheredVersion(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }
}
