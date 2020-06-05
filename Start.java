
/**
 * Empty class to represent starting room
 * @author Joe McDonald
 * @version 2019
 */
public class Start extends Room
{
private String introduction;

/**
* Constructor for objects of class Start
*/
public Start(){
  introduction = "You wake up in a haunted mansion. The aim of the game is to escape, search the house to find the sercret map.";  
    
}

/**
* Method that gets the introduction
* @return string introduction
*/
public String getIntroduction(){
    return introduction;
}
}


