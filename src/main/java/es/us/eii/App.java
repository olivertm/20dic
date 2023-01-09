package es.us.eii;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
	
	public int fibonacci(int a){
	
		if (a >= 2){
			return (fibonacci(a-1) + fibonacci(a-2));
		}
	
	}
}