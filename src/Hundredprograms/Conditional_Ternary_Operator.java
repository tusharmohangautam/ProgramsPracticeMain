package Hundredprograms;

public class Conditional_Ternary_Operator {

	public static void main(String[] args) {
//?:
		
		int a=10<5?20:30;
		System.out.println(a);

		
		int b=10<5?20:(20>10?50:60);
		System.out.println(b);
		
		
		for(int i=1;i<=10;i++)
		{
			if(i!=2 && i!=5 && i!=10)
			{
				System.out.println(i);
			}
		}
		
		
		
		for(int i=1;i<=10;i++)
		{
			if(i==3 || i==7)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		System.out.println("heloo java");
		
		Boolean x=true;
		boolean i=x;
		System.out.println(i);
		
		
		
		int z=0;
		try
		{
		System.out.println(z/0);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("exception handled...");
		}
		
		
	}

}
