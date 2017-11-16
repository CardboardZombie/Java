/**
 * Day 13: Morning Demo - Recursion
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
import java.util.Scanner;
public class ErastosthenesSieve
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		int gCD = greatestCommonDenom(n1, n2);
		int lCM = leastCommonMulti(n1, n2, gCD);
		System.out.println("GCD: "+gCD);
		System.out.println("LCM: "+lCM);*/
	}
	public static int[] removeMultiples(int n)
	{
		int[] result = new int[n];
		for(int i = 2; i<= n; i++)
		{
			
		}
		
		
	}
	public static int greatestCommonDenom(int a, int b)
	{
		int r = 0;
		int q = 0;
		
		if (b == 0)
		{
			q = b/a;
			r = b%a;
		}
		else
		{
			q = a/b;
			r = a%b;
		}
		if(r == 0)
			return b;
		else
			return greatestCommonDenom(b,r);
	}
	public static int leastCommonMulti(int a, int b, int gCD)
	{
		int absolute = -1;
		if(a < 0 || b < 0)
			return absolute*(a*b)/gCD;
		else
			return a*b/gCD;
	}
}
