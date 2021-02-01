package com.github.alphacode.magicraft.register;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ModelsRegister {
    public ModelsRegister() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        registerModel(ItemsRegister.COPPER_INGOT);registerModel(ItemsRegister.SILVER_INGOT);registerModel(ItemsRegister.TIN_INGOT);registerModel(ItemsRegister.LEAD_INGOT);
        registerModel(ItemsRegister.SALT);registerModel(ItemsRegister.CINNABAR);registerModel(ItemsRegister.SULFUR);
    }

    private void registerModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
