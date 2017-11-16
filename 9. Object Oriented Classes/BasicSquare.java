public class BasicSquare
{
    private int side; // private Class variable, only methods inside the class can access this.
	/**
     * Rectangle constructor : 
     * @param l the length of the rectangle
	 * @param w the width of the rectangle
     */
    public BasicSquare(int s) //Notice there is NO return type for a class constructor.
    {
        side = s; // set the class attribute (variable) side equal to s
	}
    /**
     * This provides the length of the rectangle
     * @return the length of the rectangle.
     */
    public int getSide(){ // getter method
        return side; // return the value of the class attribute radius
    }
	
    /**
     * This sets the length of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setSide(int n){ // Setter method
        
        side = n; // set the class attribute (variable) radius equal to num
    }
	
	/**
     * This calculates the perimeter of the rectangle
     * @param l & w are inputted, sum is returned
     */
	public int perimeter()
	{
		return side*4;
	}
	/**
     * This calculates the area of the rectangle
     * @param l & w are inputted, sum is returned
     */
	public int area()
	{
		return side*side;
	}
}