/**
 * This represents the person playing the game
 */
public class Player
{
    public static final int MAX_LEVEL = 20;
    private static final int EXPERIENCE_PER_LEVEL = 50;

    /**
     * The amount of experience the player has gained
     */
    protected int experience = 0;

    /**
     * The player's level, like an RPG
     */
    protected int level = 1;

    /**
     * Returns the user's current level
     */
    public int getLevel()
    {
        return level;
    }

    /**
     * Add experience to the player. The amount of experience is passed in
     */
    public void addExperience(int experience)
    {
        this.experience += experience;
        if(
            this.experience >= (level * EXPERIENCE_PER_LEVEL) &&
            level < MAX_LEVEL
        ) {
            level++;
            System.out.println("\n*****You have leveled up*****");
            System.out.println("Current level: " + level + "\n");
        }
    }

    /**
     * Returns the player's current experience
     */
    public int getExperience()
    {
        return this.experience;
    }
}
