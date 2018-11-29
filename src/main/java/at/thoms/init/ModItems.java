package at.thoms.init;

import at.thoms.SkiMod;
import at.thoms.utils.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	// public static Ding Ding
	
	
	public static void init() {
		
		// Ding = new Ding()
		
	}
	
	
	public static void registerBlocks() {
		
	}
	
	public static void registerRenders() {
		
	}
	
	
	/**
	 * Registers the block
	 * 
	 * @param block
	 *            The block to register
	 */
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}

	
	/**
	 * Registers the block with a custom {@link ItemBlock}
	 * 
	 * @param block
	 *            The block
	 * @param itemBlock
	 *            The {@link ItemBlock}
	 */
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}

	
	/**
	 * Registers the blocks renders
	 * 
	 * @param block
	 *            The block
	 */
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(
				new ResourceLocation(SkiMod.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}


	/**
	 * Registers the blocks renders even if it has meta data
	 * 
	 * @param block
	 *            The block
	 * @param meta
	 *            The blocks meta data
	 * @param fileName
	 *            The file name
	 */
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta,
				new ModelResourceLocation(new ResourceLocation(SkiMod.MODID, fileName), "inventory"));
		Utils.getLogger().info("Registered render for " + block.getUnlocalizedName().substring(5));
	}

	
	
	
	
	
	
	
	
	
	
	
}
