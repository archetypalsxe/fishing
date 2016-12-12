/**
 * A fish that is diseased. Just getting it out of the water has deterimental
 * effects to you
 */
public class DiseasedFish extends AbstractFish {

    /**
     * The name of this fish
     */
    protected String name = "DISEASED FISH";

    /**
     * Whether or not the fish's name is in upper case or not */
    protected boolean upperCaseName = true;

    /**
     * Constructor that calls the parent constructor
     */
    public DiseasedFish(int playerLevel)
    {
        super(playerLevel);
    }

    /**
     * Returns the maximum amount of time that could be required to catch
     * this fish
     */
    protected int getMaxTime()
    {
        return 2000;
    }

    /**
     * Returns the maximum amount of experience that could be gained
     * from this fish
     */
    protected int getMaxExperience()
    {
        return -50;
    }

    /**
     * Generate the fish's name. Takes in the weight of the fish
     */
    protected String generateName(float weight)
    {
        return this.generateSize() +" "+ this.name;
    }
}
