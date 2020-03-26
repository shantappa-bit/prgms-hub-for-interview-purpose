package PRGMS;

import java.util.Arrays;

public class BinarySearchAlgorithum 
{
	public static void main(String[] args)
	{
		//arrays should be in sorted order 
		//check for the below mentioned three cases 
		//binary serach is faster than linear search where in it will divide and search but linear will search from first to last 
		//binary alwz faster than linear 
		//in built method of arrays class 
		//if the value present it will return the index of the number  binaryserach();
		//if it does not present then it will return the negative number 
		
		int[]abb= {1,2,3,4,5,6,7,8,9,10};
//		int key=3;
//		int l=0;
//		int h=abb.length-1;
//		boolean flag=false;
//		
//		
//		while(l<=h)
//		{
//			int m=(l+h)/2;
//			
//			if(key==m)
//			{
//				System.out.println("element is found :");
//				flag=true;
//				break;
//			}
//			else if(key>m)
//			{
//				l=m+1;
//			}
//			else
//			{
//				 h=m-1;
//			}
//		}
//		if(flag==false)
//		{
//			System.out.println("element is not found...");
//		}
		
		int value = Arrays.binarySearch(abb, 400);
		System.out.println(value);
		
		
	}

}
