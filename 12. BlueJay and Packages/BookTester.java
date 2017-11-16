/**
 * A program to test the book representation
 * create 3 instances of the Book class and 
 * provides each of these books with different attributes
 * Using a separate piece of Code - print out the values for all 3 books
 *
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 12/9/2017
 */
public class BookTester
{
    public static void main(String [] args)
	{
		//Task 1
		Book b1 = new Book("Artemis Fowl", 277, 2001, "Eoin Colfer", "Fantasy");
		Book b2 = new Book("American Gods", 465, 2001, "Neil Gaiman", "Fantasy");
		Book b3 = new Book("World War Z", 342, 2006, "Max Brooks", "Horror");
		

		//Task 3
		System.out.print("Title: "+b1.getTitle());
		System.out.print("\tAuthor: "+b1.getAuthor());
		System.out.print("\tGenre: "+b1.getGenre());
		System.out.print("\t Pages: "+b1.getPages());
		System.out.println("\t Published: "+b1.getYear());
		System.out.println();
		
		System.out.print("Title: "+b2.getTitle());
		System.out.print("\tAuthor: "+b2.getAuthor());
		System.out.print("\tGenre: "+b2.getGenre());
		System.out.print("\t Pages: "+b2.getPages());
		System.out.println("\t Published: "+b2.getYear());
		System.out.println();
		
		System.out.print("Title: "+b3.getTitle());
		System.out.print("\tAuthor: "+b3.getAuthor());
		System.out.print("\tGenre: "+b3.getGenre());
		System.out.print("\t Pages: "+b3.getPages());
		System.out.println("\t Published: "+b3.getYear());
		System.out.println();
    }	
}