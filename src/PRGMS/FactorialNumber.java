package PRGMS;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		int num=5;
		long factorial=1;
		
//		for(int i=num;i>=1;i--)
//		{
//			factorial=factorial*i;
//		}
//		System.out.println(factorial);
		
		
		while(num!=0)
		{
			factorial=factorial*num;
			num--;
			
		}
		System.out.println(factorial);
		
	}

}
