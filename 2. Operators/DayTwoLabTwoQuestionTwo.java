/*
Author: Tadhg Deeney
Date: 	29/8/2017

Description:
Program that prints whether an integer called 'number' is odd or even

*/

public class DayTwoLabTwoQuestionTwo
{
	public static void main(String[] args)
	{
		int number = 57;
		if(number%2 == 0)
			System.out.println("The number "+number+" is EVEN");
		else
			System.out.println("The number "+number+" is ODD");
	}
}