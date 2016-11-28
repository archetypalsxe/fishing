/**
 * A fish that is diseased. Just getting it out of the water has deterimental
 * effects to you
 *
 * @TODO Add some sort of randomness to these
 */
public class DiseasedFish extends AbstractFish {

    /**
     * Returns the time required to catch the fish
     */
    public int getTime()
    {
        return 2000;
    }

    /**
     * Returns the name of the fish to be displayed
     */
    public String getName()
    {
        return "DISEASED FISH";
    }

    /**
     * Returns the experience that is obtained when this fish is caught
     */
    public int getExperience()
    {
        return -50;
    }
}
