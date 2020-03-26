package PRGMS;

public class printEvenAndOddFromAnArrya
{
	public static void main(String[] args) 
	{
		int[]abb= {1,2,3,4,18};
//		int count=abb.length;
//		for(int i=0;i<=count-1;i++)
//		{
//			if(abb[i]%2==0)
//			{
//				System.out.println("Even are :"+abb[i]);
//			}
//			else
//			{
//				System.out.println("Odd are :"+abb[i]);
//			}
//		}
		
		//second approach 
		
		for(int door:abb)
		{
			if(door%2==0)
			{
				System.out.println("even are :"+door);
			}
			else
			{
				System.out.println("odd are :"+door);
			}
			
		}
		
	}

}
