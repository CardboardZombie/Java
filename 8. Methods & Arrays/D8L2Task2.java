/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Reusing Q1, add a loop to the program that prints each
of the characters of the User's string on a new line

Input:

Hello World

Output:

H
e
l
l
o

W
o
r
l
d

*/
import java.util.Scanner;
public class D8L2Task2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println();
		
		for(int i = 0; i < s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
	}
}