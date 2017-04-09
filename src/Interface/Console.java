import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Where all the text will be displayed
 */
public class Console extends AbstractPanel
{
    /**
     * Where all the text will be displayed
     */
    protected JTextArea console;

    /**
     * Display relevant information that the user caught a fish
     */
    public void caughtFish(AbstractFish fish)
    {
        String direction;
        if(fish.getExperience() >= 0) {
            direction = "gained";
        } else {
            direction = "lost!!!";
        }
        this.prefixToConsole(
            Math.abs(fish.getExperience()) +" experience "+ direction +"\n"
        );
        this.prefixToConsole("\nCaught a "+fish.getName()+ "! ");
    }

    /**
     * Display a message that the player has leveled up
     */
    public void displayLevelUp(Player player)
    {
        this.prefixToConsole("You are now level "+ player.getLevel() +"\n");
        this.prefixToConsole("\n************LEVEL UP!!!!************\n");
    }

    /**
     * Initializes the panel and prepares for displaying
     */
    public void initialize(
        int width,
        int height,
        int startX,
        int startY
    ) {
        this.setPreferredSize(new Dimension(width, height));
        /**
         * Takes in number of rows and number of columns
         */
        this.console = new JTextArea(height / 20, width / 12);
        this.console.setEditable(false);

        super.initialize(width, height, startX, startY);
    }

    /**
     * Add text to the beginning of the console
     */
    protected void prefixToConsole(String verbiage)
    {
        this.console.setText(verbiage + this.console.getText());
    }


    /**
     * Display a message that we have started fishing
     */
    public void startFishing()
    {
        this.prefixToConsole("Fishing...\n");
        this.displayUpdates();
    }

    /**
     * Overriding parent function for custom functionality in the play area
     */
    protected void setLayout()
    {
        JScrollPane scroller = new JScrollPane(this.console);
        scroller.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
        );
        this.add(scroller);
    }
}
