/**
 * This will be the multi-threading class where the fishing mechanism is
 * stored. Outputs to the user and the user has to press a button within
 * a certain time frame based on the difficulty of the fish
 */
public class FishingMechanism implements Runnable
{
    private static final int NUMBER_OF_SPACES = 50;
    private static final int SLEEP_TIME = 20;

    /**
     * Whether the position is advancing or not
     */
    protected boolean advancing = true;

    /**
     * Whether or not we are running
     */
    protected boolean running = true;

    /**
     * The position that we are at for the indicator
     */
    protected int position;

    /**
     * The thread that is running
     */
    protected Thread thread;

    /**
     * How long to wait before moving mechanism
     */
    protected long speed;

    /**
     * Default constructor. Takes in a speed multiplier that the speed
     * the fish moves at should be multiplied by
     */
    public FishingMechanism(double speedMultiplier)
    {
        this.speed = (long)(speedMultiplier * SLEEP_TIME);
    }

    /**
     * Start the thread running
     */
    public void start()
    {
        if(this.thread == null) {
            this.running = true;
            this.position = 0;
            this.thread = new Thread (this);
            this.thread.start();
        }
    }

    /**
     * Run the thread
     */
    public void run()
    {
        try {
            while (this.running) {
                this.clearInterface();
                this.displayInterface();
                Thread.sleep(this.speed);
                this.setNextPosition();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    /**
     * Stop the thread from running
     */
    public void stop()
    {
        this.running = false;
        System.out.print("\n");
    }

    /**
     * Deletes the line of output (interface)
     */
    protected void clearInterface()
    {
        for(
            int deleteCounter = 0;
            // +2 for the beginning and ending marks
            deleteCounter < (NUMBER_OF_SPACES + 2);
            deleteCounter++
        ) {
            System.out.print("\b");
        }
    }

    /**
     * Display the interface to the user
     */
    protected void displayInterface()
    {
        System.out.print("|");
        for(
            int spaceCounter = 0;
            spaceCounter < NUMBER_OF_SPACES;
            spaceCounter++
        ) {
            if(spaceCounter == this.position) {
                System.out.print("X");
            } else {
                System.out.print("_");
            }
        }
        System.out.print("|");
    }

    /**
     * Advance the position to the next position
     */
    protected void setNextPosition()
    {
        if(this.advancing) {
            if(this.position == NUMBER_OF_SPACES) {
                this.advancing = false;
                this.position--;
            } else {
                this.position++;
            }
        } else {
            if(this.position == 0) {
                this.advancing = true;
                this.position++;
            } else {
                this.position--;
            }
        }
    }
}
