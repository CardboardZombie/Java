/**
 * Day 14: Lab 2 - Task 1
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 14/9/2017
 */

public class TesterStatic
{
	public static void main(String[] args)
	{
		int result = MyApp.factorial(5);
		System.out.println("Result: "+result);
		
		int n = MathsTester.toPowerOf(7, 3);
		System.out.println("N: "+n);
	}
}