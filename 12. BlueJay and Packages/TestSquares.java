/**
 * A program that tests the getters, setters and methods of the Square class
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 12/9/2017
 */
import java.util.Random;
public class TestSquares
{
    public static void main(String [] args){
        		
		Square s1 = new Square();
		System.out.println("\n*******New Object Created******\n");
		System.out.println("Length: "+s1.getLength());
		
		s1.setLength(7);
		
		double p = s1.calculatePerimeter();
		double a = s1.calculateArea();
		
		System.out.println("Perimeter: "+p);
		System.out.println("Area: "+a);
		
		Random r = new Random();
		int random;
		
		Square[] squArr = new Square[4];
		for(int i = 0; i < squArr.length; i++)
		{
			random = r.nextInt((20 - 1)+1)+1;
			squArr[i] = new Square(random);
			System.out.println("Square "+(i+1)+" : Length = "+squArr[i].getLength()+"\tArea = "+squArr[i].calculateArea()+" squared\tPerimeter = "+squArr[i].calculatePerimeter());
		}
    
    }
}
