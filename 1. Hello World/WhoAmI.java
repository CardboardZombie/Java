import java.util.Scanner;
/**
Author: Tadhg Deeney
Date: 	28/8/2017

Description:
This Program is a Java Application for Recording the User Information.
*/

public class WhoAmI
{
	public static void main(String[] args)
	{
		//Create an instance of the Scanner
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your name:");
		//Creates a Variable to store the Name
		String myName = kb.nextLine();//"Tadhg Deeney";
		
		System.out.println("Enter your student number:");
		int stdNumber = kb.nextInt();
		//Prints the myName variable contents
		System.out.println("Your name is: "+myName);
		
		//Sample Student Number
		//stdNumber = 200345;
		
		//Create another Variable to Store Student Number
		String str="Error: Student number unknown";
		System.out.println(str);
	}
}