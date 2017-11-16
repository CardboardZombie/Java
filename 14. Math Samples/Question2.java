/**
*Day 14: Lab 1 - Task 2
*@author Tadhg Deeney
*@author 17186226
*@version 14/09/2017
*/
import java.util.Scanner;

public class Question2{
	public static void main(String[] args){
		int[] myNumbers = {33, 5, 29, 89, 19, 1, 7, 6, 77, 22, 11};
		int[] result = getLargestAndSmallest(myNumbers);
		for(int i = 0; i < myNumbers.length; i++)
		{
			System.out.println("["+i+"] = "+myNumbers[i]);
		}
		System.out.println("The Smallest Element in the Arrray: "+result[0]);
		System.out.println("The Largest Element in the Arrray: "+result[1]);
	}
	/**
	*Finds the Largest & Smallest Element in the Array
	*Usage: int[] x = getLargestAndSmallest(myNumbers);
	*@param array contains the array of elements to be sorted
	*@return result contains a 2 element array containing the largest and smallest element from the original array
	*/
	public static int[] getLargestAndSmallest(int[] array)
	{
		int[] result = new int[2];
		int limit = array.length;
        int temp = 0;
        // The outer loop determines the number of passes 
        // through the array that will take place. 
        //(i.e. the number of times the whole inner loop is executed)
        // After the first pass (when the inner loop has executed fully),
		// the largest number will be in the last array element position.
        for (int i = 0; i < array.length; i++)
        {
            limit --; // reduce the limit by 1 (starting with the last element)
            for (int j = 0; j< limit; j++)
            {
                // When the current number in the array
                // is greater than the next number, then
                // swap these numbers around
                if(array[j] > array[j+1]){
                
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
		result[0] = array[0];
		result[1] = array[array.length -1];
		return result;
	}
}