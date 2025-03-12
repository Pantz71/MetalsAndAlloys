package com.pantz.metals_and_alloys;

import net.neoforged.neoforge.common.ModConfigSpec;

@SuppressWarnings("deprecated")
public class MNACommonConfig
{
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec CONFIG;



    static {
        BUILDER.push("Metals & Alloys Configs");


        BUILDER.pop();
        CONFIG = BUILDER.build();

    }
}
