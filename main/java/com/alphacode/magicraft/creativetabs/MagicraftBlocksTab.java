package com.github.alphacode.magicraft.creativetabs;
import com.github.alphacode.magicraft.register.BlocksRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;

public abstract class MagicraftBlocksTab extends CreativeTabs{
    public MagicraftBlocksTab()
    {
        super("MagicraftBlocks");
    }

    public MagicraftBlocksTab(String label) {
        super(label);
    }

    public Block block ()
    {
        return BlocksRegister.COPPER_ORE;
    }
}
