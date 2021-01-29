package com.github.alphacode.magicraft.worldgen;
        import net.minecraftforge.common.MinecraftForge;
        import net.minecraftforge.event.terraingen.OreGenEvent;
        import net.minecraftforge.fml.common.eventhandler.Event;
        import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
public class WorldGeneratorLoader {
    public WorldGeneratorLoader()
    {
        MinecraftForge.ORE_GEN_BUS.register(this);
    }

    @SubscribeEvent
    public void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event)
    {
        if (event.getType() == OreGenEvent.GenerateMinable.EventType.ANDESITE)
        {
            event.setResult(Event.Result.DENY);
        }
    }
}
