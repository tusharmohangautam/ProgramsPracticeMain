package Hundredprograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class JavaPrograms1 {
int a,b;
 void sum(int a, int b)
 {
	 this.a=a;
	this.b=b;
 }
 
 void display()
 {
	 System.out.println(a+b);
 }
 
 
 
	void sum1(int a, int b)
	{
		System.out.println("sum of a and b is:"+(a+b));
	}
	
	public static void main(String[] args) throws Exception {
		
		//creating class object
		JavaPrograms1 jv=new JavaPrograms1();
		


		System.out.println("First java program..");
		
		for(int i=-5;i<=5;i++)   
		{
			System.out.print(i+" ");
		}
		System.out.println("Second java program completed...");
		
		
		//String [] argh= {"100","java","python"};
		//args=argh;
		for(String a:args)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("Third java program...");
		
	/*	Scanner sc=new Scanner(System.in);
		
		int a,b;
		System.out.println("enter first number..");
		 a = sc.nextInt();
		System.out.println("enter second number..");
		b=sc.nextInt();
		
		System.out.println("sum of a + b is:"+ (a+b));
		System.out.println("Fourth java program completed"); */
		
		
		int z=10,x=20,c=30;
		if(z>x && z>c)
		{System.out.println("z is greater...");}
		else if(x>z && x>c)
		{System.out.println("x is greater...");}
		else
			System.out.println("c is greater..");
		
		System.out.println("Fifth java program completed");
		
		
		
		jv.sum1(20, 30);
		jv.sum(50,60);
		jv.display();
		System.out.println("Sixth java program completed");
		
		
		
		if(z%2==0)
		System.out.println("z is even number...");
		else System.out.println("z is odd number...");
		
		
		
		
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		
		for(char ch='z';ch>='a';ch--)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		
		
		int a=1;
		while(a<=10)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(a*i+" ");
				
			}
			
			System.out.println();
			a++;
		}
		System.out.println();
		
		
		int b=1;
		do
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(b*i+" ");
				
			}
			System.out.println();
			b++;
			
		}while(b<=10);
		
		
		
		
		String s1="welcome";
		String s2="";
		String s3=new String("welcome");
		
		
		StringBuffer sb=new StringBuffer("welcome");
		System.out.println(sb.reverse());
		
		
		StringBuilder sb1=new StringBuilder("python");
		System.out.println(sb1.reverse());
		
		
	char ch[]=	s1.toCharArray();
		
	System.out.println(ch.length);	
		for(int i=6;i>=0;i--)
		{
			
			s2=s2+ch[i];
			
		}
		System.out.println("reverse string is:" + s2);
		
		
		
		String l="my goal was IAS. My favourite game was chess.";
		System.out.println(l.replace("was","is"));
		
		
		
		String s="abc@gmail.com";
		String [] w=s.split("@");
		System.out.println(w.length);
		System.out.println(Arrays.toString(w));
		
		
		String q="  welcome  ";
		System.out.println(q.length());
		
		String e=q.trim();
		
		System.out.println(e.length());
		
		
		String r="welcome";
		System.out.println(r.toUpperCase());
		
		
		System.out.println(InetAddress.getLocalHost());
		
		
		
		
		
		
		
		char f='a';
		String f1=String.valueOf(f);
		System.out.println(f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
