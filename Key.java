
/**
 * class that represnts key
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Key extends Item implements Setable
{
    private String name;

    /**
     * Constructor for objects of class Key
     */
    public Key()
    {
        // initialise instance variables
        name = "key";
    }

    /**
     * method that sets name of key
     * @param string, to set name 
     *
     */
    public void setName(String name){
        this.name = name;
        
    }
    
    /**
     * method that gets name of key
     * @return String, returns name
     */
    public String getName(){
        return name;
    }
}
