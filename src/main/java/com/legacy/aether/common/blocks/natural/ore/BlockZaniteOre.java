package com.legacy.aether.common.blocks.natural.ore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

import com.legacy.aether.common.items.ItemsAether;

public class BlockZaniteOre extends Block
{

	public BlockZaniteOre()
	{
		super(Material.ROCK);

		this.setHardness(3F);
		this.setSoundType(SoundType.STONE);
	}

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune)
    {
        return MathHelper.getRandomIntegerInRange(new Random(), 3, 5);
    }

	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return ItemsAether.zanite_gemstone;
    }

}