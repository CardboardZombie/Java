/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	4/9/2017

Description:
Lab Task Sheets
*/

public class D6L2Task6c
{
	public static void main(String[] args)
	{
		String str1 = new String("I drink tea");
		//System.out.println(str1.replaceAll("\\s+", "\n"));
		
		String[] words = str1.split(" ");
		
		for(String word : words)
		{
			System.out.println(word);
		}
		
	}
}