/**
 * Abstract class that all of the fish will be based off of
 */
public abstract class AbstractFish {

    /**
     * Returns the time that is required to catch this fish
     */
    public abstract int getTime();

    /**
     * Returns the name of the fish to be displayed
     */
    public abstract String getName();

    /**
     * Returns the experience that is obtained when this fish is caught
     */
    public abstract int getExperience();
}
