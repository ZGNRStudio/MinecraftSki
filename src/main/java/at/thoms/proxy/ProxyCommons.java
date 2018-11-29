package at.thoms.proxy;

import at.thoms.blocks.blocktypes.BlockBasic;
import at.thoms.items.itemtypes.ItemBasic;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class ProxyCommons {

	public void preInit() {
		
	}
	
	public void init() {
		
	}
	
	public void postInit() {
		
	}
	
	public void registerRenders() {
		
	}
	
    public void serverAboutToStart(FMLServerAboutToStartEvent serverabouttostart) 
    {
    }

    public void serverStarted(FMLServerStartedEvent serverstarted) 
    {
    }

    public void serverStopping(FMLServerStoppingEvent serverstopping) 
    {
    }

    public void serverStopped(FMLServerStoppedEvent serverstopped) 
    {
    }

    public void serverStarting(FMLServerStartingEvent serverstarting) 
    {
    }

	public static void registerItemModel(Item item)
	{
	}

	public static void registerItemBasicModel(ItemBasic item)
	{	
	}
	
	public static void registerBlockModel(Block block)
	{
	}
	
	public static  void registerBlockBasicModel(BlockBasic block)
	{
	}

	
}
