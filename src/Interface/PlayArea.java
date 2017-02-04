// @TODO Remove
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 * The main play area of the panel
 */
public class PlayArea extends AbstractPanel
{

    public void addButton()
    {
        this.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.black));
		JButton button = new JButton("Save");
        this.add(button);
    }
}
