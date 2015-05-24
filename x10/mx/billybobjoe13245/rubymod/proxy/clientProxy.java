package x10.mx.billybobjoe13245.rubymod.proxy;

import x10.mx.billybobjoe13245.rubymod.init.rubyBlocks;
import x10.mx.billybobjoe13245.rubymod.init.rubyItems;

public class clientProxy extends commonProxy{
	@Override
	public void registerRenders()	{
		rubyBlocks.registerRenders();
		rubyItems.registerRenders();
	}
}