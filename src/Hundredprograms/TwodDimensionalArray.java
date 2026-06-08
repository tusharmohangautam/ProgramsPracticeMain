package Hundredprograms;

public class TwodDimensionalArray {

	public static void main(String[] args) {

		int [] [] x= {{100,200},{300,400},{500,600}};
		
		System.out.println(x);
		System.out.println(x.length);
		System.out.println(x[0]);
		System.out.println(x[0].length);
		System.out.println(x[1]);
		System.out.println(x[1].length);
		System.out.println(x[2]);
		System.out.println(x[2].length);
		
		System.out.println(x[0][1]);
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int [] y:x)
		
		{
			for(int a:y)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		System.out.println("hello tushar");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
