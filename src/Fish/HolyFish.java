/**
 * A fish that has been blessed by the creator
 */
public class HolyFish extends AbstractFish {

    /**
     * Constructor that calls the parent constructor
     */
    public HolyFish (int playerLevel)
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
    protected  int getMaxTime()
    {
        return 16000;
    }

    /**
     * Returns the maximum amount of experience that could be gained
     * from this fish
     */
    protected  int getMaxExperience()
    {
        return 50;
    }

    /**
     * Returns the name of the fish
     */
    protected String getType()
    {
        return "HOLY FISH";
    }
}
