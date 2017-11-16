/**
 * A program to test the dog representation
 * create 3 instances of the Dog class and 
 * provides each of these dogs with different attributes
 * 
 *
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 11/9/2017
 */
public class Tester
{
    public static void main(String [] args)
	{
		//Task 5
		Dog d1 = new Dog("King Charles", false, 12);
		Dog d2 = new Dog("Westie Terrier", true, 2);
		Dog d3 = new Dog("Fox Terrier", false, 1);
		//Task 6
		System.out.println(d1.getBreed());
		System.out.println(d1.getDanger());
		System.out.println(d1.getAge());
		d1.bark();
		System.out.println();
		
		d1.setBreed("Greyhound");
		d1.setDanger(true);
		d1.setAge(5);
		System.out.println("********Values Changed********");
		
		System.out.println(d1.getBreed());
		System.out.println(d1.getDanger());
		System.out.println(d1.getAge());
		d1.bark();
		System.out.println();
		
		System.out.println(d2.getBreed());
		System.out.println(d2.getDanger());
		System.out.println(d2.getAge());
		d1.bark();
		System.out.println();
		
		System.out.println(d3.getBreed());
		System.out.println(d3.getDanger());
		System.out.println(d3.getAge());
		d1.bark();
		System.out.println();
		
    }	
}