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

public class D12L2Task2
{
	public static void main(String[] args){
		int[][] myDataGrid = {{43,0,7,9,12}, {4,-5,8,17,99}, {-2,36,48,76,15}};
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
}
