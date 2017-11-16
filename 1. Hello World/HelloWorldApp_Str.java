/*
Author: Tadhg Deeney
Date: 	28/8/2017

Description:
This Program is a Java Application for using a variable to print "Hello World".
*/

public class HelloWorldApp_Str
{
	public static void main(String[] args)
	{
		//Creates a Variable for storing a String of Characters
		String hw = "Hello World!";
		//Prints "hw"
		System.out.println(hw);
		
		//Create another Variable of String type
		//A String is a value delimited by quotes ""
		String str="This is a String Variable.";
		System.out.println(str);
		
		//Prints the 1st String + "[space]" + 2nd String all as one line
		System.out.println(hw+" "+str);
	}
}