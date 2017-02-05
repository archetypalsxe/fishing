import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * The main play area of the panel
 */
public class PlayArea extends AbstractPanel
{
    /**
     * The height of the console
     */
    private static final int CONSOLE_HEIGHT = 30;

    /**
     * The width of the console
     */
    private static final int CONSOLE_WIDTH = 100;

    /**
     * Where all the text will be displayed
     */
    protected JTextArea console;

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
        this.console = new JTextArea(CONSOLE_HEIGHT, CONSOLE_WIDTH);
        this.console.setEditable(false);

        super.initialize(width, height, startX, startY);
    }

    /**
     * Display a message that we have started fishing
     */
    public void startFishing()
    {
        this.console.setText("Fishing...\n"+ this.console.getText());
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
