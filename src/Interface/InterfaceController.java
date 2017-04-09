import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Class for controlling the interface
 */
public class InterfaceController
{
    /**
     * The title that should appear on the frame
     */
    private static final String FRAME_TITLE = "The Fishing Game";

    /**
     * The length of the frame
     */
    private static final int FRAME_HEIGHT = 600;

    /**
     * The width of the frame
     */
    private static final int FRAME_WIDTH = 1200;

    /**
     * The height of the header
     */
    private static final int HEADER_HEIGHT = 80;

    /**
     * How tall the console is
     */
    private static final int CONSOLE_HEIGHT = 200;

    /**
     * How big (tall) the play area should be
     */
    private static final int PLAY_AREA_HEIGHT = 250;

    /**
     * The header to the frame
     */
    protected Header header;

    /**
     * The frame to draw within
     */
    protected JFrame display;

    /**
     * Where all the text for fishing take place
     */
    protected Console console;

    /**
     * The area where the graphics for fishing are
     */
    protected PlayArea playArea;

    /**
     * Display information that the user has caught a fish
     */
    public void caughtFish(AbstractFish fish)
    {
        this.console.caughtFish(fish);
    }

    /**
     * Display a message that the player has leveled up
     */
    public void displayLevelUp(Player player)
    {
        this.console.displayLevelUp(player);
    }

    /**
     * Display information on the player in the header
     */
    public void displayPlayerInfo(Player player)
    {
        this.header.updatePlayerInfo(player);
    }

    /**
     * Setup and display the frame to the user
     */
    public void initializeFrame()
    {
        this.setupFrame();
        this.display.setVisible(true);
    }

    /**
     * Notify the user that fishing has started
     */
    public void startFishing()
    {
        this.console.startFishing();
            /*
            FishingMechanism fishingMechanism = new FishingMechanism(
                fish.getSpeed()
            );
            fishingMechanism.start();
            */
            //fishingMechanism.stop();
    }

    /**
     * Create and setup the frame
     */
    protected void setupFrame()
    {
        this.display = new JFrame(FRAME_TITLE);
        this.display.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.display.setLayout(null);
        this.display.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        this.display.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.header = new Header();
        this.header.initialize(FRAME_WIDTH, HEADER_HEIGHT, 0, 0);

        this.console = new Console();
        this.console.initialize(
            FRAME_WIDTH,
            CONSOLE_HEIGHT,
            HEADER_HEIGHT,
            0
        );

        this.playArea = new PlayArea();
        this.playArea.initialize(
            FRAME_WIDTH,
            PLAY_AREA_HEIGHT,
            HEADER_HEIGHT + CONSOLE_HEIGHT,
            0
        );

        this.display.add(this.playArea);
        this.display.add(this.console);
        this.display.add(this.header);
        this.display.revalidate();
        this.display.repaint();
    }
}
