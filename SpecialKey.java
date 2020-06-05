
/**
 * class that represents special key
 *
 * @author Joe McDonald
 * @version 2019
 */
public class SpecialKey extends Item implements Setable
{

    private String name;

    /**
     * Constructor for objects of class Special Key
     */
    public SpecialKey()
    {
        // initialise instance variables
        name = "Special Key";
    }

    /**
     * method that sets name of special key
     * @param string, to set name 
     */
    public void setName(String name){
        this.name = name;
        
    }
    
    /**
     * method that gets name of special key
     * @return String, returns name
     */
    public String getName(){
        return name;
    }
}
