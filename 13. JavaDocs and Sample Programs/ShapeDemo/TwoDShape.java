
/**
 * Simple TwoDShape class used to illustrated the idea of inheritance.
 * This class is the superclass in our simple class hierarchy.
 * The class contains one class attribute named colour as well as containing the following:
 * two class constructors
 * getter method for retrieveing the value of the class attribute
 * setter method for changing the value of the class attribute
 *
 * @author Joe Duffin 
 * @author 8830133932
 * @version 10/03/2014
 */
public class TwoDShape
{
    private String colour; // class attribute colour for the colour of the shape.
    private String shapeType;
    /**
     * Constructor for objects of class TwoDShape
     */
    public TwoDShape()
    {
        shapeType = "Two dimensional shape";
        colour = "Grey"; // set the default coulour to "Grey".
    }
    /**
     * Constructor for objects of class TwoDShape
     */
    public TwoDShape(String shape, String col)
    {
        shapeType = shape;
        colour = col; // initialise the colour attribute using a passed col parameter
    }
    /**
     * setter method for the class instance variable colour
     * @param  colourValue   the value to set the class instance variable colour to.
     * @return void
     */
    public void setColour(String  colourValue)
    {
        colour = colourValue ; // set the class instance variable to the value in the formal parameter val.
    }
    /**
     * setter method for the class instance variable shapetype
     * @param  shapeValue   the value to set the class instance variable shapeType to.
     * @return void
     */
    public void setShape(String  shapeValue)
    {
        shapeType = shapeValue ; // set the class instance variable to the value in the formal parameter val.
    }
    /**
     * getter method for the class instance variable colour
     * @param  empty
     * @return the value of the class instance variable colour
     */
    public String getColour()
    {
        return colour; // return the value in the class instance variable colour
    }
    /**
     * getter method for the class instance variable shapetype
     * @param  empty
     * @return the value of the class instance variable shapetype
     */
    public String getShapeType()
    {
        return shapeType; // return the value in the class instance variable colour
    }
}
