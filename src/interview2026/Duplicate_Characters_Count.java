package interview2026;

import java.util.Map;
import java.util.TreeMap;

public class Duplicate_Characters_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "automation testing";
		input = input.replaceAll(" ","");
		
		
		Map<Character,Integer> map = new TreeMap<Character,Integer>();	
		
		
		for(char ch : input.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
			
			
		}
		
		
		for(Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ " " + "appears" + " "+ entry.getValue()+ " " + "times");
			}
		}
		
		

	}

}
