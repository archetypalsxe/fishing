/**
 * Used to represent the fish itself
 */
public class DefaultFish extends AbstractFish {

    /**
     * The name of this fish
     */
    protected String name = "fish";

    /**
     * Whether or not the fish's name is in upper case or not
     */
    protected boolean upperCaseName = false;

    /**
     * Constructor that calls the parent constructor
     */
    public DefaultFish (int playerLevel)
    {
        super(playerLevel);
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
     * Generate the fish's name. Takes in the weight of the fish
     */
    protected String generateName(float weight)
    {
        return this.generateSize() +" "+ this.name;
    }
}
