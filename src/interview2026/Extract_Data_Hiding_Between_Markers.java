package interview2026;


public class Extract_Data_Hiding_Between_Markers {
	
	
    public static void main(String[] args) {
    	
    	
    	String text = "Your order id is [ORD12345] successfully processed.";
    	
    	int start = text.indexOf("[") + 1;
    	
    	int end = text.lastIndexOf("]");
    	
    	
    	String extractValue = text.substring(start , end);
    	
    	System.out.println("Extracted value : " + extractValue);
    	
    	
    	
    	
  /*
  
 Good question. The reason we use +1 after finding ->  [  <-  is because substring(start, end)
 works like this:

substring(start, end)
Includes the character at start
Excludes the character at end
   	
   	
 Positions:

[ORD12345]
 ^
 17 = [
 18 = O
 ...
 25 = 5
 26 = ]
 
 
 
 
 Current Code
int start = text.indexOf("[") + 1;
int end = text.indexOf("]");

So:

start = 18
end = 26
 
 
 
 
   */
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        
    }
}