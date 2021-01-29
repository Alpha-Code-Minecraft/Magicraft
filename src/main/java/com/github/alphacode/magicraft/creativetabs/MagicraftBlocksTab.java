package com.github.alphacode.magicraft.creativetabs;
import com.github.alphacode.magicraft.register.BlocksRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public abstract class MagicraftBlocksTab extends CreativeTabs{
    private static CreativeTabs NatureBlocks;
    public static final CreativeTabs NATURE_BLOCKS =NatureBlocks;

    public MagicraftBlocksTab()
    {
        super("MagicraftNatureBlocks");
    }

    public MagicraftBlocksTab(String label) {
        super(label);
    }

    public static void setNatureBlocks(CreativeTabs natureBlocks) {
        NatureBlocks = natureBlocks;
    }

    public Block block ()
    {
        return BlocksRegister.COPPER_ORE;

    }

}
