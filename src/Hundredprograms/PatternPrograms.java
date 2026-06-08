package Hundredprograms;

public class PatternPrograms {

	public static void main(String[] args) {

//solid rectangle
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

		System.out.println("-------------------------");


for(int i=1;i<=4;i++)
{
	for(int j=1;j<=5;j++)
	{
		if(i==1 ||i==4||j==1||j==5)
		{
			System.out.print("*");
		}
		else
			System.out.print(" ");
		
	}
	System.out.println();
}

System.out.println("---------------");



for(int i=1;i<=4;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}


System.out.println("------------------------------");


for(int i=4;i>=1;i--)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
	
}




System.out.println("---------------");


for(int i=1;i<=4;i++)
{
	for(int j=1;j<=4-i;j++)
	{
		System.out.print(" a");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print("*");
	}
	System.out.println();
}







		
		

	}

}
