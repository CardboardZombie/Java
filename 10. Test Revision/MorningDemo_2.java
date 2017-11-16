/**
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/17

Description:
Day Ten: Lab

*/

public class MorningDemo_2
{
    public static void main(String[] args) 
	{
		System.out.println();
		//Task 1 - Create a 2D Array
		int [][] myValues = { 
			{23,38,14,7},
			{-3, 0,14,4},
			{ 9, 13,0,3},
		};
		//Task 2 Create a Loop to Print the Array
		for(int i = 0; i < myValues.length ; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.print("["+myValues[i][j]+"]");
			}
			System.out.println();
		}
		//Task 4
		change2D(myValues);
		System.out.println("\n****VALUES CHANGED****\n");
		//Task 5
		for(int i = 0; i < myValues.length ; i++)
		{
			for(int j = 0; j < myValues[i].length; j++)
			{
				System.out.print("["+myValues[i][j]+"]");
			}
			System.out.println();
		}
		//Task 6
		change2DValue(myValues, 116);
		//Task 7
		boolean checkedValue = check2DValue(myValues, 116);
		System.out.println();
		System.out.println(checkedValue);
    }
	
	//Task 3
	public static void change2D(int [][] myList)
	{
		for(int i = 0; i < myList.length ; i++)
		{
			for(int j = 0; j < myList[i].length; j++)
			{
				myList[i][j] = 42;
			}
		}
	}
	public static void change2DValue(int [][] myList, int x)
	{
		for(int i = 0; i < myList.length ; i++)
		{
			for(int j = 0; j < myList[i].length; j++)
			{
				myList[i][j] = x;
			}
		}
	}
	public static boolean check2DValue(int [][] myList, int x)
	{
		for(int i = 0; i < myList.length ; i++)
		{
			for(int j = 0; j < myList[i].length; j++)
			{
				if(myList[i][j] == x)
				return true;
			}
		}
		return false;
	}
}

