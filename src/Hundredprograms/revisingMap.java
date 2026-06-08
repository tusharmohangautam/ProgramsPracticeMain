package Hundredprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class revisingMap {

	public static void main(String[] args) {


		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(101, "tushar");
		hm.put(102, "guddu");
		hm.put(103, "samar");
		hm.put(104, "hero");
		hm.put(102,"vicky");
		
		System.out.println(hm);
		
		System.out.println(hm.size());
		System.out.println(hm.get(101));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for(int k:hm.keySet())
		{
			System.out.println(k+"\t"+hm.get(k));
		}
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
