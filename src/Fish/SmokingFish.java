/**
 * A fish that is smoking... I guess this could mean it's either smoking a
 * cigarette or on fire...?
 */
public class SmokingFish extends AbstractFish {

    /**
     * Constructor for the smoking fish
     */
    public SmokingFish (int playerLevel)
    {
        super(playerLevel);
    }

    /**
     * Returns whether or not the name should be in all caps
     */
    protected boolean isNameAllCaps()
    {
        return true;
    }

    /**
     * Returns the maximum amount of time that could be required to catch
     * this fish
     */
    protected int getMaxTime()
    {
        return 8000;
    }

    /**
     * Returns the maximum amount of experience that could be gained
     * from this fish
     */
    protected int getMaxExperience()
    {
        return -10;
    }

    /**
     * Returns the name of the fish
     */
    protected String getType()
    {
        return "SMOKING FISH";
    }

    /**
     * Returns the maximum speed that the fish can move. A 1 is the fastest
     * possible, and 2 would be twice as slow
     */
    protected double getMaxSpeed()
    {
        return 4;
    }
}
