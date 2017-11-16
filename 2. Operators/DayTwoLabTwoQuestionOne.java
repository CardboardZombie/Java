/*
Author: Tadhg Deeney
Date: 	29/8/2017

Description:
Prints a Message telling the User whether one number is 
greater than, 
less than 
or equal to another
*/

public class DayTwoLabTwoQuestionOne
{
	public static void main(String[] args)
	{
		int x = 3;
		int y = 10;
		System.out.println("x is "+x+", y is "+y+".");
		if(x < y)
		{
			System.out.println("x is less than y");
		}
		if(x > y)
		{
			System.out.println("x is greater than y");
		}
		if(x == y)
		{
			System.out.println("x is equal to y");
		}
	}
}