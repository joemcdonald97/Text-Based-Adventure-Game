import java.util.ArrayList;
/**
 * Class that represents puzzler
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Puzzler extends Character
{
    // instance variables - replace the example below with your own
    

    private LeadCharacter character;

    /**
     * Constructor for objects of class Puzzler
     */
    public Puzzler(String greeting)
    {
        // initialise instance variables
        super(greeting);

    }
    
    /**
     * method that asks lead character a puzzle
     */
    public void askPuzzle1()
    { 
        System.out.println("A sword and a shield cost 110 gold in total."
        +"The sword costs 100 gold more than the sheild. How much was the sword?"); 
    }
    
    /**
     * method that answers puzzle
     * 
     * @param answer, answer to puzzle 1
     */
    public void puzzle1(int answer)
    {
        
    }
}
