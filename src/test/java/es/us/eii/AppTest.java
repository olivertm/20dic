package es.us.eii;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFibonacci(){
        App test = new App();
		assertTrue(test.fibonacci(1) == 1);
    }
	
	public void testFibonacci2(){
		App test = new App();
		assertTrue(test.fibonacci(10) == 5);
	}
	
}
