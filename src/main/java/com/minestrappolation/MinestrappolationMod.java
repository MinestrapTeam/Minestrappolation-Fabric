package com.minestrappolation;

import com.minestrappolation.block.Blocks;
import net.fabricmc.api.ModInitializer;

public class MinestrappolationMod implements ModInitializer {
    public static final String NAMESPACE = "minestrappolation";

    @Override
    public void onInitialize() {
        Blocks.loadBlocks();
    }
}
