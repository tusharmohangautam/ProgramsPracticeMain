package interview2026;

public class Prime_Number_Check {

	public static void main(String[] args) {
		
		
		int input = 11;
		
		int count = 0;
		
		for(int i=1;i<=11;i++)
		{
			if(input%i==0)
			{
				count++;
			}
			
		}
		
		 if(count==2)
		System.out.println("Number is a prime number...");
		 else
			 System.out.println("NUmber is not a prime number....");
		

	}

}
