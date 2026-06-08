package Hundredprograms;

public class UsageOfthrow {

	
	static void checknum(int a)
	{
		if(a<1)
		{
			throw new ArithmeticException("number is negative can't calculate square..");
		}
		else
		{
			System.out.println(a*a);
		}
	}
	public static void main(String[] args) {

		
		
try
{
		checknum(-5);
}

catch(ArithmeticException e)
{
	
	System.out.println(e.getMessage());
	System.out.println("exceptio handled...");
}
		
		
		
	}

}
