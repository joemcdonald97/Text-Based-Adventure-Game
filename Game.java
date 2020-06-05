
/**
 * Class that represents the game functionality
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    private Room[][] board = new Room[5][5];
    private Bedroom bedroom;
    private Library library;
    private Ballroom ballroom;
    private Kitchen kitchen;
    private Start start;
    private String introduction;
   
    private int x;
    private int y;
    

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        board = new Room[5][5];
        bedroom = new Bedroom();
        library = new Library();
        ballroom = new Ballroom();
        kitchen = new Kitchen();
        start = new Start();
        introduction = "";
        
        y= 0;
        x= 0;
        
    
    }
    
    /**
     * Method that sets up the game board, filling array with rooms
     */
    public void setUpBoard(){
          for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[i].length; j++) {
        board[i][j] = bedroom;
    }
    }
        
        board[0][0] = start;
        board[0][1] = ballroom;
        board[0][2] = kitchen;
        board[1][2] = bedroom;
        board[2][2] = library; 
        board[2][3] = bedroom;
    }
    
    /**
     * method to move right on the game board
     */
    public void moveRight()
    {
        
        
    
        if (board[x][y+1] instanceof Library){
      library.getGreeting();
      
      
        
    }
    
        if (board[x][y+1] instanceof Kitchen){
      kitchen.getGreeting();
      
      
      
      
        
    }
    
        if (board[x][y+1] instanceof Bedroom){
      bedroom.getGreeting();
      
      
        
    }
    
        if (board[x][y+1] instanceof Ballroom){
      ballroom.getGreeting();
      ballroom.askPuzzle();
      
        
    }
    x = x;
    y = y+1;
     }  
   
    /**
     * method to move left on the game board
     */
     public void moveLeft()
    {
        
        
    
        if (board[x][y-1] instanceof Library){
      library.getGreeting();
        
     }
    
        if (board[x][y-1] instanceof Kitchen){
            kitchen.getGreeting();

        
     }
    
        if (board[x][y-1] instanceof Bedroom){
      bedroom.getGreeting();
        
     }
    
        if (board[x][y-1] instanceof Ballroom){
      
        ballroom.getGreeting();
      ballroom.askPuzzle();
     }
    x = x;
    y = y-1;
    } 
    
    /**
     * method to move down on the game board
     */
    public void moveDown()
    {
        
        
    
        if (board[x+1][y] instanceof Library){
      library.getGreeting();
        
     }
    
        if (board[x+1][y] instanceof Kitchen){
              kitchen.getGreeting();

     }
    
        if (board[x+1][y] instanceof Bedroom){
        bedroom.getGreeting();
     }
    
        if (board[x+1][y] instanceof Ballroom){
        ballroom.getGreeting();
      ballroom.askPuzzle();
     }
    x = x+1;
    y = y;
    }
    
    /**
     * method to move up on the game board
     */
    public void moveUp()
    {
        
        
    
        if (board[x-1][y] instanceof Library){
        library.getGreeting();
     }
    
        if (board[x-1][y] instanceof Kitchen){
              kitchen.getGreeting();

     }
    
        if (board[x-1][y] instanceof Bedroom){
        bedroom.getGreeting();
     }
    
        if (board[x-1][y] instanceof Ballroom){
        ballroom.getGreeting();
      ballroom.askPuzzle();
     }
    x = x+1;
    y = y;
    }
    
    public void introduction(){
        System.out.println(start.getIntroduction());
    }
}
