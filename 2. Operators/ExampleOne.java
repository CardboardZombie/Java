/*
Author: Tadhg Deeney
Date: 	29/8/2017

Description:
This Program:
Declares 4 Variables: num1, num2, result1, result2; of type int
initialises num1 to 5, num2 to 7, result1 & result2 to default values of 0
adds num1 to num2 and stores the result in result1
multiplies num2 by 5 and stores the result in result2
prints out the value stored in result1 & result2
*/

public class ExampleOne
{
	public static void main(String[] args)
	{
		int num1 = 5,num2 = 7, result1 = 0, result2 = 0;
		result1 = num1 + num2;
		result2  = num2 * 5;
		
		System.out.println("Result One: "+ result1);
		System.out.println("Result Two: "+ result2);
	}
}