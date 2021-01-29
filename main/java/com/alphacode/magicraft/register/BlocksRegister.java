package com.github.alphacode.magicraft.register;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
    @Mod.EventBusSubscriber
    public class BlocksRegister {
        private static Object CopperOre;
        private static Object TinOre;
        private static Object LeadOre;
        private static Object SilverOre;
        private static Object CinnabarOre;
        private static Object SaltOre;
        private static Object SulfurOre;
        //实例化方块
        public static final Block COPPER_ORE = new Block((Material) CopperOre);
        public static final Block TIN_ORE = new Block((Material) TinOre);
        public static final Block LEAD_ORE = new Block((Material) LeadOre);
        public static final Block SILVER_ORE = new Block((Material) SilverOre);
        public static final Block CINNABAR_ORE = new Block((Material) CinnabarOre);
        public static final Block SALT_ORE = new Block((Material) SaltOre);
        public static final Block SULFUR_ORE = new Block((Material) SulfurOre);
        public BlocksRegister(FMLPreInitializationEvent event) {
            MinecraftForge.EVENT_BUS.register(this);
        }

        private static Block[] blocks = {
                //注册方块
                COPPER_ORE,
                TIN_ORE,
                LEAD_ORE,
                SILVER_ORE,
                CINNABAR_ORE,
                SALT_ORE,
                SULFUR_ORE,
        };

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            for (Block block : blocks) {
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
                event.getRegistry().register(block);
            }
        }

        @SubscribeEvent
        public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
            for (Block block : blocks) {
                Item itemBlock = new ItemBlock(block).setRegistryName(block.getRegistryName());
                ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
                event.getRegistry().register(itemBlock);


            }
        }

        public static void setCopperOre(Object copperOre) {
            CopperOre = copperOre;
        }
        public static void setTinOre(Object tinOre) {
            TinOre = tinOre;
        }
        public static void setLeadOre(Object leadOre) {
            LeadOre = leadOre;
        }
        public static void setSilverOre(Object silverOre) {
            SilverOre = silverOre;
        }
        public static void setCinnabarOre(Object cinnabarOre) { CinnabarOre = cinnabarOre; }

        public static void setSaltOre(Object saltOre) {
            SaltOre = saltOre;
        }
    }




















