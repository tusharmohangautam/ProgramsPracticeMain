package parent;

import java.util.Arrays;

public class Interview_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int [] x = {1,2,3,4,5,6,7,8,9};



for(int i=0;i<=x.length;i++)
{
   int num = x[i];
   
   int count = 0;
   
   for(int j=1;j<=num;j++)
   {
	   if(num%j==0)
	   {
		   count++;
		   
	   }
   }   
	   if(count==2)
	  System.out.println(num + " ") ;
	   
   

}









	}

}
