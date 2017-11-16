class NestedFor
{	
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("i j");
		System.out.println("---");
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				System.out.println(i + " " + j);
			}
			System.out.println("Finished " + i + " iterations of outer loop");
		}
	}
}

