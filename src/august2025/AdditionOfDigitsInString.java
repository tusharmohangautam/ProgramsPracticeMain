package august2025;

public class AdditionOfDigitsInString {

	public static void main(String[] args) {
		
		
		String a="12abc34def56ghi78";
		
		int sum=0;
		String number="";
		
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(Character.isDigit(ch)) {
				number+=ch;
			}
			else {
				if(!number.isEmpty())
				{
					sum=sum+Integer.parseInt(number);
					number= "";
				}
			
			}
			
			
		}

		if(!number.isEmpty())
		{
		sum=sum+Integer.parseInt(number);
			
		}
		
		
		System.out.println("Addition of digits=="+sum);
		
		

	}

}
