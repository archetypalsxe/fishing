/**
 * Needed for generating random sizes
 */
import java.util.Random;

/**
 * Abstract class that all of the fish will be based off of
 */
public abstract class AbstractFish {

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
     * The speed the fish is moving at
     */
    protected double speed;

    /**
     * Whether or not the fish's name is in upper case or not
     */
    protected boolean upperCaseName;

    /**
     * Returns whether or not the name should be in all caps
     */
    protected abstract boolean isNameAllCaps();

    /**
     * Returns the maximum amount of experience that could be gained
     * from this fish
     */
    protected abstract int getMaxExperience();

    /**
     * Returns the maximum speed that the fish can move. A 1 is the fastest
     * possible, and 2 would be twice as slow
     */
    protected abstract double getMaxSpeed();

    /**
     * Returns the maximum amount of time that could be required to catch
     * this fish
     */
    protected abstract int getMaxTime();

    /**
     * Returns the name of the fish
     */
    protected abstract String getType();

    /**
     * The default constructor which calls the setup with the provided
     * player's level
     */
    public AbstractFish (int playerLevel)
    {
        this.generator = new Random();
        float weight = this.calculateWeight(playerLevel);
        this.time = (int)(this.getMaxTime() * weight);
        this.experience = (int)(this.getMaxExperience() * weight);
        this.speed = (double)(this.getMaxSpeed() + (1 - weight));
        this.name = this.generateName(weight);
    }

    /**
     * Returns the amount of experience the fish is "worth"
     */
    public int getExperience()
    {
        return this.experience;
    }

    /**
     * Returns the time required to catch the fish
     */
    public int getTime()
    {
        return this.time;
    }

    /**
     * Returns the multiplier that the fish is moving at
     */
    public double getSpeed()
    {
        return this.speed;
    }

    /**
     * Returns the name of the fish
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Calculate a random weight based on the player's level. Higher level
     * will have more variance
     */
    protected float calculateWeight (int playerLevel)
    {
        int levelsToGo = (Player.MAX_LEVEL + 1) - playerLevel;
        return
            (this.generator.nextInt(levelsToGo) + 1)  / (float) levelsToGo;
    }

    /**
     * Generate the fish's name. Takes in the weight of the fish
     */
    protected String generateName(float weight)
    {
        return this.generateSize(weight) +" "+ this.getType();
    }

    /**
     * Generate the size of the fish, whether it is small/medium/large
     */
    protected String generateSize (float weight)
    {
        String size;

        if (weight > .8) {
            size = "large";
        } else if (weight > .5) {
            size = "medium";
        } else {
            size = "small";
        }


        if(this.isNameAllCaps()) {
            size = size.toUpperCase();
        }

        return size;
    }
}
