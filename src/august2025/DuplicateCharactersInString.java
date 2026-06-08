package august2025;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		
		String a= "Automation Testing";
		
		a=a.replaceAll(" ","").toLowerCase();
		
	//	System.out.println(a);
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char ch:a.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch,0)+1);
			
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) 
		{
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey()+"=="+entry.getValue());
			}
		}
			
			
			
			
			
			
			
			
			
		
		

	}

}
