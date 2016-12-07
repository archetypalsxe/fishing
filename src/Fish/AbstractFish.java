/**
 * Needed for generating random sizes
 */
import java.util.Random;

/**
 * Abstract class that all of the fish will be based off of
 */
public abstract class AbstractFish {

    /**
     * Called during the constructor to setup the randomness in the fish
     */
    protected abstract void setup(int playerLevel);

    /**
     * The size of the fish
     */
    protected double size;

    /**
     * The experience points gained by catching this fish
     */
    protected int experience;

    /**
     * The time required to catch fish
     */
    protected int time;

    /**
     * Used for generating random numbers
     */
    protected Random generator;

    /**
     * The name of the fish (short description)
     */
    protected String name;

    /**
     * The default constructor which calls the setup with the provided
     * player's level
     */
    public AbstractFish (int playerLevel)
    {
        this.generator = new Random();
        this.setup(playerLevel);
    }

    /**
     * Returns the size of the fish
     */
    public double getSize()
    {
        return size;
    }

    /**
     * Returns the amount of experience the fish is "worth"
     */
    public int getExperience()
    {
        return experience;
    }

    /**
     * Returns the time required to catch the fish
     */
    public int getTime()
    {
        return time;
    }

    /**
     * Returns the name of the fish
     */
    public String getName()
    {
        return name;
    }

    /**
     * Calculate a random weight based on the player's level. Higher level
     * will have more variance
     */
    protected float calculateWeight (int playerLevel)
    {
        int levelsToGo = Player.MAX_LEVEL - playerLevel;
        return this.generator.nextInt(levelsToGo) / (float) levelsToGo;
    }
}
