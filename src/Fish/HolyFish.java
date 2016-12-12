/**
 * A fish that has been blessed by the creator
 */
public class HolyFish extends AbstractFish {

    /**
     * The name of this fish
     */
    protected String name = "HOLY FISH";

    /**
     * Whether or not the fish's name is in upper case or not
     */
    protected boolean upperCaseName = true;

    /**
     * Constructor that calls the parent constructor
     */
    public HolyFish (int playerLevel)
    {
        super(playerLevel);
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
     * Generate the fish's name. Takes in the weight of the fish
     */
    protected String generateName(float weight)
    {
        return this.generateSize() +" "+ this.name;
    }
}
