package PRGMS;

public class sumOfdigitsNumber 
{
	public static void main(String[] args)
	{
		int number=5419;
		int sum=0;
		
		while(number!=0)
		{
			
			sum=sum+number%10;
			number=number/10;
		}
		System.out.println("sum of a given number is :"+sum);
		
	}

}
