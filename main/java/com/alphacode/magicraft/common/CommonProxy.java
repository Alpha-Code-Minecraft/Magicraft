package com.github.alphacode.magicraft.common;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.github.alphacode.magicraft.register.BlocksRegister;
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event)
{
new BlocksRegister(event);
}

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
