package com.github.alphacode.magicraft.register;

import com.github.alphacode.magicraft.client.item.ingot.CopperIngot;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.github.alphacode.magicraft.client.item.ingot.*;
import org.graalvm.compiler.asm.aarch64.AArch64Assembler;
import  net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod.EventBusSubscriber
public class ItemsRegister {
    public static final Item COPPER_INGOT = new Item();
    public static final Item SILVER_INGOT = new Item();
    public static final Item TIN_INGOT = new Item();
    public static final Item LEAD_INGOT = new Item();
    public static final Item SALT = new Item();
    public static final Item CINNABAR = new Item();
    public static final Item SULFUR = new Item();
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                COPPER_INGOT, SILVER_INGOT, TIN_INGOT, LEAD_INGOT,
                SALT,CINNABAR,SULFUR
        );

}


public ItemsRegister(FMLPreInitializationEvent event) {

    }

}
