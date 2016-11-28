/**
 * A fish that is smoking... I guess this could mean it's either smoking a
 * cigarette or on fire...?
 *
 * @TODO Add some sort of randomness to these
 */
public class SmokingFish extends AbstractFish {

    /**
     * Returns the time required to catch the fish
     */
    public int getTime()
    {
        return 8000;
    }

    /**
     * Returns the name of the fish to be displayed
     */
    public String getName()
    {
        return "SMOKING FISH";
    }

    /**
     * Returns the experience that is obtained when this fish is caught
     */
    public int getExperience()
    {
        return -10;
    }
}
