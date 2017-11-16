/**
 * Day 13: Morning Demo - Recursion
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
public class AfternoonDemo
{
	public static void main(String[] args)
	{
		printR(4);
	}
	public static void printR(int n)
	{
		
		if (n >= 1)
		{
			System.out.println("Recursion in action");
			printR(n-1);
		}
	}
}
