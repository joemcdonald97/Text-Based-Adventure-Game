
/**
 * Class that represents sword
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Sword extends Item implements Setable
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Sword
     */
    public Sword()
    {
        // initialise instance variables
        name = "sword";
    }

    /**
     * method that sets name of sword
     * @param string, to set name 
     *
     */
    public void setName(String name){
        this.name = name;
        
    }
    
    /**
     * method that returns name of sword
     * @return String, returns name
     */
    public String getName(){
        return name;
    }
}
