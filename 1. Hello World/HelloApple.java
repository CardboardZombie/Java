/*
Author: Tadhg Deeney
Date: 	28/8/2017

Description:
This Program is a Java Application for exploring Integers.
*/

public class HelloApple
{
	public static void main(String[] args)
	{
		int lives = 5;
		//Declare and Assign a value of 3 to your Apple Variable
		int wumpaFruit = 0;
		//Add 10 to the Variable "apple" [+=] is a shortcut for var = var +
		
		//Game Loop
		//If wumpaFruit is collected - value increases
		wumpaFruit ++;
		//If wumpaFruit reaches 100 - Gain a Life
		if(wumpaFruit == 100)
		{
			wumpaFruit = 0;
			lives ++;
		}
		//If lives < 0 the Game is Over
		if(lives < 0)
		{
			System.out.println("Game Over");
			return;
		}
		
		System.out.println("The apple value is "+wumpaFruit);
	}
}