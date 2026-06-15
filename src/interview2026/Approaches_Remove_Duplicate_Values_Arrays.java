package interview2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Approaches_Remove_Duplicate_Values_Arrays {

	public static void main (String [] args)
	{
		
		
// Approach1    => Using  Set<->LinkedHashSet
		
		/* This approach is efficient =>Efficient means a program completes its task using
		  less time and less memory/resources compared to other approaches.
		 */
		
int [] x = {10,20,40,60,10,50,20,90,60,70};

Set<Integer> mset = new LinkedHashSet<Integer>();

for(int y : x)
{
	mset.add(y);
}

int [] x1 = new int[mset.size()]	;

int count = 0;

for(int z : mset)
{
	x1[count++] = z;
}
	
	
	System.out.println("Approach 1 :" + Arrays.toString(x1));
	
	
	
	// Approach2    => Using ArrayList + contains()
	   //This is easy to understand for beginners

	
	int [] a = {10,20,40,60,10,50,20,90,60,70};
	
	
	List<Integer> list = new ArrayList<Integer>();
	
	for(int y : a)
	{
		if(! list.contains(y))
		{
			list.add(y);
		}
	}
	
//	System.out.println(list);
	
	
	int [] a1 = new int[list.size()];
	
	int Count = 0;
	
	for(int y : list)
	{
		a1[Count++] = y;
	}
	
	
System.out.println("Approach 2 :" +Arrays.toString(a1));	
	
	
	// Approach3  Using Arrays.stream() (Shortest)	
	
int [] b = {10,20,40,60,10,50,20,90,60,70};

int [] b1 = Arrays.stream(b).distinct().toArray();	
	
	
	System.out.println("Approach 3 :" + Arrays.toString(b1));
	
	
/*	Arrays.stream(x) converts the array into a stream, distinct() removes 
	duplicate elements, and toArray() converts the resulting stream back into an array
	*/
	
/*
 Step 1
Arrays.stream(x)
Converts the array into a Stream.
Think of a Stream as a pipeline through which elements flow one by one.

 The stream contains:

10, 20, 40, 60, 10, 50, 20, 90, 60, 70

        --------------------------------------------
Step 2
.distinct()
Removes duplicate elements from the stream.
Keeps only the first occurrence of each value.

Result:

10, 20, 40, 60, 50, 90, 70
 
   ------------------------------------------------------
   
   Step 3
.toArray()
Converts the processed stream back into an array.

Result:

int[] x1 = {10, 20, 40, 60, 50, 90, 70};
   
   
   ------------------------------------------------------
   
   Step 4
System.out.println(Arrays.toString(x1));

Prints:

[10, 20, 40, 60, 50, 90, 70]
   
   
   
   
 ==================================================
 
 Common Uses of .stream() in Java (3-4 points)

Filtering data

Arrays.stream(x).filter(n -> n > 50)

Keeps only elements matching a condition.



Removing duplicates

Arrays.stream(x).distinct()

Removes duplicate values.



Transforming data

Arrays.stream(x).map(n -> n * 2)

Modifies each element and returns a new stream.



Performing calculations

Arrays.stream(x).sum()
Arrays.stream(x).max()
Arrays.stream(x).average()

Used for aggregate operations like sum, max, min, average, etc.
 
 
 
 
 
 
 
 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
	
}
