/*
Author: Tadhg Deeney
Date: 	29/8/2017

Description:
This Program is designed to print a Sample Shopping List.
Using a For Loop to add the List Number for each Item.
*/

public class ShoppingList_v2
{
	public static void main(String[] args)
	{
		String divider = "****************";
		System.out.println(divider);
		System.out.println("My Shopping List");
		System.out.println(divider);
		for(int i = 0; i < 50; i++)
		{
			System.out.println((i+1)+".\t My Item");
		}
	}
}