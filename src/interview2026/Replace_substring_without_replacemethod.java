package interview2026;

public class Replace_substring_without_replacemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "I love Python";
        String oldSub = "Python", newSub = "Java";		
		
		
int idx = text.indexOf(oldSub);		
		
while(idx != -1)		
{
	text = text.substring(0,idx) + newSub + text.substring(idx + oldSub.length());
	
	idx = text.indexOf(oldSub , idx+newSub.length());
	
}
		
		
		System.out.println(text);
		

	}

}
