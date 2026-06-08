package Hundredprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ListCollectiondDemo {

	public static void main(String[] args) {

    //List mylist=new ArrayList();
    // ArrayList<String> mylist=new ArrayList<String>();
		
		ArrayList ml=new ArrayList();
		
		ml.add(100);
		ml.add(100.5);
		ml.add(true);
		ml.add('a');
		ml.add("tushar");
		ml.add(null);
		ml.add(false);
		ml.add(null);
		
		System.out.println(ml);
		System.out.println(ml.size());
		ml.remove(3);
		System.out.println(ml);
		ml.add(3,200);
		System.out.println(ml);
		ml.set(3,"python");
		System.out.println(ml);
		System.out.println(ml.get(0));
		
		for(int i=0;i<=7;i++)
		{
			System.out.print(ml.get(i)+" ");
		}
		System.out.println();
		
		for(Object x:ml)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		System.out.println("using enhanced for loop");
		
		Iterator it=ml.iterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		
		
		
		
		
		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add(100.5);
		ml.removeAll(al1);
		System.out.println(ml);
		
		System.out.println(ml.isEmpty());
		
		ml.clear();
		
		System.out.println(ml.isEmpty());
		
		
		
		
		

	}

}
