package PRGMS;

public class palindromeNumber 
{
	public static void main(String[] args) 
	{
		//approch 1
		int number=121;
		int copy=number;
		int rev=0;
		while(number !=0)
		{
			rev=rev*10+number%10;
			number=number/10;
			
		}
		
		if(copy==rev)
		{
			System.out.println("its a palindrome ");
		}
		else
		{
			System.out.println("its not  palindrome number ");
		}
		
	}

}
