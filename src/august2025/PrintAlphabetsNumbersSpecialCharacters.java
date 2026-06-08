package august2025;

public class PrintAlphabetsNumbersSpecialCharacters {

	public static void main(String[] args) {
		
		
		String a ="Automation@123ion";
		a=a.toLowerCase();
		
		int letters=0;
		int numbers=0;
		
		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				//System.out.print(ch+" ");
				letters++;
				
			}
			else
			{
				//System.out.print(ch+" ");
				numbers++;
			}
			
		}
		
		System.out.println(letters);
		System.out.println(numbers);
		
	}

}
