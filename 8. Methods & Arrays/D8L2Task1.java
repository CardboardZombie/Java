/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Write a program that takes in a String from the user
(Command line or Scanner) and prints the String itself
and the string's length back to the user

Input:

Hello World

Output:

Hello World : 11

*/
import java.util.Scanner;
public class D8L2Task1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println(s+" : "+s.length());
	}
}