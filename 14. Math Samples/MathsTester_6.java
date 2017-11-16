/**
 * Day 14: Lab 2 - Task 3
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 14/9/2017
 */

public class MathsTester_6
{
	public static void main(String[] args)
	{
		int total = 0;
		int[][] array = new int[3][10];
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				int x = toPowerOf(j+1, i+1);
				array[i][j] = x;
				System.out.println((j+1)+" ^ "+(i+1)+" = "+x);
				total+= x;
			}
		}
		System.out.println("Total: "+total);
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