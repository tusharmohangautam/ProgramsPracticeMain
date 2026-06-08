package august2025;

public class VowelsConsonantsCountInString {

	public static void main(String[] args) {
		
		String a ="automation Testing";   //tmtntstng
		
		a=a.replaceAll("\\s+","").toLowerCase();
		
		int vowels=0;
		int consonants=0;
		
	
		
		for(int i=0;i<a.length();i++)
		{
			char ch = a.charAt(i);
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
				
			}
		}	
			
		System.out.println("Total vowels:"+vowels);	
		
		System.out.println("Total consonants:"+consonants);

	}

}
