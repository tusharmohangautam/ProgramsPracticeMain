package interview2026;

public class String_Contains_substring {
	
    public static void main(String[] args) {
    	
    	
        String main = "automation";
        String sub = "mat";
        boolean found = false;

        for (int i = 0; i <= main.length() - sub.length(); i++)
        /* we have subtracted length here so that as soon as i value reaches t in automation
        	it should stop because here "mat" is ended so we no need to check ahead */
        
        {
            if (main.substring(i, i + sub.length()).equals(sub)) {
                found = true;
                break;
            }
        }
        System.out.println("Contains Substring: " + found);
    }
}