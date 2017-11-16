/**
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/17

Description:
Write a method according to the following method signature:

public static int squareMe(int x)

Write out comments that tells you what happens when this method is called
run time stack, actual parameters, formal parameters, local variables, and return address
What happens to the run time stack?

*/
import java.util.Scanner;
public class MethodDemo 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(n != 9)
		{
			System.out.println();
			System.out.println("Enter a number to be squared:");
			n = sc.nextInt();
			
			System.out.println("******************************");
			int r = 0;
			// 1)The Method is Called - Creating a space in Memory called a "run time stack"
			// 3)The return address r is reserved in memory.
			r = squareMe(n);
			// 7)The program continues executing by storing the value returned from the method call in r.
			System.out.println("N has now been modified to: "+r);
		}
		
		
    }
	/*
	2)The formal paramter x is created in memory as well as the local variables created.
	4)The actual parameter of n is copied and stored in the formal paramter x
	5)The code block within the method is executed.
	6)The return keyword returns the created value of result to the return address r
	*/
	public static int squareMe(int x)							
	{
		int result = x*x;
		return result;
	}
	//8) the run time stack created and all transient values created are now "destroyed". 
	//Memory is returned to the system to be reused later.
}

