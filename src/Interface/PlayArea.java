import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;

/**
 * This is where the graphics for fishing take place
 */
public class PlayArea extends AbstractPanel
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
        this.setPreferredSize(new Dimension(width, height));
        // @TODO Remove
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        super.initialize(width, height, startX, startY);
    }
}
