package PRGMS;

public class countNumberOfDigitsInNumber 
{
	public static void main(String[] args) 
	{
		int number=1234;
		int count=0;
		
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println("Number of digits in a given number is :"+count);
	}

}
