package pattern;

import java.util.Arrays;
import java.util.Collections;

public class sample123 
{
	public static void main(String[] args) 
	{
		Integer[]abb= {12,14,1,4,56,78,15,89};
		int count=abb.length;
		
		System.out.println(Arrays.toString(abb));
		
		//sort in desc
		
		Arrays.sort(abb);
		System.out.println(Arrays.toString(abb));
		//by using parallel sort method
		Arrays.parallelSort(abb);
		System.out.println(Arrays.toString(abb));
		//sort in desc to asc order 
		Arrays.sort(abb,Collections.reverseOrder());
		System.out.println(Arrays.toString(abb));
	}

}
