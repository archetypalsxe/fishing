/**
 * Entry point for the game
 */
public class fishing
{
    /**
     * Initializes the game controller and gets out of the way
     */
    public static void main(String[] args)
    {
        GameController controller = new GameController();
        controller.mainLoop();
    }
}
