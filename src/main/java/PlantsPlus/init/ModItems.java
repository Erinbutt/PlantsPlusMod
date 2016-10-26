package PlantsPlus.init;

import PlantsPlus.Reference;
import PlantsPlus.items.ItemDaisy;
import PlantsPlus.items.ItemDaisyPink;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item daisy;
	public static Item daisyPink;
	

	public static void init(){
		daisy = new ItemDaisy();
		daisyPink = new ItemDaisyPink();
	}	
	
	public static void register(){
		GameRegistry.register(daisy);
		GameRegistry.register(daisyPink);
		}
	
	public static void registerRenders (){
		registerRender(daisy);
		registerRender(daisyPink);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(),"inventory"));
	}
}
