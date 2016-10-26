package PlantsPlus;

public class Reference {

	public static final String Mod_ID = "plantsplus";
	public static final String NAME = "Plants Plus Mod";
	public static final String VERSION = "0.01";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "PlantsPlus.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "PlantsPlus.proxy.ServerProxy";
	
	public static enum MainItems {
		DAISY("daisy", "ItemDaisy"),
		DAISYPINK("daisyPink", "ItemDaisyPink");
		
		private String unlocalizedName;
		private String registryName;
		
		MainItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;		
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
	
	public static enum MainBlocks {
		DAISY("BlockDaisy", "BlockDaisy");
		
		private String unlocalizedName;
		private String registryName;
		
		MainBlocks(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;		
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
	}
}
