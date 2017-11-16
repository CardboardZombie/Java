/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
This Program is for Day 7 Lab 1
*/
import java.util.Scanner;

public class D7L1Task3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Double Value:");
		double n = sc.nextDouble();
		
		printHalf(n);
	}
	public static void printHalf(double n)
	{
		System.out.println(n/2);
	}
}