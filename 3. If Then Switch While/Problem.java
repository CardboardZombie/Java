/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	30/8/2017

Description:
This Program extracts each number in a 3 digit number in decimal format.
*/

import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Problem
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = (int)(Math.log10(n)+1);
		int count = 0;
		int r = -1;
		int[] a = new int[length];
		
		while(n > 0)
		{
			r = n%10; 		//Yields the Modulus of the whole Number
			n /= 10;  		//Divides the Whole Number by 10
			a[count] = r;	//Adds it to the Array
			count++;		//Increase the space in the Array
			
		}
		for(int i = a.length-1; i >= 0; i--)
		{
			System.out.println(a[i]);
		}
	}
}