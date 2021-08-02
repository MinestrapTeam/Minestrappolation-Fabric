package com.minestrappolation.block;

import com.minestrappolation.MinestrappolationMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks
{
    public static Block RED_ROCK;
    public static void loadBlocks() {
        RED_ROCK = registerWithItem("red_rock", new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f)));
    }

    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MinestrappolationMod.NAMESPACE, id), block);
    }

    private static Block registerWithItem(String id, Block block, ItemGroup itemGroup) {
        Block result = register(id, block);
        Registry.register(Registry.ITEM, new Identifier(MinestrappolationMod.NAMESPACE, id), new BlockItem(result, new FabricItemSettings().group(itemGroup)));
        return result;
    }

    private static Block registerWithItem(String id, Block block) {
        return registerWithItem(id, block, ItemGroup.MISC);
    }

}
