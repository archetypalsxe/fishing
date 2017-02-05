import javax.swing.JLabel;

/**
 * The header to the panel
 */
public class Header extends AbstractPanel
{
    /**
     * Display the player's information in this panel
     */
    public void updatePlayerInfo(Player player)
    {
        /**
         * @TODO Don't redraw everything, just what has changed (update grid
         * to be 2 columns instead of 1)
         */
        this.removeAll();
        this.add(new JLabel("Player Level: "+ player.getLevel()));
        this.add(new JLabel("Current Experience: "+ player.getExperience()));
        this.add(new JLabel(
            "Next level at: "+ player.getExperienceForNextLevel()
        ));
        this.displayUpdates();
    }
}
