/**
 * Main class for controlling the game. This is where the main game "engine"
 * takes place
 */
public class GameController
{
    /**
     * The interface controller for dealing with the interface
     */
    protected InterfaceController interfaceController;

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
        this.initializeInterface();

        FishFactory fishFactory = new FishFactory();
        while(true)
        {
            AbstractFish fish = fishFactory.generateFish(player.getLevel());
            fish(fish);
        }
    }

    /**
     * Instatiate the interface and start displaying
     */
    protected void initializeInterface()
    {
        this.interfaceController = new InterfaceController();
        this.interfaceController.initializeFrame();
        this.interfaceController.displayPlayerInfo(this.player);
    }

    /**
     * This is where we do the fishing. This is where the system sleeps
     * while we are "fishing"
     */
    protected void fish(AbstractFish fish)
    {
        this.interfaceController.startFishing();

        try
        {
            FishingMechanism fishingMechanism = new FishingMechanism(
                fish.getSpeed()
            );
            fishingMechanism.start();
            Thread.currentThread().sleep(fish.getTime());
            fishingMechanism.stop();
        }
        catch(InterruptedException ie)
        {
            System.out.println("An exception was thrown: "+ie+"\n");
        }

        System.out.print("Caught a "+fish.getName()+"! ");

        String direction;
        if(fish.getExperience() >= 0) {
            direction = "gained";
        } else {
            direction = "lost!!!";
        }
        System.out.println(
            Math.abs(fish.getExperience()) + " experience " + direction
        );
        player.addExperience(fish.getExperience());
        System.out.println("New Experience: " + player.getExperience() + "\n");
    }
}
