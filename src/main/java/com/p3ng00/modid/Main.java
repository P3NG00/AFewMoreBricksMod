package com.p3ng00.modid;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

    public static final String MODID = "afewmorebricks";

    public static final Block BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.BRICKS));

    public static final Block TILES = BLOCK;
    public static final Block CRACKED_TILES = BLOCK;
    public static final Block MOSSY_TILES = BLOCK;

    public static final Block BIG_BRICKS = BLOCK;
    public static final Block CRACKED_BIG_BRICKS = BLOCK;
    public static final Block MOSSY_BIG_BRICKS = BLOCK;

    public static final Block CRACKED_BRICKS = BLOCK;
    public static final Block MOSSY_BRICKS = BLOCK;

    public static final Block MAGMA_BRICKS = BLOCK;
    public static final Block POLISHED_MAGMA_BRICKS = BLOCK;
    public static final Block POLISHED_MAGMA = BLOCK;

    @Override
    public void onInitialize() {

    }

    private static void createBlock() {
        return new Block()
    }

    private void register(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(MODID, name), block);
    }

}
