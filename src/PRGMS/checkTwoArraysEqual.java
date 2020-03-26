package PRGMS;

public class checkTwoArraysEqual 
{
	public static void main(String[] args)
	{
		int[]a= {1,2,6,4,5,7};
		int[]b= {1,2,3,4,5,6};
		boolean status=true;
		if(a.length==b.length) 
		{
			
			for(int i=0;i<=a.length-1;i++)
			{
				 if(a[i]!=b[i])
				 {
					 status=false;
					 
				 }
			}
			
			if(status)
			{
				System.out.println("arrays are equal");
			}
			else
			{
				System.out.println("arrays are not equals");
			}
			
		}
		else
		{
		System.out.println("Arrays are not equal ");	
		}
		
		
	}

}
