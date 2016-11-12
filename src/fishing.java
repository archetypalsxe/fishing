public class fishing
{
	protected static Player player;
	
	public static void main(String[] args)
	{
		player = new Player();
		
		while(true)
		{
			Fish fish = new Fish(player.getLevel());
			fish(fish);
		}
	}
	
	public static void fish(Fish fish)
	{
		System.out.println("Fishing...");
		
		try
		{
			Thread.currentThread().sleep(fish.getTime());
		}
		catch(InterruptedException ie)
		{
			System.out.println("An exception was thrown: "+ie+"\n");
		}

		System.out.print("Caught "+fish.getName()+"! ");
		
		System.out.println(fish.getExperience() + " experience gained!\n");
		player.addExperience(fish.getExperience());
	}

}
