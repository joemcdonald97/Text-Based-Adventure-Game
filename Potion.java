
/**
 * Class that represents potion
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Potion extends Item implements Setable
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Sword
     */
    public Potion()
    {
        // initialise instance variables
        name = "potion";
    }

    /**
     * method that sets name of potion
     * @param string, to set name 
     *
     */
    public void setName(String name){
        this.name = name;
        
    }
    
    /**
     * method that gets name of potion
     * @return String, returns name
     */
    public String getName(){
        return name;
    }
}
