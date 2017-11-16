/*
Author: Tadhg Deeney
Date: 	29/8/2017

Description:
This Program is designed to explain Assignment Operators.
*/

public class AssignmentTest
{
	public static void main(String[] args)
	{
		int quotient = 7/3; 	//Result = 2 i.e. How many times does 3 divide into 7
		int remainder = 7%3;	//Result = 1 i.e. What value is left after 3 is divided into 7
		
		int result = -1;
		int n1 = 5, n2 = 6, n3 = 3;
		
		n1++;
		n2--;
		System.out.println("Number One: "+n1);
		System.out.println("Number Two: "+n2);
		result = (n1 + n2) * n3;
		
		System.out.print(result);
	}
}