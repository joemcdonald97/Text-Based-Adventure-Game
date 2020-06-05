

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestLeadCharacter.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestLeadCharacter
{
    /**
     * Default constructor for test class TestLeadCharacter
     */
    public TestLeadCharacter()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void answerPuzzle100()
    {
        LeadCharacter leadChar1 = new LeadCharacter("");
        leadChar1.answerPuzzle(100);
    }

    @Test
    public void answerPuzzle105()
    {
        LeadCharacter leadChar1 = new LeadCharacter("");
        leadChar1.answerPuzzle(105);
        
    }

    

    @Test
    public void fightEnemyLose()
    {
        LeadCharacter leadChar1 = new LeadCharacter("");
        leadChar1.fightEnemy();
    }

    @Test
    public void getHit()
    {
        LeadCharacter leadChar1 = new LeadCharacter("");
        leadChar1.getHit();
    }

    @Test
    public void heal()
    {
        LeadCharacter leadChar1 = new LeadCharacter("");
        leadChar1.heal();
    }

    @Test
    public void look()
    {
        LeadCharacter leadChar1 = new LeadCharacter("");
        leadChar1.lookWardrobe();
        leadChar1.lookWardrobe2();
        leadChar1.underBed();
        leadChar1.underBed2();
        leadChar1.underPillow();
        leadChar1.underPillow2();
    }
}







