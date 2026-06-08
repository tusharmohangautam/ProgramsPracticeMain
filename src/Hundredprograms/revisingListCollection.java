package Hundredprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class revisingListCollection {

	public static void main(String[] args) {

ArrayList ar=new ArrayList();

	ar.add(true);
	ar.add(100.5);
	ar.add("tushar");
	ar.add(false);
	ar.add(200);
	ar.add('a');
	ar.add(null);
	ar.add("python");
	ar.add(null);
	ar.add(200);
	
	
	System.out.println(ar);
	System.out.println(ar.size());	
		
	ar.remove(2);
	System.out.println(ar);
	ar.add(2,"java");
	System.out.println(ar);
	ar.set(2, "english");
	System.out.println(ar);
	System.out.println(ar.get(2));
	
	for(int i=0;i<=9;i++)
	{
		System.out.print(ar.get(i)+" ");
		
	}
	System.out.println();	
	
	for(Object x:ar)
	{
		System.out.print(x+"\t");
	}
	
	System.out.println();
	
	Iterator it=ar.iterator();
	
	while(it.hasNext())
	{
		System.out.print(it.next()+"\t");
	}
	System.out.println();	
		
	
	ArrayList ar1=new ArrayList();
	
	ar1.add("english");
	ar1.add('a');
	ar1.add("python");
	
	ar.removeAll(ar1);
	
	System.out.println(ar);
	
	ar.clear();
	System.out.println(ar.isEmpty());
	
	
	
	
	
	
	
	
	
	
	}

}
