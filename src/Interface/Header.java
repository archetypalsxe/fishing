
// @TODO Remove
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 * The header to the panel
 */
public class Header extends AbstractPanel
{

    public void setBorder()
    {
        this.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.red));
    }
}
