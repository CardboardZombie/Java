/**
 * A program that represents a book
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 12/9/2017
 */
public class Book
{
	/**
	* Variables associated with the class that can only be accessed by the methods
	*/
	private String title;
	private int numberOfPages;
	private int yearPublished;
	private String author;
	private String genre;
	
	/**
     * Book default constructor : 
     * 
     */
	public Book()
	{
		title = "undefined";
		yearPublished = 1900;
		numberOfPages = 0;
		genre = "undefined";
	}
	/**
     * Book overidden constructor : 
     * 
	 * @param t is the title of the Book
	 * @param n is the Number of Pages of the Book
	 * @param p is the Year the Book was Published
	 * @param a is the Author of the Book
	 * @param g is the Genre of the Book
     */
	public Book(String t, int n, int p, String a, String g)
	{
		title = t; 
		numberOfPages = n;
		yearPublished = p;
		author = a;
		genre = g;
	}
	/**
     * This provides the title of the Book
     * @return the title of the Book.
     */
	public String getTitle()
	{
		return title;
	}
	/**
     * This provides the Number of Pages of the Book
     * @return the Number of Pages of the Book.
     */
	public int getPages()
	{
		return numberOfPages;
	}
	/**
     * This provides the year the Book was Published
     * @return the year the Book was published.
     */
	public int getYear()
	{
		return yearPublished;
	}
	/**
     * This provides the author of the Book
     * @return the author of the Book.
     */
	public String getAuthor()
	{
		return author;
	}
	/**
     * This provides the genre of the Book
     * @return the genre of the Book.
     */
	public String getGenre()
	{
		return genre;
	}
	/**
     * This sets the title of the Book
     * @param s the new value for the title of the Book.
     */
	public void setTitle(String s)
	{
		title = s;
	}
	/**
     * This sets the number of Pages of the Book
     * @param i the new number of pages of the Book.
     */
	public void setPages(int i)
	{
		numberOfPages = i;
	}
	/**
     * This sets the year the Book was published
     * @param i the new value for the year it was published.
     */
	public void setYear(int i)
	{
		yearPublished = i;
	}
	/**
     * This sets the author of the Book
     * @param s the new value for the author of the Book.
     */
	public void setAuthor(String s)
	{
		this.author = s;
	}
	/**
     * This sets the genre of the Book
     * @param s the new value for the genre of the Book.
     */
	public void setGenre(String s)
	{
		genre = s;
	}
	/**
     * This prints out the sentence "Woof! "he dog has barked"
     */
	public void bark()
	{
		System.out.println("Woof! the dog has barked");
	}
}
