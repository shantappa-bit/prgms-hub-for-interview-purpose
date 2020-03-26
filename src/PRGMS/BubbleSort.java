package PRGMS;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int[]abb= {12,2,34,56};//n =4 n-1 3
		
		System.out.println("before sorting the elements:"+Arrays.toString(abb));
		
		for(int i=0;i<abb.length-1;i++)
		{
			
			for(int j=0;j<abb.length-1;j++)
			{
				if(abb[j]>abb[j+1])
				{
					int temp=abb[i];
					abb[i]=abb[j+1];
					abb[j+1]=temp;
					
					
					
				}
			}
			
			
			
		}
		System.out.println("after sorting "+Arrays.toString(abb));
		
	}

}
