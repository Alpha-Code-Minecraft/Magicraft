package com.github.alphacode.magicraft.common;
import com.github.alphacode.magicraft.register.BlocksRegister;
import com.github.alphacode.magicraft.register.ItemsRegister;
import  net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
{   new ItemsRegister(event);
    new BlocksRegister(event);
}

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
