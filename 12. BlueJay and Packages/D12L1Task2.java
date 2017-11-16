/**
 * A program that creates an array of 30 ints and 
 * initializes every element of the array to a random value,
 * between 0 and 100. 
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 12/9/2017
 */
import java.util.*;

public class D12L1Task2
{
	public static void main(String[] args){
		Random r = new Random();
		int[] array = new int[30]; //Initializing the array of 30 ints
		//Looping through each element in the array to set the value and print to the screen
		int[] arrayTwo = new int[30];
		Arrays.fill(arrayTwo, 0, 29, 0);
		for(int i = 0; i < array.length; i++)
		{
			array[i] = r.nextInt(100);
			arrayTwo[i] = array[i];
			array[i] += 10;
			arrayTwo[i] += 20;
			System.out.print("Index: "+i+" - "+array[i]);
			System.out.println("\tIndex: "+i+" - "+arrayTwo[i]);
		}
	}
}
