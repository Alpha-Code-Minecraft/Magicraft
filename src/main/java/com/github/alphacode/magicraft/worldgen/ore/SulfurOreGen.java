package com.github.alphacode.magicraft.worldgen.ore;
import com.github.alphacode.magicraft.register.BlocksRegister;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import java.util.Random;


public class SulfurOreGen implements IWorldGenerator {

    private final WorldGenMinable WorldGenMinable;


    public SulfurOreGen(WorldGenMinable WorldGenMinable)
    {
        this.WorldGenMinable =new WorldGenMinable(BlocksRegister.SULFUR_ORE.getDefaultState(), 5);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        for(int i = 10; i < 100; i *= 10) {
            BlockPos pos = new BlockPos(chunkX * 16, i, chunkZ * 16);
            WorldGenMinable.generate(world, random, pos);
        }
    }
}


