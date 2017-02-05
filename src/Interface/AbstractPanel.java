import java.awt.GridLayout;
import javax.swing.JPanel;

/**
 * Abstract class for panels in the game
 */
public abstract class AbstractPanel extends JPanel
{
    /**
     * Initializes the panel and prepares for displaying
     */
    public void initialize(
        int width,
        int height,
        int startX,
        int startY
    ) {
        this.removeAll();
        this.setBounds(0, 0, width, height);
        this.setLocation(startY, startX);
        this.setLayout();
        this.displayUpdates();
    }

    /**
     * Make updates show up on the screen
     */
    protected void displayUpdates()
    {
        this.revalidate();
        this.repaint();
    }

    /**
     * Set the layout for the panel
     */
    protected void setLayout()
    {
        this.setLayout(new GridLayout(0,1));
    }
}
