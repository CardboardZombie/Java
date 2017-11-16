/*
Author: Tadhg Deeney
Date: 	29/8/2017

Description:
1. Declares 2 Variables of type int
2. Identifiers are n1 & n2
3. Value of 10 is placed inside n1
4. Value of 20 is placed inside n2
5. Prints the Value of N1 and n2 separately
6. Assignment operator assigns the variable n1 to the value of n1 + n2
7. Prints the value of n1
*/

public class PracticeOperator
{
	public static void main(String[] args)
	{
		//Steps 1 - 4
		int n1 = 10;
		int n2 = 20;
		//Step 5
		System.out.println(n1);
		System.out.println(n2);
		//Step 6
		n1+=n2;
		//Step 7
		System.out.println(n1);
	}
}