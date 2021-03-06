package com.github.alphacode.magicraft.client.block.ore;

import com.github.alphacode.magicraft.Magicraft;
import com.github.alphacode.magicraft.creativetabs.MagicraftBlocksTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.*;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = "magicraft")
public class TinOre {
    @SubscribeEvent
    public void registerBlock(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(
                new Block(Material.ROCK).setRegistryName("magicraft", "tin_ore")
                        //设置方块硬度
                        .setHardness(1F)
                        .setCreativeTab(MagicraftBlocksTab.NATURE_BLOCKS)
                        .setRegistryName("magicraft","tin_ore")
        );



    }

}

