
/**
 * Class that represents bedroom
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Bedroom extends Room
{
    // instance variables - replace the example below with your own
    private String greeting;

    /**
     * Constructor for objects of class Bedroom
     */
    public Bedroom()
    {
        // initialise instance variables
        greeting = "You have entered the bedroom, find a key to exit";
    }

    /**
     * Method that prints bedroom greeting
     *
     */
    public void getGreeting()
    {
        // put your code here
        System.out.println(greeting);
    }
    
    
}
