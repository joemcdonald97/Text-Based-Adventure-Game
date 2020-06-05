import java.util.ArrayList;
import java.util.Random;
/**
 * Class the represents the gamer
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Gamer extends Character
{
    // instance variables - replace the example below with your own
    private int random;
    private LeadCharacter character;

    /**
     * Constructor for objects of class Puzzler
     */
    public Gamer(String greeting)
    {
        // initialise instance variables
        super(greeting);
        
        Random random = new Random();
    }
   
    /**
     * method that sends message to player
     */
    public void game1()
     {
        System.out.println("To proceed you must beat me at a game of black jack");
    
    }
    
    /**
     * method that simultes gamers drawing two cards for himself
     * @return double, overall of two random doubles
     */
    public double game2()
     {
        double card1 = (int)(Math.random()*((11-1)+1))+1;
        double card2 = (int)(Math.random()*((11-1)+1))+1;
        double overall = card1+card2;
        System.out.println("My First card is..." + card1);
        System.out.println("My Second card is..." + card2);
        System.out.println("Therefore I have..." + overall);
        return overall;
    
    }
    
    /**
     * method that simulates gamer rolling a dice
     * @return double, dice roll
     */
    public double diceRoll()
    {
       double roll = (int)(Math.random()*((6-1)+1))+1; 
       return roll;
    }
    
 }
