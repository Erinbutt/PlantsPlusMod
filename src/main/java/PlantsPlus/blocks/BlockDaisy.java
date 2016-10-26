package PlantsPlus.blocks;

import PlantsPlus.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockDaisy extends Block {

	public BlockDaisy() {
		super(Material.PLANTS);
		setUnlocalizedName(Reference.MainBlocks.DAISY.getUnlocalizedName());
		setRegistryName(Reference.MainBlocks.DAISY.getRegistryName());
	}
	
	public boolean isOpaqueCube (IBlockState state)
	{
		return false;
	
	}
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.CUTOUT;
    }
}
    
    
