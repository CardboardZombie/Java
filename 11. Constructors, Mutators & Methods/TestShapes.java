/**
 * This class is a test class for testing shapes.
 * Two separate rectangular objects using the Rectangle class
 *
 * 1) Use the getter methods to get each of the instance
	  variables and then print these to the screen
 *
 * 2) Pick one of the objects that you have created and 
	  use setter methods to change the values
	  of the class instance variables for that object
 *
 * 3) Then use the getter methods to retrieve the values 
	  from this same object and then print them out to 
	  the screen with a meaningful message to the user.
 * 
 * 4) Test the calculateArea and the calculatePerimeter 
	  methods to calculate the area and the perimeter 
	  for each of the newly created rectangle objects.
 *
 * 5) How would you create an array of ten objects of type 
      Rectangle? Remember that you have not created an 
	  object until you use the class constructor for the 
	  object. Also, each object that you create, must 
	  have its reference stored in a reference variable.
		- Create an array of object references. 
		- Using the default class constructor, 
		  create a new object for each and every one 
		  of the object references in the array of 
		  objects (in turn). 
		  
 * @author Tadhg Deeney
 * @version 11/09/2017
 */
public class TestShapes
{
    public static void main(String [] args){
        Rectangle r1 = new Rectangle(4, 6, "Orange");
		Rectangle r2 = new Rectangle();
		
		//Task 1)
		double rLength = r1.getLength();
		double rWidth = r1.getWidth();
		String rColor = r1.getColour();
		System.out.println("**********Rectangle 1***********");
		System.out.println("Length: "+rLength);
		System.out.println("Width: "+rWidth);
		System.out.println("Colour: "+rColor);
		
		rLength = r2.getLength();
		rWidth = r2.getWidth();
		rColor = r2.getColour();
		System.out.println("**********Rectangle 2***********");
		System.out.println("Length: "+rLength);
		System.out.println("Width: "+rWidth);
		System.out.println("Colour: "+rColor);
		//Task 2)
		r2.setLength(64);
		r2.setWidth(56);
		r2.setColour("Green");
		//Task 3)
		rLength = r2.getLength();
		rWidth = r2.getWidth();
		rColor = r2.getColour();
		System.out.println("**********Rectangle 2***********");
		System.out.println("Length: "+rLength);
		System.out.println("Width: "+rWidth);
		System.out.println("Colour: "+rColor);
		//Task 4)
		System.out.println("R1 AREA: "+r1.calculateArea());
		System.out.println("R1 PERIMETER: "+r1.calculatePerimeter());
		System.out.println("R2 AREA: "+r2.calculateArea());
		System.out.println("R2 PERIMETER: "+r2.calculatePerimeter());
		//Task 5)
		Rectangle[] arrayOfRectangles = new Rectangle[10];
		for(int i = 0; i < arrayOfRectangles.length; i++)
		{
			arrayOfRectangles[i] = new Rectangle();
			System.out.println("L: "+arrayOfRectangles[i].getLength() + " W: "+arrayOfRectangles[i].getWidth()+" C: "+arrayOfRectangles[i].getColour());
		}
		
    }
}
