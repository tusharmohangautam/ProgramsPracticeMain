package interview2026;

public class First_Non_Repeating_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str = "swiss";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(str.indexOf(ch)==str.lastIndexOf(ch))
			{
				System.out.println("First unique character : " + ch);
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
