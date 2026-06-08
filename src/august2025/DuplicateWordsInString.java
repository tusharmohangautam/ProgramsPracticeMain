package august2025;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		String a= "Java is a programing language Java is very popular programing language";
		
		String [] b=a.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String s:b)
		{
			map.put(s,map.getOrDefault(s,0)+1);
		}
		
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"=="+entry.getValue());
			}
			
			
		}
		
		
		
		
		

	}

}
