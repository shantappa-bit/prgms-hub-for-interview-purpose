package PRGMS;

public class countEvenandODD 
{
	public static void main(String[] args)
	{
			int number=1357;
			int even_count=0;
			int odd_count=0;
			while(number>0)
			{
				
				if((number%10)%2==0)
				{
					even_count++;	
				}
				else
				{
					odd_count++;	
				}
				
				number=number/10;
				
				
			}
			System.out.println("even are >>> "+even_count+"odd are >>> "+odd_count);
		
	}

}
