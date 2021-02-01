package com.github.alphacode.magicraft.client.item.powder;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.Item;

@Mod.EventBusSubscriber(modid = "magicraft")
public class Salt extends Item{
    private Object salt;
    @SubscribeEvent
    public void registerBlock(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(
                new Item().setRegistryName("magicraft", "salt")


        );


    }




}


