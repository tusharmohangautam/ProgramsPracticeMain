package interview2026;

public class CustomCaseSwap {

	public static void main(String[] args) {
		
// Convert alphabets at index 0 and odd numbers to UpperCase & at even index to LowerCase
		
 /*		String input = "AutoMatioN";
        char[] ch = input.toCharArray();
        
		for(int i=0; i<ch.length;i++)
		{
			if(i==0 || i%2!=0)
			{
				ch[i]= Character.toUpperCase(ch[i]);
			}
			else
			{
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		
		String result = new String(ch);
		System.out.println("Final Result is :" + result);
		
	*/
		
	
// Convert alphabets at index odd numbers to UpperCase & at even index to LowerCase
		// Note : Index zero is considered to be even
		
		 		String input = "AutoMatioN";
		        char[] ch = input.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(i%2!=0)
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
			
			
			else
			{
				ch[i] = Character.toLowerCase(ch[i]);
			}
		}
		
		
		String result = new String (ch);
		
		System.out.println("Final String is :" + result);
		
		
		
		
	}

}
