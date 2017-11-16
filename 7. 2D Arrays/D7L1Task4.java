/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
This Program is for Day 7 Lab 1
*/
import java.util.Scanner;

public class D7L1Task4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String Value:");
		String n = sc.nextLine();
		
		printFirstInitial(n);
	}
	public static void printFirstInitial(String n)
	{
		System.out.println(n.charAt(0));
	}
}