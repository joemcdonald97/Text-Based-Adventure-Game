
/**
 * Class for the run though of the game 
 *  
 *  To play this game, create an instance of this class and call the "runThrough"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 *
 * @author Joe McDonald
 * @version 2019
 */
public class RunThrough
{
    // instance variables - replace the example below with your own
    private Game game;
    private LeadCharacter player;

    /**
     * Constructor for objects of class RunThrough
     */
    public RunThrough()
    {
        // initialise instance variables
        game = new Game();
        player = new LeadCharacter("");
    }

    /**
     * Method to do a simulation of the game, resulting in the game being complete
     *
     */
    public void runThrough()
    {
        // put your code here
        Gamer gamer = new Gamer("");
        game.setUpBoard();
        game.introduction();
        game.moveRight();
        player.answerPuzzle(100);
        player.answerPuzzle(105);
        game.moveRight();
        player.fightEnemy();
        player.pickUpPotion();
        player.heal();
        game.moveDown();
        player.underBed();
        player.lookWardrobe();
        player.underPillow();
        game.moveDown();
        if (player.playGame() > gamer.game2())
        {
            System.out.println("Well Done, you may proceed");
            
        }
        
        else if (player.playGame() <= gamer.game2()){
            System.out.println("unlucky, lets try roll a dice");
            if (player.playGame2() > gamer.diceRoll())
            {
              System.out.println("Well Done, you may proceed");  
            }
            
            else {
                player.getHit();
                System.out.println("You may proceed at the cost of health");  
            }
        }
        game.moveRight();
        player.underBed2();
        player.underPillow2();
        player.lookWardrobe2();
        
        
        
        
    }
}
