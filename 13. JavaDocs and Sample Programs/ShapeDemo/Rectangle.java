/**
 * A program that represents a rectangle
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 11/9/2017
 */
public class Rectangle{
    // Each object created using the Rectangle template has its own variables below, (length, width, colour).
    private double length; // only methods inside this class can access this variable.
    private double width; // only methods inside this class can access this variable.
    private String colour; // only methods inside this class can access this variable.
    
    /**
     * Rectangle constructor : 
     * 
     */
    public Rectangle() //Notice there is NO return type for a class constructor.
    {
        length=1.0;
        width=1.0;
		colour="Grey";
    }
    
    /**
     * Rectangle constructor: (Having two constructors for Rectangle Class illustrates the idea of method overloading)
     * 
     * @param a the length of the Rectangle
     * @param b the length of the Rectangle
     * @param col the colour of the Rectangle
     */
    public Rectangle(int a,int b, String col)//Notice there is NO return type for a class constructor.
    {
        length=a;
        width=b;
        colour = col;
    }
    
    /**
     * This provides the length of the Rectangle
     * @return the length of the Rectangle.
     */
    public double getLength(){
        return length;
    }
    
    /**
     * This sets the length of the Rectangle
     * @param num the new value for the length of the Rectangle.
     */
    public void setLength(int num){
        length = num;
    }
    
    /**
     * This provides the width of the Rectangle
     * @return the width of the Rectangle.
     */    
    public double getWidth(){
        return width;
    }
    /**
     * This sets the width of the Rectangle
     * @param num the new value for the width of the Rectangle.
     */
    public void setWidth(int num){
        width = num;
    }
    /**
     * This sets the colour of the Rectangle
     * @param num the new value for the colour of the Rectangle.
     */  
    public void setColour(String colour){
        // the keyword "this" followed by the dot "." operator allows you to specify which variable you intend to use.
        this.colour = colour;    
    }    
    /**
     * This gets the colour of the Rectangle
     * @return String the current value for the colour of the Rectangle.
     */ 
    public String getColour(){
        return colour;
    }
	/**
     * This calculates the Area of the Rectangle
     * @return double the calculated value for the Area of the Rectangle.
     */ 
	public double calculateArea()
	{
		return length*width;
	}
	/**
     * This calculates the Perimeter of the Rectangle
     * @return double the calculated value for the Perimeter of the Rectangle.
     */
	public double calculatePerimeter()
	{
		return 2*(length+width);
	}
}
