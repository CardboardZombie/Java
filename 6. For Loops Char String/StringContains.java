public class StringContains 
{
	public static void main(String args[])
	{
		String str1 = "Hello World";
		String str2 = "Hello";
		
		int length = str1.length();
		
		System.out.println("The length of the String is: "+length);
	   
		boolean found = str1.contains(str2);
		System.out.println("String contains another string? : " + found);
	}
}