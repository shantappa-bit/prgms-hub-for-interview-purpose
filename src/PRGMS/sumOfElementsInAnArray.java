package PRGMS;

public class sumOfElementsInAnArray 
{
	public static void main(String[] args) 
	{
		int[]abb= {2,4,6,8,10};
		int count=abb.length;
		int sum=0;
		int sum1=0;
		for(int i=0;i<=count-1;i++)
		{
			sum=sum+abb[i];
		}
		System.out.println("Sum of elements in an arrray is :"+sum);
		
		for(int output:abb)
		{
			sum1=sum1+output;
		}
		System.out.println("From for each loop :"+sum);
		
	}

}
