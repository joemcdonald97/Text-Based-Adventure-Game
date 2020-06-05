
/**
 * class that represents ballroom
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ballroom extends Room
{
    // instance variables - replace the example below with your own

    private Puzzler puzzler;

    /**
     * Constructor for objects of class Ballroom
     */
    public Ballroom()
    {
        // initialise instance variables

        puzzler = new Puzzler ("You have entered the Ballroom. To proceed you must answer this puzzle");
    }

    /**
     * method that prints greeting from puzzler
     *
     */
    public void getGreeting()
    {
        // put your code here
        System.out.println(puzzler.getGreeting());
    }
    
   /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void askPuzzle()
    {
        // put your code here
        puzzler.askPuzzle1();
    }
}
