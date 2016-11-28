/**
 * A fish that has been blessed by the creator
 *
 * @TODO Add some sort of randomness to these
 */
public class HolyFish extends AbstractFish {

    /**
     * Returns the time required to catch the fish
     */
    public int getTime()
    {
        return 16000;
    }

    /**
     * Returns the name of the fish to be displayed
     */
    public String getName()
    {
        return "HOLY FISH";
    }

    /**
     * Returns the experience that is obtained when this fish is caught
     */
    public int getExperience()
    {
        return 50;
    }
}
