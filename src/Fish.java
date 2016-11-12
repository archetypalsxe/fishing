/**
 * Needed for generating random sizes
 */
import java.util.Random;

public class Fish {

	/**
	 * @param float The size of the fish
	 */
	protected double size;

	/**
	 * @param int experience The experience points the fish is worth
	 */
	protected int experience;
	
	/**
	 * @param Random Used for generating a random number
	 */
	protected Random generator;

	/**
	 * @param String A short description of the fish
	 */
	protected String name;

	/**
	 * @param int The time required to catch fish
	 */
	protected int time;

	/**
	 *	@param boolean hasAbility If the fish has an ability or not
	 */
	protected boolean hasAbility;

	/**
	 * @param FishAbility fishAbility An ability, if the fish has one
	 */
	protected FishAbility ability;

	/**
	 * Constructor for fish class
	 *
	 * @param int level The player's current level
	 */
	public Fish(int level) {
		Random generator = new Random();
		if(level < 20) {
			size = generator.nextInt(20 - level) / (double) (20 - level);
			time = generator.nextInt(10000);
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
		if(generator.nextInt(10) >= 7) {
			this.hasAbility = true;
			int abilityNum = generator.nextInt(3);
			switch(abilityNum) {
				case 0:
					this.ability = new FishAbilityDiseased();
					break;
				case 1:
					this.ability = new FishAbilityHoly();
					break;
				case 2:
					this.ability = new FishAbilitySmoking();
					break;
				default: /* This should theoritically never happen */
					this.hasAbility = false;
					break;
			}
		} else {
			this.hasAbility = false;
		}

		if(this.hasAbility) {
			System.out.println(this.ability.getName());
		}

	}

	/**
	 * Prints the size of the display to the console
	 */
	public void displaySize() {
		System.out.println(size);
	}

	/**
	 * Returns the size of the fish
	 *
	 * @return double The size of the fish
	 */
	public double getSize() {
		return size;
	}

	/**
	 * Returns the amount of experience the fish is "worth"
	 * @return int The experience of the fish
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * Returns the name of the fish
	 * @return String The name of the fish
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the time required to catch the fish
	 * @return int The time required to catch fish
	 */
	public int getTime() {
		return time;
	}
}
