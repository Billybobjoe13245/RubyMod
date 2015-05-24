package x10.mx.billybobjoe13245.rubymod;

import x10.mx.billybobjoe13245.rubymod.init.rubyBlocks;
import x10.mx.billybobjoe13245.rubymod.init.rubyItems;
import x10.mx.billybobjoe13245.rubymod.proxy.commonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class rubyMod {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static commonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{

		rubyItems.init();
		rubyItems.register();
	}
	public void Init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
