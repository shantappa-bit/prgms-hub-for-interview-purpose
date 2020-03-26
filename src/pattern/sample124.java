package pattern;

public class sample124 
{
	public static void main(String[] args) 
	{
		//all the elements in the arrays should be in a sorted order 
		//first we nned to find the middle number , based on the key value , 
		//it will decide whether do we need  to start searching from left side of the middle or from right side of the middle value
		//cases are as follows
		//1.if the key==middle value
		//2.key>mid then l=mid+1
		//key<mid then h=mid-1
		
		
//		int[]abb= {12,14,45,13,4,67,65,199};
//		 Arrays.sort(abb);
//		 String output = Arrays.toString(abb);
//		 System.out.println(output);
		
		int[]arr= {1,2,3,4,5,6,7,8,9,10};
		int count=arr.length;
		int key=18;
		int l=0;
		int h=arr.length-1;
		boolean flag=false;
		
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key==mid)
			{
			
				System.out.println("element is found ...");
				flag=true;
				break;
				
			}
			else if(key>mid)
			{
				l=mid+1;
				
				
			}
			else
			{
				h=mid-1;
				
				
			}
		}
		if(flag==false)
		{
			System.out.println("element is not found ");
		}
		
		
		
		
		
		
	}

}
