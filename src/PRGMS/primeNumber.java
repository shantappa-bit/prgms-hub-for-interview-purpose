package PRGMS;

public class primeNumber 
{
	public static void main(String[] args)
	{
		int number=23;
		int count=0;
		
		if(number>1)
		{
			for(int i=1;i<=number;i++)
			{
				if(number%i==0) 
				{
				count++;
				}
			}
			if(count==2)
			{
				System.out.println("its a prime number");
			}
			else
			{
				System.out.println("its not a prime number");
			}
			
		}
		else
		{
			System.out.println("not a prime number ....");
			
		}
		
	}

}
