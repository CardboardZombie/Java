/**
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/17

Description:
Write a method according to the following method signature:

public static void changeArray(int[] values, int x)

This method takes an array reference paramter and an int 
parameter. It then fills the array with the value x.

*/
public class MethodArrayDemo 
{
    public static void main(String[] args) 
	{
		int[]a = {1,1,2,3,4,5,6,3,4,2};
		
		printArray(a);
		changeArray(a, 25);
		System.out.println("\n*********VALUES CHANGED*********");
		printArray(a);
		
    }
	public static void changeArray(int[] values, int x)							
	{
		for(int i = 0; i < values.length; i++)
		{
			values[i] = x;
		}
	}
	public static void printArray(int[] array)
	{
		System.out.println();
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}

