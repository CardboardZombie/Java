/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	30/8/2017

Description:
This Program is designed to test If Else Statement Syntax.
*/

public class SwitchDays
{
	public static void main(String[] args)
	{
		System.out.println(); //To buffer the commandline
		
		int month = 3;
		switch(month)
		{
			case 1:
			{
				System.out.println("Monday");
				break;
			}
			case 2:
			{
				System.out.println("Tuesday");
				break;
			}
			case 3:
			{
				System.out.println("Wednesday");
				break;
			}
			case 4:
			{
				System.out.println("Thursday");
				break;
			}
			case 5:
			{
				System.out.println("Friday");
				break;
			}
			case 6:
			{
				System.out.println("Saturday");
				break;
			}
			case 7:
			{
				System.out.println("Sunday");
				break;
			}
			default :
			{
				System.out.println("Some day is not a valid Day!");
				break;
			}
		}
	}
}