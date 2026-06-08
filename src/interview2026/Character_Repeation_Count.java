package interview2026;

import java.util.HashMap;
import java.util.Map;

public class Character_Repeation_Count {

	public static void main(String[] args) {
		
		String input = "automation";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char ch : input.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
			
			
		}
		
		for(Map.Entry<Character,Integer> entry: map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		

	}

}
