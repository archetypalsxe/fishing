/**
 * This represents the person playing the game
 */
public class Player
{

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
        // @TODO These should be constants
        if(this.experience >= (level * 50) && level < 20) {
            level++;
            System.out.println("\n*****You have leveled up*****");
            System.out.println("Current level: " + level + "\n");
        }
    }
}
