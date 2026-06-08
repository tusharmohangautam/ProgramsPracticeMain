package august2025;

import java.util.HashMap;
import java.util.Map;

public class WordRepeatationCountinOfString {

	public static void main(String[] args) {
		
		String a= "Java is a programing language.Java is very popular programing language";
		
		String [] b=a.trim().split(" ");

	//	System.out.println(a);
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		
		char [] ch = a.toCharArray();
		
		for(String s:b)
		{
			if(map.containsKey(s))
			{
				map.put(s,map.get(s)+1);
			}
			else
			{
				map.put(s,1);
			}
		}
		
		System.out.println("character count is: ");
		
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			
			System.out.println(entry.getKey()+ "="+entry.getValue());
			
		}
		
	
	}

}
