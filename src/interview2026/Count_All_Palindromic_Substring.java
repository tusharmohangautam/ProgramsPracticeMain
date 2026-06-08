package interview2026;

public class Count_All_Palindromic_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "abcd";
        int count = 0;
        
        for (int i = 0; i < str.length(); i++)
        {
        	
            for (int j = i + 1; j <= str.length(); j++)
             {
                String sub = str.substring(i, j);
                if (sub.equals(new StringBuilder(sub).reverse().toString()))
                	
                	count++;
             }
        }
        System.out.println("Total Palindrome Substrings: " + count);

	}

}
