package PRGMS;

public class generateFirst10Primenumbers 
{
	public static void main(String[] args) 
	{
		int num=2;
		int count=0;
		for(int i=1;i<=10;i++)
		{
			
			for(int j=1;j<=10;j++)
			{
				if(num%j==0)
				{
				count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(num);
			}
			
				num++;
			
			if(num==10)
			{
				break;
			}
			
		}
		
	}

}
