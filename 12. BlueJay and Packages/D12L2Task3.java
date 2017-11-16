/**
 * A Program that declares a two dimensional array using the following code in its main method
 * int[][] myDataGrid = { {43,0,7,9,12}, {4,-5,8,17,99}, {-2,36,48,76,15}};
 * print2Darray prints out each element in the array
 *
 *
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 12/9/2017
 */
import java.util.*;

public class D12L2Task3
{
	public static void main(String[] args){
		int[][] myDataGrid = { {43,0,7,9,12}, {4,-5,8,17,99}, {-2,36,48,76,15}};
		myDataGrid = addValueToArray(myDataGrid, 7);
		print2DArray(myDataGrid);
	}
	/**
     * This is method that prints a 2D Array to the Screen.
     * Usage: print2DArray(my2DArray)
     * @param array is a 2D array that is printed to the screen
     * @return void
     */
	public static void print2DArray(int[][] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("{");
			for(int j = 0; j < array[i].length; j++)
			{
				if(j == array[i].length - 1)
					System.out.print(array[i][j]);
				else
					System.out.print(array[i][j]+",");
			}
			if(i == array.length - 1)
				System.out.println("}");
			else
				System.out.println("},");
			
		}
	}
	/**
     * This is method that adds a value to a 2D Array.
     * Usage: addValueToArray(my2DArray, 7)
     * @param array is a 2D array
	 * @param value is the int added to each element in the 2D array
     * @return void
     */
	public static int[][] addValueToArray(int[][] array, int value)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array[i].length; j++)
			{
				array[i][j] += value;
			}
		}
		return array;
	}
}
