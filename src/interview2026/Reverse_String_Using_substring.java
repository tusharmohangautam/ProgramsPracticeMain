package interview2026;

public class Reverse_String_Using_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String s = "apple";

String rev = "";

for(int i = s.length()-1;i>=0;i--)
{
	
	rev = rev + s.substring(i, i+1);
	
}
		
		
		System.out.println("Reverse string using substring method : " + rev);
		
		
		
		
		

	}

}
