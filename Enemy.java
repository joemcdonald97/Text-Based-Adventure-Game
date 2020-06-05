import java.util.ArrayList;
/**
 * Class that represents Enemy
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Enemy extends Character
{


    /**
     * Constructor for objects of class Enemy
     */
    public Enemy(String greeting)
    {
        // initialise instance variables
        super(greeting);
    }

    
    
     /**
     * Methos that simulates enemy getting hit
     * @param hit, amount of health to deducut
     */
    public void getHit(int hit)
    {
       if (getHealth() >=10){
        int newLife = getHealth() - hit;
        setHealth(newLife);
        System.out.println("Successful hit, Enemy health =..." + newLife);
      
        }
        
        else {
        System.out.println("ENEMY DEFEATED, he drops a potion");
        }
    }
    
    
}
