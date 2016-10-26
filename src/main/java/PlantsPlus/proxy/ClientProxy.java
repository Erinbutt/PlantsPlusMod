package PlantsPlus.proxy;

import PlantsPlus.init.ModBlocks;
import PlantsPlus.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init(){
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
