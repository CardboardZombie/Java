/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: 17186226
Date: 	4/9/2017

Description:
This class retrieves the command line arguements from running java Echo
and prints them back to the user

e.g. On the command line, having first compiled the Echo.java file using javac,
if the user then typed in :
	java Echo apple pear orange
then the output would be : 

0 : apple
1 : pear
2 : orange
*/

public class Echo
{
	public static void main(String[] args)
	{
		for(int s = 0; s < args.length; s++)
		{
			System.out.println(s+" : "+args[s]);
		}
		System.out.println("Above is a list of arguments that were provided when the main method of this program was run");
		
	}
}