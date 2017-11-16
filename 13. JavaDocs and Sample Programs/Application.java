/**
 * Day 13: Lab 1 - Task 3
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 13/9/2017
 */
public class Application
{
	public static void main(String[] args)
	{
		char[][] array = new char[5][5];			//Create a char 2D array of 5 rows & 5 cols
		fillArray(array, '*');					//Fill the Array with a character
		array[1][1] = '1';						//Override the character in this specific element
		array[1][2] = '1';						//Override the character in this specific element
		array[1][3] = '1';						//Override the character in this specific element
		array[2][2] = '1';						//Override the character in this specific element
		printArray(array);						//Print the contents of the array
	}
	/**
	* This is a method that fills a 2D Array with a character value
	* Loop through each Row
	*	Loop through each Column
	*@param array is a 2D char array
	*@param value is the value to be inserted at each element
	*@return void
	*/
	public static void fillArray(char[][] array, char value)
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
	*@param array is a 2D char array
	*@return void
	*/
	public static void printArray(char[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
			
		}
	}
	
}
