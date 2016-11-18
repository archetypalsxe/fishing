/**
 * Main class for controlling the game. This is where the main game "engine"
 * takes place
 */
public class GameController
{
    /**
     * Represents the person playing the game
     */
    protected Player player;

    /**
     * Constructor that initializes the instance variables
     */
    public GameController()
    {
        player = new Player();
    }

    /**
     * Where all the magic happens. This is where we endlessly keep fishing
     */
    protected void mainLoop()
    {
        while(true)
        {
            Fish fish = new Fish(player.getLevel());
            fish(fish);
        }
    }

    /**
     * This is where we do the fishing. This is where the system sleeps
     * while we are "fishing"
     */
    protected void fish(Fish fish)
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
