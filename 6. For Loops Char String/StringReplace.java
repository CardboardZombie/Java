public class StringReplace
{
	public static void main(String args[])
	{

		/*
		Java String class defines three methods to replace character or substring from
		the given Java String object.
		
			1) String replace(int oldChar, int newChar)
		This method replaces a specified character with new character and returns a
		new string object.
		
			2) String replaceFirst(String regularExpression, String newString)
		Replaces the first substring of this string that matches the given regular
		expression with the given new string.
		
			3) String replaceAll(String regex, String replacement)
		Replaces the each substring of this string that matches the
		given regular expression with the given new string.
		*/

		String str="Parts of this string will be replaced.";
		
		System.out.println( str.replace( 'P','B' ) );

		//Replaces only first occurrance of given String with new one and returns new String object.

		System.out.println( str.replaceFirst("we", "ba") );
		System.out.println( str.replaceFirst("pl", "bp") );

		//Replaces all occurrances of given String with new one and returns new String object.
		System.out.println( str.replaceAll("re", "Ra") );

	}
}