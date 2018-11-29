package at.thoms;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jcraft.jorbis.Block;


@Mod(modid = SkiMod.MODID, name = SkiMod.NAME, version = SkiMod.VERSION)
public class SkiMod {

    public static final String MODID = "skimod";
    public static final String VERSION = "0.0.000pa";
    public static final String NAME = "SkiMod";
    
    /* References */
    
    @Mod.Instance(SkiMod.MODID)
    public static SkiMod instance;
    
    /* Proxys */
    
    @SidedProxy(clientSide = "at.thoms.proxy.proxyclient", serverSide = "at.thoms.proxy.proxyserver")
    public static proxycommons proxy;
    
    /* Utils */
        
    public static Logger logger = LogManager.getFormatterLogger(SkiMod.NAME);
    
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent preinit){
    
    	logger.info("PreInit Stage for SkiMod starts.");
    	
    	logger.info("PreInit Stage for SkiMod ends.");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent init){
    	
    	logger.info("Init Stage for SkiMod starts");
    	
    	logger.info("Init Stage for SkiMod ends.");
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent postinit){
    	
    	logger.info("PostInit Stage for SkiMod starts.");
    	
    	logger.info("PostInit Stage for SkiMod ends.");
    }
}
