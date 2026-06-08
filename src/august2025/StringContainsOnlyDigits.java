package august2025;

public class StringContainsOnlyDigits {

	public static void main(String[] args) {
		
		String a="12345678";
		
		boolean onlyDigits=true;
		
		
		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(!Character.isDigit(ch))
			{
				onlyDigits=false;
				break;
			}
			
			
		}
		
		if(onlyDigits)
		{
			System.out.println("String contains only digits...");
		}
		
		else
		{
			System.out.println("string contains characters and digits....");
		}
		
		
		
		
		
		
		
		
		
	}

}
