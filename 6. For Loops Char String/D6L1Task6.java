/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	4/9/2017

Description:
Demo Array Program
*/
import java.util.Scanner;

public class D6L1Task6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int n = sc.nextInt();
		int[] a = new int[n];
		int l = 0;
		int li = 0;
		for(int i = 0; i < a.length; i++)
		{
			System.out.println("Enter next Element:");
			a[i] = sc.nextInt();
			if(l < a[i]){
				l = a[i];
				li = i;
			}	
		}
		
		System.out.println("a["+li+"] = "+a[li] );
		
		for(int k = 0; k < n; k++)
		{
			if(a[k] == 5){
				System.out.print(k+" ");
			}
				
		}
	}
}