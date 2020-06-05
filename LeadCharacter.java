import java.util.ArrayList;
/**
 * Class that represents lead character (player)
 *
 * @author Joe McDonald
 * @version 2019
 */
public class LeadCharacter extends Character
{
    private ArrayList<Item> inventory;
    private Enemy enemy;
    private Puzzler puzzler;
    private Gamer gamer;
    private Sword sword;
    private Shield shield;
    private SpecialKey specialKey;
    
    

    /**
     * Constructor for objects of class LeadCharacter
     */
    public LeadCharacter(String greeting)
    {
        // initialise instance variables
        super(greeting);
        inventory = new ArrayList<Item>();
        enemy = new Enemy("");
        puzzler = new Puzzler ("");
        gamer = new Gamer("");
        sword = new Sword();
        shield = new Shield();
        specialKey = new SpecialKey();
        
        
    }

    /**
     * method that adds item to players inventory
     * @param Item item to be added to inverntory
     */
    public void addItem(Item item)
    {
        inventory.add(item);
    }
    
    /**
     * method that answers puzzle asked by puzzler
     * @param int, answer to puzzle 1
     */
    public void answerPuzzle(int answer)
    {
        
        puzzler.puzzle1(answer);
        if (answer == 105){
            inventory.add(sword);
            inventory.add(shield);
            System.out.println(answer + "... Is Correct, a sword and sheild have" 
           +" been added to your inventory");  
        }
        
        else {
            System.out.println(answer + "... Is Incorrect. Try again");
        }
        
    }
    
    /**
     * method that draws two cards for player
     * @return double, overall from two cards
     */
    public double playGame()
    {
        
        double card1 = (int)(Math.random()*((11-1)+1))+1;
        double card2 = (int)(Math.random()*((11-1)+1))+1;
        double overall = card1+card2;
        System.out.println("Your first card is..." + card1);
        System.out.println("Your second card is..." + card2);
        System.out.println("Therefore you have..." + overall);
        
        return overall;
    }
    
    /**
     * method that rolls dice for player
     * @return double, dice result
     */
    public double playGame2()
    {
        double roll = (int)(Math.random()*((6-1)+1))+1; 
        return roll;
    }
    

   /**
     * method that simulated fighht with enemy
     */
    public void fightEnemy()
    {
        while (enemy.getHealth() > 0){
            if (inventory.contains(sword)){
                enemy.getHit(25);
                if (inventory.contains(shield)){
                    System.out.println("Your shield has block the blow");
                }
                else{
                    int newLife = getHealth() - 20;  
                    setHealth(newLife);
                    System.out.println("You have been hit, your life is now..." + newLife);
                         if (getHealth() <= 0){
                             System.out.println("GAME OVER");
                             break;
                    }
               }
        
             }
     else {
          enemy.getHit(10);
           if (inventory.contains(shield)){
                    System.out.println("Your shield has block the blow");
                }
                else{
                    int newLife = getHealth() - 20;  
                    setHealth(newLife);
                    System.out.println("You have been hit, your life is now..." + newLife);
                         if (getHealth() <= 0){
                             System.out.println("GAME OVER");
                             break; 
                    }
               }
        }
    }
    }
    
    /**
     * method that simulates player taking damage
     */
    public void getHit()
    {
     int newLife = getHealth() - 20;  
     setHealth(newLife);
     System.out.println("Your life is now..." + newLife);   
    }
    
    /**
     * method that picks up potion
     */
    public void pickUpPotion(){
     Potion potion = new Potion();   
     inventory.add(potion);
    }
    
    /**
     * method that heals player with potion
     */
    public void heal()
    {
       for (Item item: inventory){
         if (item instanceof Potion){
         setHealth(100);
         System.out.println("You have healed, your health is now..." + getHealth());
        }
      }
    }
    

    /**
     * method that searches under bed
     *
     */
    public void underBed()
    {
        // put your code here
        System.out.println("Nothing here");
    }
    
    /**
     * method that searches under pillow
     *
     */
    public void underPillow()
    {
        // put your code here
        System.out.println("A key has been added to your inventory");
        Key key = new Key();
        inventory.add(key);
        
        
    }
    
    /**
     * method that searches in wardrobe
     *
     */
    public void lookWardrobe()
    {
        // put your code here
        System.out.println("Nothing here");
    }
    
    /**
     * method that searches under pillow in second bedroom
     *
     */
    public void underPillow2()
    {
        // put your code here
        System.out.println("Nothing here");
    }
    
    /**
     * method that looks under bed in second bedroom
     *
     */
    public void underBed2()
    {
        // put your code here
        System.out.println("A key has been added to your inventory");
        inventory.add(specialKey);
        
    }
    
    /**
     * method that looks in wardrobe in second bedroom
     */
    public void lookWardrobe2()
    {
        // put your code here
        System.out.println("There is a safe");
        if (inventory.contains(specialKey)){
          System.out.println("You have unlocked the safe, it contains the secret map to escape. GAME COMPLETE");
        }
        
        else {
            System.out.println("You do not have the key to unlock the safe");
        }
        
        
    }
    
}
