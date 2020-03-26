package PRGMS;

public class swapTwoNumbers
{
	public static void main(String[] args)
	{
		//by using third variable 
		int a=12;
		int b=20;
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		//without using third variable 
		int c=12;
		int d=14;
	     c=c+d;
	     d=c-d;
	     c=c-d;
	     System.out.println( c+" "+d);
		
		
		
		
	}

}
