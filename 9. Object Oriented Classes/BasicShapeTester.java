
public class BasicShapeTester
{
    public static void main(String [] args){
        // 1) Declare a variable to be a link reference to a BasicCircle
        // 2) Create a BasicCircle object using the BasicCircle(5) class constructor
        //    and pass the reference to this newly created object to the myCircle variable
        BasicCircle c1; //Step (1)
        
        c1 = new BasicCircle(5); // Step (2)
        System.out.println("\n*******New Object Created******\n");
        //int x = myCircle.radius; // is an error as Radius is a private variable
        
        double c = c1.circumference();
		double aC = c1.area();
		
		System.out.println("Circle Circumference: "+c);
		System.out.println("Circle Area: "+aC);
		
		
		BasicSquare s1 = new BasicSquare(5);
		System.out.println("\n*******New Object Created******\n");
		int p = s1.perimeter();
		int a = s1.area();
		
		System.out.println("Square Perimeter: "+p);
		System.out.println("Square Area: "+a);
		
		BasicRectangle r1 = new BasicRectangle(13, 5);
		System.out.println("\n*******New Object Created******\n");
        p = r1.perimeter();
		a = r1.area();
		
		System.out.println("Rectangle Perimeter: "+p);
		System.out.println("Rectangle Area: "+a);
    
    }
}
