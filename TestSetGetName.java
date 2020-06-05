

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestSetGetName.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestSetGetName
{
    /**
     * Default constructor for test class TestSetGetName
     */
    public TestSetGetName()
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
    public void getSetItem()
    {
        Shield shield1 = new Shield();
        Sword sword1 = new Sword();
        SpecialKey specialK1 = new SpecialKey();
        Key key1 = new Key();
        Potion potion1 = new Potion();
        shield1.setName("shield");
        assertEquals("shield", shield1.getName());
        assertEquals("sword", sword1.getName());
        assertEquals("Special Key", specialK1.getName());
        assertEquals("key", key1.getName());
        assertEquals("potion", potion1.getName());
    }
}

