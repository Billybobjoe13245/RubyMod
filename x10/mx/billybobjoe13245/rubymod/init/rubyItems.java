package x10.mx.billybobjoe13245.rubymod.init;

import x10.mx.billybobjoe13245.rubymod.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class rubyItems {
	
	public static Item ruby;
	
	public static void init()
	{
		ruby = new Item().setUnlocalizedName("ruby");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ruby, ruby.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(ruby);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
