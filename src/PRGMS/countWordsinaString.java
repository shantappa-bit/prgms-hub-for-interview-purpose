package PRGMS;

public class countWordsinaString 
{
	public static void main(String[] args)
	{
		String name="welcome to java guys welcome all";
//		int count=1;
//		
//		for(int i=0;i<name.length();i++)
//		{
//			if((name.charAt(i)==' ')&& (name.charAt(i+1)!=' '))
//			{
//				count++;
//				
//			}
//		}
//		System.out.println("number of words are :"+count);
		String[] count=name.split(" ");
		System.out.println("Number of words are :"+count.length);
		
		
	}

}
