/**
 * A program that represents a dog
 * 
 * @author Tadhg Deeney 
 * @author 17186226
 * @version 11/9/2017
 */
public class Dog
{
	/**
	* Variables associated with the class that can only be accessed by the methods
	*/
	private String breed;
	private boolean isDangerous;
	private int age;
	
	/**
     * Dog default constructor : 
     * 
     */
	public Dog()
	{
		breed = "Not Available";
		isDangerous = true;
		age = 1;
	}
	/**
     * Dog overidden constructor : 
     * 
	 * @param b is the breed of the Dog
	 * @param d is the isDangerous value of the Dog
	 * @param a is the age of the Dog
     */
	public Dog(String b, boolean d, int a)
	{
		breed = b; 
		isDangerous = d;
		age = a;
	}
	/**
     * This provides the breed of the Dog
     * @return the breed of the Dog.
     */
	public String getBreed()
	{
		return breed;
	}
	/**
     * This provides the Danger value of the Dog
     * @return the Danger value of the Dog.
     */
	public boolean getDanger()
	{
		return isDangerous;
	}
	/**
     * This provides the age of the Dog
     * @return the age of the Dog.
     */
	public int getAge()
	{
		return age;
	}
	/**
     * This sets the breed of the Dog
     * @param s the new value for the breed of the Dog.
     */
	public void setBreed(String s)
	{
		breed = s;
	}
	/**
     * This sets the Danger value of the Dog
     * @param b the new value for the Danger Value of the Dog.
     */
	public void setDanger(boolean b)
	{
		isDangerous = b;
	}
	/**
     * This sets the age of the Dog
     * @param i the new value for the age of the Dog.
     */
	public void setAge(int i)
	{
		age = i;
	}
	/**
     * This prints out the sentence "Woof! "he dog has barked"
     */
	public void bark()
	{
		System.out.println("Woof! the dog has barked");
	}
}
