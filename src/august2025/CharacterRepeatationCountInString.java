package august2025;

import java.util.HashMap;
import java.util.Map;

public class CharacterRepeatationCountInString {

	public static void main(String[] args) {
		
		String a= " Automation Testing ";
		
		a=a.trim().replaceAll(" ","").toLowerCase();

	//	System.out.println(a);
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		
		char [] ch = a.toCharArray();
		
		for(char ch1:ch)
		{
			if(map.containsKey(ch1))
			{
				map.put(ch1,map.get(ch1)+1);
			}
			else
			{
				map.put(ch1,1);
			}
		}
		
		System.out.println("character count is: ");
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+ "="+entry.getValue());
			
		}
		
	
	}

}
