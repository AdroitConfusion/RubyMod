package com.adroit.gem.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block
{
    public RubyOre()
    {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(3.0f,3.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}