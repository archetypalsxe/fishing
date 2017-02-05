import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Class for controlling the interface
 */
public class InterfaceController
{
    /**
     * The header to the frame
     */
    protected Header header;

    /**
     * The frame to draw within
     */
    protected JFrame display;

    /**
     * The main part of the screen where all the magic happens
     */
    protected PlayArea playArea;

    /**
     * The length of the frame
     */
    private static final int FRAME_HEIGHT = 600;

    /**
     * The title that should appear on the frame
     */
    private static final String FRAME_TITLE = "The Fishing Game";

    /**
     * The width of the frame
     */
    private static final int FRAME_WIDTH = 1200;

    /**
     * The height of the header
     */
    private static final int HEADER_HEIGHT = 80;

    /**
     * Display information that the user has caught a fish
     */
    public void caughtFish(AbstractFish fish)
    {
        this.playArea.caughtFish(fish);
    }

    /**
     * Display a message that the player has leveled up
     */
    public void displayLevelUp(Player player)
    {
        this.playArea.displayLevelUp(player);
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
        this.playArea.startFishing();
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

        this.playArea = new PlayArea();
        this.playArea.initialize(
            FRAME_WIDTH,
            FRAME_HEIGHT - HEADER_HEIGHT,
            HEADER_HEIGHT,
            0
        );

        this.display.add(this.playArea);
        this.display.add(this.header);
        this.display.revalidate();
        this.display.repaint();
    }
}
