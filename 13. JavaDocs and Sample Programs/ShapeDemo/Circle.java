/**
 * The Class Circle is simplified reperesentation of a two-dimensional circle.
 * This Circle class will inherit from the TwoDShape class.
 * 
 * @author Tadhg Deeney
 * @author 17186226
 * @version 13/09/2017
 */
public class Circle extends TwoDShape
{
    private int radius;//The radius of the circle
    /**
     * Constructor for objects of class Circle
     */
    public Circle(int r)
    {
        radius = r;//set radius to the passed value of r
    }
    /**
     * Circle constructor : 
     * @param r the radius of the circle
     */
    public Circle(int r, String colourValue, String shapeType) //Notice there is NO return type for a class constructor.
    {
        super(shapeType, colourValue); // use the constructor in the parent (super class)
        radius = r;// set the class attribute (variable) radius equal to len
    }
    /**
     * This provides the radius of the circle
     * @return the radius of the circle.
     */
    public int getRadius(){ // getter method
        return radius; // return the value of the class attribute radius
    }
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setRadius(int num){ // Setter method
        
        radius = num; // set the class attribute (variable) radius equal to num
    } 
}