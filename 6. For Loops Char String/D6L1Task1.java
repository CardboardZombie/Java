/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	4/9/2017

Description:
Demo Array Program
*/

public class D6L1Task1
{
	public static void main(String[] args)
	{
		// declares an array of integers
        int[] anArray = new int[10];

        for(int i = 0; i < anArray.length; i++)
		{
			anArray[i] = 42;
			System.out.println(" Element at index "+i+": " + anArray[i]);
		}
	}
}