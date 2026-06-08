package mayRevision;

public class PatternPgm {

	public static void main(String[] args) {

// solid rectangle
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		
	// 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==4 || j==1 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println("..............");
		System.out.println("..............");
		
		
		// half pyramid
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("..............");
		System.out.println("..............");
		
		// inverted half pyramid
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("..............");
		System.out.println("..............");
		
		
		// pattern related to half pyramid
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("..............");
		System.out.println("..............");
		
		
		
		int number=1;
		
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(number);
				number++;
			}
			System.out.println();
		}
		
		System.out.println("..............");
		System.out.println("..............");
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum=i+j;
				if(sum%2==0)
				{
				System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	// Butterfly pattern
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(4-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(4-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
