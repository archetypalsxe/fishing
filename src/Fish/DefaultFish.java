/**
 * Used to represent the fish itself
 */
public class DefaultFish extends AbstractFish {

    /**
     * Constructor that calls the parent constructor
     */
    public DefaultFish (int playerLevel)
    {
        super(playerLevel);
    }

    /**
     * Returns whether or not the name should be in all caps
     */
    protected boolean isNameAllCaps()
    {
        return false;
    }

    /**
     * Returns the maximum amount of time that could be required to catch
     * this fish
     */
    protected int getMaxTime()
    {
        return 10000;
    }

    /**
     * Returns the maximum amount of experience that could be gained
     * from this fish
     */
    protected int getMaxExperience()
    {
        return 20;
    }

    /**
     * Returns the name of the fish
     */
    protected String getType()
    {
        return "fish";
    }
}
