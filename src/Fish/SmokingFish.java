/**
 * A fish that is smoking... I guess this could mean it's either smoking a
 * cigarette or on fire...?
 */
public class SmokingFish extends AbstractFish {

    /**
     * Constructor for the smoking fish
     */
    public SmokingFish (int playerLevel)
    {
        super(playerLevel);
    }

    /**
     * Set up a smoking fish. Called from constructor
     */
    public void setup (int playerLevel)
    {
        float weight = this.calculateWeight(playerLevel);
        this.name = "SMOKING FISH";
        this.time = (int)(8000 * weight);
        this.experience = (int)(-10 * weight);
    }
}
