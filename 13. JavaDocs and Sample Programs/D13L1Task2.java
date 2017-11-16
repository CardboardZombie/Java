/**
 * Day 13: Lab 1 - Task 2
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
import java.util.*;														//Imports the Random class
public class D13L1Task2
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);								//Declares and Initializes the Scanner Class
		Random r = new Random();										//Declares & Initializes the Random class
		double[] array = new double[25];								//Declare & Initialize the double array of 25 elements
		double min = 0.0;												//Declare the min value
		double max = 100.0;												//Declare the max value
		boolean rangeIsGood = false;									//Declare & Initialize Boolean to set condition of while loop
		
		while(!rangeIsGood)	 											//While: boolean is false - repeat... finish program
		{
			System.out.println("Enter range of values:");					//Print prompt to the User - Input Whole Number.
			int range = s.nextInt();										//Store the input value - Declare & Initialize range value
			if(range <= array.length && range >= 0)										//If: Range is a lower value than the array length then proceed
			{
				for(int i = 0; i < range; i++)									//For Loop: i until range inside of array.length
				{
					array[i] = min+(max-min)*r.nextDouble();						//Set each element in the Array as a Random Double between 0 & 100
					System.out.println("Index "+i+": "+array[i]);					//Print out the value at each index
				}
				rangeIsGood = true;												//Set Boolean to true to end the While Loop
			}
			else															//Else: Print Error and Repeat While Loop
				System.out.println("Error - Try again!");						//Print Error Message
		}
	}
}
