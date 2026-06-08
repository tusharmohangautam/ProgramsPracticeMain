package Hundredprograms;

import java.util.Scanner;

public class Practice1 {

	int a,b;
	
	void setvalues(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	
	void display()
	{
		System.out.println(a+b);
	}
	
	
static	void sum(int... c)
	{
		int total=0;
		for(int c1:c)
		{
			total=total+c1;
		}
		System.out.println(total);
	}
	


	public static void main(String[] args) {
		
		// programs starts here !!!!

System.out.println("hello java!!");
		
for(int i=1;i<=10;i++)		
{
	System.out.print(i+" ");
}		
System.out.println();		


		String [] argh= {"java","python","tushar","mysql"};
		args=argh;
		
System.out.println(args[0]+" "+args[1]);		
		
for(int i=0;i<args.length;i++)		
{
System.out.print(args[i]+" ");	
}	

System.out.println();

/*int a=10,b=20,c;
c=a;
a=b;
b=c;
System.out.println(a+" "+b);*/


	Practice1 p1=new Practice1();
	p1.setvalues(41, 10);
	p1.display();	
		
	sum(100,30);	
		
		
boolean b=true;
if(b)
{
	if(false)
     {
		System.out.println("India is a powerfull country");
     }
	else
	{
		System.out.println("It is not powerful");
	}
	
}

else
{
System.out.println("it is false");	
}


String s="welcome";
String ss=new String("welcome");

System.out.println(s.equals(ss));


for(int a=-10;a<=10;a++)
{
System.out.print(a+" ");	
}

System.out.println();

for(int a=10;a>=-10;a--)
{
	System.out.print(a+" ");
}
System.out.println();



int a=1;
System.out.println("tables are:");

while(a<=10)
{
	
	for(int i=1;i<=10;i++)
	{
		System.out.print(a*i+" ");
		
	}
	System.out.println();
	a++;
}



for(char ch='a';ch<='z';ch++)

{
	System.out.print(ch+" ");
}

System.out.println();


for(char ch='z';ch>'a';ch--)
{
	System.out.print(ch+" ");
}
System.out.println();


int z=7;
int count=0;
for(int i=1;i<=7;i++)
{
	if(z%i==0)
	{
		count++;
	}
	//System.out.println();
}
if(count==2)
{
	System.out.println("z is a prime number");
}

else
{
	System.out.println("z is not a prime number");
}



for(int i=1;i<=4;i++)
{
	for(int j=1;j<=5;j++)
	{
		System.out.print("*"+" ");
	}
	System.out.println();
}
	
System.out.println();


	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=5;j++)
		{
			if(i==1 || i==4 || j==1 || j==5)
			{
				System.out.print("*");
			}
			else
				System.out.println(" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	

}
	}


