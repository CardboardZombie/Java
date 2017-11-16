/**
 * Day 14: Lab 2 - Task 3
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 14/9/2017
 */

public class MathsTester
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				int x = toPowerOf(j, i);
				System.out.println(j+" to the power of "+i+" is "+x);
			}
		}
		
	}
	/**
	*Description: This method returns the value of the first argument raised to the power of the second arguement.
	*Syntax: int x = toPowerOf(int a, int b);
	*@param a is the first Value.
	*@param b is the value the first value is to the power of. ie a^b.
	*@return result is the param a to the power of b.
	*/
	public static int toPowerOf(int a, int b)
	{
		int result = 1;
		for(int i = 1; i <= b; i++)
		{
			result *= a;
		}
		return result;
	}
}