/**
 * Day 13: Lab 1 - Task 4
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
public class D13L2Task2
{
	public static void main(String[] args)
	{
		int[][] a1 = new int[5][5];			//Create an int 2D array of 5 rows & 5 cols
		fillArray(a1, 1);					//Fill the Array with a character
		printIndex(a1);						//Print the contents of the array
	}
	/**
	* This is a method that fills a 2D Array with an integer value
	* Loop through each Row
	*	Loop through each Column
	*@param array is a 2D int array
	*@param value is the value to be inserted at each element
	*@return void
	*/
	public static void fillArray(int[][] array, int value)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] = value;
			}
		}
	}
	/**
	* This is a method that prints each element in a 2D Array
	* Loop through each Row
	*	Loop through each Column
	*@param array is a 2D int array
	*@return void
	*/
	public static void printArray(int[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print("["+array[i][j]+"]");
			}
			System.out.println();
			
		}
	}
	/**
	* This is a method that prints each index in a 2D Array
	* Loop through each Row
	*	Loop through each Column
	*@param array is a 2D int array
	*@return void
	*/
	public static void printIndex(int[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print("["+i+","+j+"]");
			}
			System.out.println();
			
		}
	}
	
}
