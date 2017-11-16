public class Circle
{
    private int radius;
	private int value1;
    /**
     * Circle constructor : 
     * @param r the radius of the circle
     */
    public Circle(int r, int v) //Notice there is NO return type for a class constructor.
    {
        radius = r;
		value1 = v;
    }
    /**
     * This provides the radius of the circle
     * @return the radius of the circle.
     */
    public int getRadius(){ // getter method
        return radius; // return the value of the class attribute radius
    }
	public int getValue(){ // getter method
        return value1; // return the value of the class attribute radius
    }
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setRadius(int num){ // Setter method
        
        radius = num; // set the class attribute (variable) radius equal to num
    } 
	public void setValue(int num){ // Setter method
        
        value1 = num; // set the class attribute (variable) radius equal to num
    }
}