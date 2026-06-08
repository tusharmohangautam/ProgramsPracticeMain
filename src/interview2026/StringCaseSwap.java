package interview2026;

public class StringCaseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Approach 1st
		String s = "AuToMaTiOn TeStInG";
		s.replaceAll(" ","");
		System.out.println(s);
		
		String result = "";
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				result = result+Character.toLowerCase(ch);
			}
			else
			{
				result=result+Character.toUpperCase(ch);
			}
			
		}
		
		System.out.println("final string :" + result);
		
		
		
		// Approach 2nd
				String s1 = "AuToMaTiOn TeStInG";
				s.replaceAll(" ","");
				
				char ch1 [] = s1.toCharArray();
				
				String result1 = "";
				
				for(int i=0;i<ch1.length;i++)
				{
					
					
					if(Character.isUpperCase(ch1[i]))
					{
						result1 = result1+Character.toLowerCase(ch1[i]);
					}
					else
					{
						result1=result1+Character.toUpperCase(ch1[i]);
					}
					
				}
				
				System.out.println("final string :" + result1.replaceAll(" ",""));
				
		
		
		
				// Approach 3rd
				String s2 = "AuToMaTiOn TeStInG";
				
				
				char ch2 [] = s2.toCharArray();
				
				
				
				for(int i=0;i<ch1.length;i++)
				{
					
					
					if(Character.isUpperCase(ch2[i]))
					{
						ch2[i] = Character.toLowerCase(ch2[i]);
					}
					else
					{
						ch2[i]=Character.toUpperCase(ch2[i]);
					}
					
				}
				
				String result3 = new String(ch2);
				System.out.println("final string :" + result3);
				
		
		
		
		
				// Approach 4th
				String s3 = "AuToMaTiOn TeStInG";
				
				
				String result4 = "";
				
				
				
				for(char ch3 : s3.toCharArray())
				{
					
					
					if(Character.isUpperCase(ch3))
					{
						result4 = result4 + Character.toLowerCase(ch3);
					}
					else
					{
						result4 = result4 + Character.toUpperCase(ch3);
					}
					
				}
				
				
				System.out.println("final string :" + result4);
				
		
		
		
		
				// Approach 5th
				String s4 = "AuToMaTiOn TeStInG";
				
				
				StringBuilder  result5 = new StringBuilder();
				
				
				
				for(char ch4 : s4.toCharArray())
				{
					
					
					if(Character.isUpperCase(ch4))
					{
						result5.append(Character.toLowerCase(ch4));
					}
					else
					{
                       result5.append(Character.toUpperCase(ch4));
					}
					
				}
				
				
				System.out.println("final string :" + result5.toString());
		
		
		
		
		

	}

}
