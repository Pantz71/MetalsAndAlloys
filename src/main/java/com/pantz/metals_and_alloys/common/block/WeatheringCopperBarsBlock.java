package com.pantz.metals_and_alloys.common.block;

import com.pantz.metals_and_alloys.util.CopperConversion;
import com.pantz.metals_and_alloys.util.MNAWeatheringCopper;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringCopperBarsBlock extends IronBarsBlock implements MNAWeatheringCopper {
    private final WeatherState weatherState;
    public WeatheringCopperBarsBlock(WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }


    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        changeOverTime(state, level, pos, random);
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return CopperConversion.getWeatheredVersion(state.getBlock()).isPresent();
    }

    @Override
    public WeatherState getAge() {
        return weatherState;
    }
}
