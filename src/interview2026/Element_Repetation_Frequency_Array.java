package interview2026;

import java.util.Map;
import java.util.TreeMap;

public class Element_Repetation_Frequency_Array {

	public static void main(String[] args) {
		
		int [] input = {1,3,1,5,4,8,6,9,0,12,67,12,30,40,30};
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		
		for(int k: input)
		{
			if(map.containsKey(k))
			{
			  map.put(k, map.get(k)+1);	
				
			}
			else
			{
				map.put(k, 1);
			}
			
			
		}
		
		
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + " occuring " + entry.getValue()+ " times ");
			}
			
			
		}
		
		
		

	}

}
