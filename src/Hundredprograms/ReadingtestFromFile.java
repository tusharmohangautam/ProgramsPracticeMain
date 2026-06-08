package Hundredprograms;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingtestFromFile {

	public static void main(String[] args) throws IOException  {

System.out.println("program is started....");

System.out.println("program is in progress....");


		FileInputStream file=new FileInputStream("C:\\welcome.txt");
		
		System.out.println(file.read());	
		
		
			System.out.println("program is completed....");
		
		
		
		
		
		

	}

}
