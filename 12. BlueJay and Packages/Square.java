/**
 * A program that represents a square
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 12/9/2017
 */
public class Square{
    // Each object created using the Square template has its own variable below, (length).
    private double length; // only methods inside this class can access this variable.
	/**
     * Square constructor : 
     * 
     */
    public Square() //Notice there is NO return type for a class constructor.
    {
        length=1.0;
    }
    
    /**
     * Square constructor: (Having two constructors for Square Class illustrates the idea of method overloading)
     * 
     * @param a the length of the Rectangle
     */
    public Square(int a)//Notice there is NO return type for a class constructor.
    {
        length=a;
    }
    
    /**
     * This provides the length of the Square
     * @return the length of the Square.
     */
    public double getLength(){
        return length;
    }
    
    /**
     * This sets the length of the Square
     * @param num the new value for the length of the Square.
     */
    public void setLength(int num){
        length = num;
    }
	/**
     * This calculates the Area of the Square
     * @return double the calculated value for the Area of the Square.
     */ 
	public double calculateArea()
	{
		return length*length;
	}
	/**
     * This calculates the Perimeter of the Rectangle
     * @return double the calculated value for the Perimeter of the Rectangle.
     */
	public double calculatePerimeter()
	{
		return 4*length;
	}
}
