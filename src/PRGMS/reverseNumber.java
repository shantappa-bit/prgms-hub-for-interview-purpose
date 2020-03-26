package PRGMS;

public class reverseNumber 
{
	public static void main(String[] args)
	{
		//approach 1
		int a=7896;
		int rev=0;
		
		while(a!=0)
		{
			 rev=rev*10+a%10;
			 a=a/10;
			 
			
		}
		System.out.println(rev);
		//approach 2
		int number=1234;
		StringBuffer buff=new StringBuffer(String.valueOf(number));
		StringBuffer rev1=buff.reverse();
		System.out.println(rev1+"reversed");
		
		//by using stringbuilder class 
		StringBuilder build=new StringBuilder();
		build.append(number);
		StringBuilder last=build.reverse();
		System.out.println(last+" last one");
		
		
	}

}
