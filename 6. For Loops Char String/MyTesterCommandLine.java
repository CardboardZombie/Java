/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: 17186226
Date: 	4/9/2017

Description:
This is a brief introduction to comand line arguments.
The main method is very similar to other methods defined in
a class but unlike the other methods the main method can 
take command line values, i.e. when you use java in a command terminal (black screen).
For Example: 

javac MyTesterCommandLine.java
java MyTesterCommandLine 5
*/

public class MyTesterCommandLine
{
	public static void main(String[] args)
	{
		int value = Integer.parseInt(args[0]);
		
		System.out.println("The value entered was "+value);
		
		//About to use a static method call on the General Maths class
		//passing it the number in value in order to calculate the sigma value
		int x = GeneralMaths.mySigma(value);
		
		System.out.println("The value of "+value+" sigma is: "+x);
		
	}
}