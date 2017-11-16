/**
 * A program that modifies Q1 to initialize every 3rd  
 * element of the boolean array to "false",
 * then prints the contents of the array
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 11/9/2017
 */
import java.util.Arrays;

public class D11L1Task2
{
	public static void main(String[] args){
		boolean[] array = new boolean[50]; //Initializing the array of 50 booleans
		Arrays.fill(array, 0, 49, true);
		//Looping through each element in the array to set the value and print to the screen
		for(int i = 0; i < array.length; i++)
		{
			//Checks if the element is divisible by 3
			if((i+1)%3==0)
				array[i] = false; //Sets every 3rd element = false
			//Prints out the contents of the array
			System.out.println("Index: "+i+" - "+array[i]);
		}
	}
}
