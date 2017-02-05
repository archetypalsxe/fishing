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
     * Add experience to the player. The amount of experience is passed in
     *
     * @return Whether or not the player has leveled up
     */
    public boolean addExperience(int experience)
    {
        this.experience += experience;
        if(
            this.experience >= this.getExperienceForNextLevel() &&
            level < MAX_LEVEL
        ) {
            level++;
            return true;
        }
        return false;
    }

    /**
     * Returns the user's current level
     */
    public int getLevel()
    {
        return level;
    }
    /**
     * Returns the player's current experience
     */
    public int getExperience()
    {
        return this.experience;
    }

    /**
     * Returns the amount of experience next level will be at
     */
    public int getExperienceForNextLevel()
    {
        return this.getLevel() * EXPERIENCE_PER_LEVEL;
    }
}
