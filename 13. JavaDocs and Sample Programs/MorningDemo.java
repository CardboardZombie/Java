/**
 * Day 13: Morning Demo - Recursion
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
public class MorningDemo
{
	public static void main(String[] args)
	{
		int n1 = method(5);
		System.out.println("N: "+n1);
	}
	public static int method(int n)
	{
		if (n == 2)
			return 0;
		else
			return method(n-1)+1;
	}
}
