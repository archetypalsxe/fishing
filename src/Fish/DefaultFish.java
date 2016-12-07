/**
 * Used to represent the fish itself
 */
public class DefaultFish extends AbstractFish {

    /**
     * Constructor that calls the parent constructor
     */
    public DefaultFish (int playerLevel)
    {
        super(playerLevel);
    }

    /**
     * Setup function. The player's level is taken as a parameter
     */
    public void setup (int playerLevel)
    {
        if(playerLevel < Player.MAX_LEVEL) {
            size = this.generator.nextInt(
                Player.MAX_LEVEL - playerLevel
            ) / (double) (Player.MAX_LEVEL - playerLevel);
            time = this.generator.nextInt(10000);
        } else {
            size = 0;
            time = 10000;
        }
        if(size < 0.65) {
            experience = 5;
            name = "a fish";
        } else if(size < 0.9) {
            experience = 10;
            name = "a big fish";
        } else {
            experience = 20;
            name = "a huge fish";
        }
    }
}
