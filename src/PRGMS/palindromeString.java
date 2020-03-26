package PRGMS;

public class palindromeString 
{
	public static void main(String[] args)
	{
		String name="gadag";
		String rev="";
		int count=name.length();
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		
		if(name.equals(rev))
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("its a not a pliandrome number ");
		}
		
		
		
		
	}

}
