package x10.mx.billybobjoe13245.rubymod.init;

import x10.mx.billybobjoe13245.rubymod.Reference;
import x10.mx.billybobjoe13245.rubymod.blocks.blockRuby;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class rubyBlocks {
	
	public static Block rubyBlock;
	
	public static void init()
	{
		rubyBlock = new blockRuby(Material.rock).getUnlocalizedName("rubyBlock");
	}
	
	public static void register()
	{
		GameRegistry.registerBlock(rubyBlock, rubyBlock.getUnlocalizedName().substring(5));
	}

	
	public static void registerRenders()
	{
		registerRender(rubyBlock);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
