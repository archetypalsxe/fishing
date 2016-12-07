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
     * Set up the holy fish
     */
    public void setup (int playerLevel)
    {
        float weight = this.calculateWeight(playerLevel);
        this.name = "HOLY FISH";
        this.time = (int)(16000 * weight);
        this.experience = (int)(50 * weight);
    }

}
