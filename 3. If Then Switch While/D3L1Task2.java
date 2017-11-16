/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	30/8/2017

Description:
This Program is for Day 3 Lab 1
*/

public class D3L1Task2
{
	public static void main(String[] args)
	{
		String month = "";
		int m = 8;
		switch(m)
		{
			case 1:
			{
				month="January";
				break;
			}
			case 2:
			{
				month="February";
				break;
			}
			case 3:
			{
				month="March";
				break;
			}
			case 4:
			{
				month="April";
				break;
			}
			case 5:
			{
				month="May";
				break;
			}
			case 6:
			{
				month="June";
				break;
			}
			case 7:
			{
				month="July";
				break;
			}
			case 8:
			{
				month="August";
				break;
			}
			case 9:
			{
				month="September";
				break;
			}
			case 10:
			{
				month="October";
				break;
			}
			case 11:
			{
				month="November";
				break;
			}
			case 12:
			{
				month="December";
				break;
			}
			default:
			{
				System.out.println("Marchtember is not a valid month");
				break;
			}
			
		}
		System.out.println("This is the month of "+month);
	}
}