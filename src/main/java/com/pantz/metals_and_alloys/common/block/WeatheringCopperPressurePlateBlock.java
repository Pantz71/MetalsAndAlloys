package com.pantz.metals_and_alloys.common.block;

import com.pantz.metals_and_alloys.util.MNAWeatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.WeightedPressurePlateBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WeatheringCopperPressurePlateBlock extends WeightedPressurePlateBlock implements MNAWeatheringCopper {
    private final WeatherState weatherState;
    public WeatheringCopperPressurePlateBlock(WeatherState weatherState, Properties properties) {
        super(50, BlockSetType.COPPER, properties);
        this.weatherState = weatherState;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        changeOverTime(state, level, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return weatherState;
    }
}
