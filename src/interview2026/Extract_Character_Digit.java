package interview2026;

public class Extract_Character_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "autom1234tionsh7645";
		
		char ch [] = input.toCharArray();
		
		StringBuilder digits = new StringBuilder();
		
		StringBuilder alphabets = new StringBuilder();
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				digits.append(ch[i]);
			}
			
			else if(Character.isLetter(ch[i]))
			{
				alphabets.append(ch[i]);
			}
		}
		
		System.out.println("Extracted digits :" + digits.toString());
		
		System.out.println("Extracted alphabets :" + alphabets.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
