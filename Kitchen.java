
/**
 * class that represnts kitchen
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kitchen extends Room
{
    

    private Enemy enemy;


    /**
     * Constructor for objects of class Kitchen
     */
    public Kitchen()
    {
        // initialise instance variables
        enemy = new Enemy("You have entered the Kitchen, there is a drunk fighter, win to proceed");

    }

    /**
     * prints greeting from enemy
     *
     */
    public void getGreeting()
    {
        // put your code here
        System.out.println(enemy.getGreeting());
        
    }
    
    
}
