package com.github.alphacode.magicraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.github.alphacode.magicraft.common.CommonProxy;
/**
 * @author AlphaCode:JasonAlpha
 */
@Mod(modid = Magicraft.MODID, name = Magicraft.NAME, version = "0.0.1", acceptedMinecraftVersions = "1.12.2",dependencies = "patchouli,baubles")
public class Magicraft {
    public static final String MODID = "magicraft";
    public static final String NAME = "Magicraft";
    public static final String VERSION = "0.0.1";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = "com.github.alphacode.magicraft.client.ClientProxy",
            serverSide = "com.github.alphacode.magicraft.common.CommonProxy")
    public static CommonProxy proxy;
}
