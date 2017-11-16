public class BasicRectangle
{
    private int length; // private Class variable, only methods inside the class can access this.
    private int width;
	/**
     * Rectangle constructor : 
     * @param l the length of the rectangle
	 * @param w the width of the rectangle
     */
    public BasicRectangle(int l, int w) //Notice there is NO return type for a class constructor.
    {
        length = l; // set the class attribute (variable) radius equal to r
		width = w;
	}
    /**
     * This provides the length of the rectangle
     * @return the length of the rectangle.
     */
    public int getLength(){ // getter method
        return length; // return the value of the class attribute radius
    }
	/**
     * This provides the width of the rectangle
     * @return the width of the rectangle.
     */
	public int getWidth(){
		return width;
	}
    /**
     * This sets the length of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setLength(int n){ // Setter method
        
        length = n; // set the class attribute (variable) radius equal to num
    }
	/**
     * This sets the width of the rectangle
     * @param num the new value for the width of the rectangle.
     */
    public void setWidth(int n){ // Setter method
        
        width = n; // set the class attribute (variable) radius equal to num
    }
	
	/**
     * This calculates the perimeter of the rectangle
     * @param l & w are inputted, sum is returned
     */
	public int perimeter()
	{
		return 2*(length+width);
	}
	/**
     * This calculates the area of the rectangle
     * @param l & w are inputted, sum is returned
     */
	public int area()
	{
		return length*width;
	}
}