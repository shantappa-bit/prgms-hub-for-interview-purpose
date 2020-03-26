package PRGMS;

public class missingNumberInAnArray 
{
	public static void main(String[] args) 
	{
		//arrays should not have duplicates 
		//arrays no need  to be an sorted order
		//arrays values should be in a range 
		int[]a= {10,12,13,14};
		
		int sum1=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
			
		}
		
		System.out.println("Sum of elements in an array is :"+sum1);
		int sum2=0;
		for(int i=10;i<=14;i++)
		{
		sum2=sum2+i;	
		}
		System.out.println("Sum of elements in an range is :"+sum2);
		System.out.println("Missing number in an array is :"+(sum2-sum1));
		
		
	}

}
