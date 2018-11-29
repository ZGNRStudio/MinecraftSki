package at.thoms.proxy;

import at.thoms.blocks.blocktypes.BlockBasic;
import at.thoms.items.itemtypes.ItemBasic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class ProxyClient extends ProxyCommons{

	
	@Override
	public void preInit() {
		
	}
	
	@Override
	public void init() {
		
	}
	
	@Override
	public void postInit() {
		
	}
	
	@Override
	public void registerRenders() {
		
	}
	
	@Override
	public void serverAboutToStart(FMLServerAboutToStartEvent serverabouttostart) 
    {
    }

	@Override
	public void serverStarted(FMLServerStartedEvent serverstarted) 
    {
    }

	@Override
	public void serverStopping(FMLServerStoppingEvent serverstopping) 
    {
    }

	@Override
	public void serverStopped(FMLServerStoppedEvent serverstopped) 
    {
    }

	@Override
	public void serverStarting(FMLServerStartingEvent serverstarting) 
    {
    }

	public static void registerItemModel(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerItemArmorModel(ItemArmor item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void registerBlockModel(Block block) {
		registerItemModel(Item.getItemFromBlock(block));
	}

	public static void registerBlockBasicModel(BlockBasic block){
		registerItemModel(Item.getItemFromBlock(block));
	}
	
	public static void registerBlockBushModel(BlockBush block) {
		registerItemModel(Item.getItemFromBlock(block));
	}
	

}
