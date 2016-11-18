/**
 * Needed for generating random sizes
 */
import java.util.Random;

/**
 * Used to represent the fish itself
 */
public class Fish {

    /**
     * The size of the fish
     */
    protected double size;

    /**
     * The experience points gained by catching this fish
     */
    protected int experience;

    /**
     * Used for generating random numbers
     */
    protected Random generator;

    /**
     * The name of the fish (short description)
     */
    protected String name;

    /**
     * The time required to catch fish
     */
    protected int time;

    /**
     * The ability the fish has, if the fish has one
     */
    protected FishAbility ability;

    /**
     * Constructor for fish class. The player's level is taken as a parameter
     */
    public Fish(int level)
    {
        Random generator = new Random();
        // @TODO Should use constants....
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
            int abilityNum = generator.nextInt(3);
            switch(abilityNum) {
                case 0:
                    this.ability = new Diseased();
                    break;
                case 1:
                    this.ability = new Holy();
                    break;
                case 2:
                    this.ability = new Smoking();
                    break;
                default: /* This should theoritically never happen */
                    break;
            }
        }

        if(this.ability instanceof FishAbility) {
            System.out.println(this.ability.getName());
        }

    }

    /**
     * Prints the size of the fish to the console
     */
    public void displaySize()
    {
        System.out.println(this.getSize());
    }

    /**
     * Returns the size of the fish
     */
    public double getSize()
    {
        return size;
    }

    /**
     * Returns the amount of experience the fish is "worth"
     */
    public int getExperience()
    {
        return experience;
    }

    /**
     * Returns the name of the fish
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the time required to catch the fish
     */
    public int getTime()
    {
        return time;
    }
}
