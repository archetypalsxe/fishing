import javax.swing.JPanel;

// @TODO Remove
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

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
        // @TODO Remove this
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM:dd:yy-hh:mm:ss");
			String theDate = dateFormat.format(new Date());
			this.add(new JLabel(theDate));
        this.revalidate();
        this.repaint();
    }
}
