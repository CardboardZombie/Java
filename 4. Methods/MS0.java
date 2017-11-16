
/**
 * This program illustrates the essential aspects of declaring a method 
 * and using this method in the main method of the application.
 * 
 * @author Joe Duffin 
 * @version 4/09/2013
 */
public class MS0
{
    public static void main(String args[])
    {
        int count=0;
        // This is a method call or a method invocation.
        // Notice that this method is designed not to take any parameters.
        myPrintMsg(); // this is a method call or a method invocation.
        
		System.out.println(" what is sequential execution of a program");
		
		myPrintMsg();
       
    }
    /**
     * This is the method declaration
     */
    // The first line below is the method signature.
    // void means that it does not return any values. 
    // Notice also that it does not take any parameters.
    public static void myPrintMsg()
    {
        System.out.println("Hello World");
    }
}
