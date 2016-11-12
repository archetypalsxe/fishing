public class Player {

	/**
	 * @param int The player's experience
	 */
	protected int experience;

	/**
	 * @param int The player's level
	 */
	protected int level;

	/**
	 * The constructor for Player class
	 */
	public Player() {
		level = 1;
		experience = 0;
	}

	/**
	 * Returns the user's current level
	 *
	 * @return int The user's current level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Add experience
	 *
	 * @param int experience The amount of experience to be added
	 */
	public void addExperience(int experience) {
		this.experience += experience;
		if(this.experience >= (level * 50) && level < 20) {
			level++;
			System.out.println("\n*****You have leveled up*****");
			System.out.println("Current level: " + level + "\n");
		}
	}
}
