
/**
 * Abract class in which characters inherit from 
 *
 * @author Joe McDonald
 * @version 2019
 */
public abstract class Character
{
    // instance variables - replace the example below with your own
    private int health;
    private String name;
    private String greeting;

    /**
     * Constructor for objects of class Character
     */
    public Character(String greeting)
    {
        // initialise instance variables
        health = 100;
        this.greeting = greeting;
        name = "";
    }

    /**
     * sets character name
     * @param String, character name
     *
     */
    public void setName(String cName)
    {
       name = cName;
    }
    
        
    /**
     * sets character greeting
     * @param String, character greeting
     */ 
    public void setGreeting(String newGreeting)
    {
       greeting = newGreeting;
    }
    
     /**
     * gets character name
     * @return String character name
     */
    public String getName()
    {
       return name;
    }
    
     /**
     * gets character greeting
     *@return String character greeting
     */
    public String getGreeting()
    {
       return greeting;
    }
    
     /**
     * gets character health
     * @return int character health
     */
    public int getHealth()
    {
       return health;
    }
    
     /**
     * sets character health
     * @param int damage to character health
     */
    public void setHealth(int damage)
    {
       health = damage;
    }
    
}
