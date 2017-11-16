/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	4/9/2017

Description:
Lab Task Sheets
*/

public class D6L2Task5
{
	public static void main(String[] args)
	{
		String nice = new String("What a nice day");
		String not = new String("no it is not");
		
		int lengthNice = nice.length();
		int lengthNot = not.length();
		
		System.out.println("i) "+lengthNice+" "+lengthNot);
		System.out.println("ii) "+nice.charAt(5));
		System.out.println("iii) "+nice.toUpperCase()+" "+not.toLowerCase());
		
		char a = 'a';
		char i = 'i';
		
		System.out.println("iv) "+nice.replace(a, i)+" "+not.replace(i, a));
	}
}