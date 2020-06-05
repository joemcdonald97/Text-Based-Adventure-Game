

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestGetGreeting.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TestGetGreeting
{
    /**
     * Default constructor for test class TestGetGreeting
     */
    public TestGetGreeting()
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
    public void testGetGreeting()
    {
        Library library1 = new Library();
        Ballroom ballroom1 = new Ballroom();
        Kitchen kitchen1 = new Kitchen();
        Bedroom bedroom1 = new Bedroom();
        library1.getGreeting();
        ballroom1.getGreeting();
        kitchen1.getGreeting();
        bedroom1.getGreeting();
    }
}

