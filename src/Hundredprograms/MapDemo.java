package Hundredprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

HashMap<Integer,String> hm=new HashMap<Integer,String>();

hm.put(101, "tushar");
hm.put(102, "python");
hm.put(103,"java");
hm.put(104,"english");
hm.put(102, "biology");
hm.put(105,"maths");


System.out.println(hm);
System.out.println(hm.size());		
		
hm.remove(104);
System.out.println(hm);
System.out.println(hm.get(105));
		
	System.out.println(hm.keySet());	
	System.out.println(hm.values());	
		
	System.out.println(hm.entrySet());	
		
		
		for(int k:hm.keySet())
		{
			System.out.println(k+" "+hm.get(k));
		}
		System.out.println("-------------");
		
		Iterator<Entry<Integer,String>> it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
