/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	4/9/2017

Description:
Demo Array Program
*/

public class D6L1Task3
{
	public static void main(String[] args)
	{
		// declares an array of integers
        int[] array = {5, 60, 4, 54, 30, 20, 9};
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
			if(array[i] > 50)
				System.out.println("Element at index "+i+": "+array[i]);
		}
		System.out.println("Sum: "+sum);
	}
}