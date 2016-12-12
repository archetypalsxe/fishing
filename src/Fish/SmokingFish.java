/**
 * A fish that is smoking... I guess this could mean it's either smoking a
 * cigarette or on fire...?
 */
public class SmokingFish extends AbstractFish {

    /**
     * The name of this fish
     */
    protected String name = "SMOKING FISH";

    /**
     * Whether or not the fish's name is in upper case or not
     */
    protected boolean upperCaseName = true;

    /**
     * Constructor for the smoking fish
     */
    public SmokingFish (int playerLevel)
    {
        super(playerLevel);
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
     * Generate the fish's name. Takes in the weight of the fish
     */
    protected String generateName(float weight)
    {
        return this.generateSize() +" "+ this.name;
    }
}
