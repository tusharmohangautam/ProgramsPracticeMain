package august2025;

public class SubstringOfstring {

	public static void main(String[] args) {
		
  String a = "abcdef";

		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<=a.length();j++)
			{
				System.out.println(a.substring(i,j));
			}
			
		}
		

	}

}
