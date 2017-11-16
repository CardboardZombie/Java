/**
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/17

Description:
Day Nine: Classes & Objects

Template Object
Step 1: Create the property variables
Step 2: Create a constructor
Step 3: Add the Getters & Setters
Step 4: Add the associated Methods for this Template
*/
public class Point
{
    private int x; 
	private int y;
    
    public Point(int a, int b)
    {
        x = a;
		y = b;
    }
    
    public int getX(){ 
        return x; 
    }
    public int getY(){ 
        return y; 
    }
	
    public void setX(int n){
        
        x = n;
    } 
    public void setY(int n){
        
        y = n;
    } 
	
	public void printPoint()
	{
		System.out.println("Point coordinates are ("+x+","+y+")");
	}

}