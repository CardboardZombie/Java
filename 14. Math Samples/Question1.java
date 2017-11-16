/**
*Day 14: Lab 1 - Task 1
*@author Tadhg Deeney
*@author 17186226
*@version 14/09/2017
*/
import java.util.Scanner;

public class Question1{
	public static void main(String[] args){
		int[] myNumbers = {33, 5, 29, 89, 19, 1, 7, 6, 77, 22, 11};
		int largestInt = findLargest(myNumbers);
		int smallestInt = findSmallest(myNumbers);
		System.out.println("The Largest Element in the Arrray: "+largestInt);
		System.out.println("The Smallest Element in the Arrray: "+smallestInt);
	}
	/**
	*Finds the Largest Element in the Array
	*Usage: int x = largestInt(numArray);
	*@param array contains the elements to be searched
	*@return result contains the largest element in the array
	*/
	public static int findLargest(int[] array)
	{
		int result = array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(result < array[i])
				result = array[i];
		}
		return result;
	}
	/**
	*Finds the Smallest Element in the Array
	*Usage: int x = smallestInt(numArray);
	*@param array contains the elements to be searched
	*@return result contains the smallest element in the array
	*/
	public static int findSmallest(int[] array)
	{
		int result =  array[0];
		for(int i = 0; i < array.length; i++)
		{
			if(result > array[i])
				result = array[i];
		}
		return result;
	}
}