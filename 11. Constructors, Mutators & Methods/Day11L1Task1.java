/**
 * A program that creates an array of 50 booleans and 
 * initializes every element of the array to 'true',
 * then prints the contents of the array and 
 * the array index.
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 11/9/2017
 */
public class Day11L1Task1
{
	public static void main(String[] args){
		boolean[] array = new boolean[50]; //Initializing the array of 50 booleans
		
		//Looping through each element in the array to set the value and print to the screen
		for(int i = 0; i < array.length; i++)
		{
			array[i] = true;
			System.out.println("Index: "+i+" - "+array[i]);
		}
	}
}
