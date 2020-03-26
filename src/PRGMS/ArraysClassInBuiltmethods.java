package PRGMS;

import java.util.Arrays;
import java.util.Collections;

public class ArraysClassInBuiltmethods
{
	public static void main(String[] args) 
	{
		Integer[]a= {1,2,5,2,56,12,78};
		//arrays is a class 
		String output=Arrays.toString(a);
		//System.out.println(output);
		//to sort the elements we have sort and parallel sort method in a arrays class 
		
		//Arrays.sort(a);
		//System.out.println(Arrays.toString(a));
		
		Arrays.parallelSort(a);
		System.out.println("before sorting"+Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("after sorting is :"+Arrays.toString(a));
		
		//note Collections.reverseOrder() will not support primitive type of data 
		//it will support only non primitive type of data hence we need  convert it to corresponding wrapper class object 
		//but arrays.sort() this will applicable for primitive type of data only , 
	}

}
