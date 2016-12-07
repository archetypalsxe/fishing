/**
 * A fish that is diseased. Just getting it out of the water has deterimental
 * effects to you
 */
public class DiseasedFish extends AbstractFish {

    /**
     * Constructor that calls the parent constructor
     */
    public DiseasedFish(int playerLevel)
    {
        super(playerLevel);
    }

    /**
     * Sets up the diseased fish
     */
    public void setup(int playerLevel)
    {
        float weight = this.calculateWeight(playerLevel);
        this.time = (int)(2000 * weight);
        this.experience = (int)(-50 * weight);
        this.name = "DISEASED FISH";
    }
}
