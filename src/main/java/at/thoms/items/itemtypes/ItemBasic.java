package at.thoms.items.itemtypes;

import net.minecraft.item.Item;

public class ItemBasic extends Item{
	
	public ItemBasic(String name) {
		setUnlocalizedName(name);

	}
		
	public String getSimpleName() {
		return getUnlocalizedName().substring(5);
	}
}
