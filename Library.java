
/**
 * class that represnts library room
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library extends Room
{
    // instance variables - replace the example below with your own

    private Gamer gamer;

    /**
     * Constructor for objects of class Library
     */
    public Library()
    {
        // initialise instance variables
        gamer = new Gamer("Welcome to the library, would you like to play a game?");
    }

    /**
     * method that gets the greeting from the gamer
     *
     */
    public void getGreeting()
    {
        // put your code here
        System.out.println(gamer.getGreeting());
    }
}
