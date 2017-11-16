/**
 * Day 13: Lab 1 - Task 1
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
import java.util.Random;										//Imports the Random class
public class D13L1Task1
{
	public static void main(String[] args)
	{
		Random r = new Random();								//Declares & Initializes the Random class
		double[] array = new double[25];						//Declare & Initialize the double array of 25 elements
		double min = 0.0;										//Declare the min value
		double max = 100.0;										//Declare the max value
		
		for(int i = 0; i < array.length; i++)					//For Loop: i until array.length
		{
			array[i] = min+(max-min)*r.nextDouble();			//Set each element in the Array as a Random Double between 0 & 100
			System.out.println("Index "+i+": "+array[i]);		//Print out the value at each index
		}
		
	}//End of main method
	
}
