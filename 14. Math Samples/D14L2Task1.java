/**
 * Day 14: Lab 2 - Task 1
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 14/9/2017
 */

public class D14L2Task1
{
	public static void main(String[] args)
	{
		int result = 0;
		int[] array = {3,6,4,5,11,9,12,7,10,8};
		for(int i = 0; i < array.length; i++)
		{
			result = factorial(array[i]);
			System.out.print("Factorial["+array[i]+"]: "+result);
			result = sigma(array[i]);
			System.out.println("\t\t\tSigma["+array[i]+"]: "+result);
		}
		
	}
	public static int factorial(int n)
	{
		if(n <= 1)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static int sigma(int n)
	{
		if(n <= 1)
			return 1;
		else
			return (n+sigma(n-1));
	}
	
}