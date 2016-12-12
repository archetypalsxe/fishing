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
     * Whether or not the fish's name is in upper case or not
     */
    protected boolean upperCaseName;

    /**
     * Returns the maximum amount of time that could be required to catch
     * this fish
     */
    protected abstract int getMaxTime();

    /**
     * Returns the maximum amount of experience that could be gained
     * from this fish
     */
    protected abstract int getMaxExperience();

    /**
     * Generate the fish's name. Takes in the weight of the fish
     */
    protected abstract String generateName(float weight);

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
        return this.generator.nextInt(levelsToGo) / (float) levelsToGo;
    }

    /**
     * Generate the size of the fish, whether it is small/medium/large
     */
    protected String generateSize (float weight)
    {
        if (weight > 80) {
            return "large";
        }

        if (weight > 50) {
            return "medium";
        }

        return "small";
    }
}
