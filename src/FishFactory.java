/**
 * Needed for generating random sizes
 */
import java.util.Random;

/**
 * Class for generating fish
 */
public class FishFactory
{

    /**
     * Used for generating random numbers within this class
     */
    protected Random randomGenerator;

    /**
     * Constructor that sets up instance variables
     */
    public FishFactory()
    {
        this.randomGenerator = new Random();
    }

    /**
     * Generate a fish using the provided player's level
     *
     * @TODO More randomness and actually use the player's level in some way
     */
    public AbstractFish generateFish(int playerLevel)
    {
        int fishTypeInt = this.randomGenerator.nextInt(10);
        switch (fishTypeInt) {
            case 0:
                return new HolyFish(playerLevel);
            case 1:
                return new DiseasedFish(playerLevel);
            case 2:
                return new SmokingFish(playerLevel);
            default:
                return new DefaultFish(playerLevel);
        }
    }
}
