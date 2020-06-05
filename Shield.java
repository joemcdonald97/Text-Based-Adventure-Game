
/**
 * Write a description of class Sheild here.
 *
 * @author Joe McDonald
 * @version 2019
 */
public class Shield extends Item
{
    private String name;
  /**
     * Constructor for objects of class Sword
     */
    public Shield()
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
