package interview2026;

public class Longest_Common_Prefix_StringArray {

	public static void main(String[] args) {
		
		
		
String [] words= {"flower" , "flow", "flight" };


String prefix = words[0];


for(int i=1; i<words.length ; i++)
{
	
	while(words[i].indexOf(prefix)!=0)
	{
		
		prefix = prefix.substring(0 , prefix.length()-1); // chop off last letter
		
		
	}
}
		
	System.out.println("Longest common prefix : " + prefix);	
		
		
		
		
		
/*		
👉 Assume the entire first word is the common prefix.

prefix = "flower"
for (int i = 1; i < words.length; i++)

👉 Check the remaining words one by one.

i = 1 → "flow"
i = 2 → "flight"
while (words[i].indexOf(prefix) != 0)

👉 Ask:

"Does the current word start with the prefix?"

indexOf(prefix) == 0 → Yes, it starts with it.
indexOf(prefix) != 0 → No, it doesn't.		
		
	
NOTE : 		prefix = prefix.substring(0, prefix.length() - 1);

👉 Remove the last letter from the prefix.

Example:

flower
flowe
flow
flo
fl
f
		
		
		
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
