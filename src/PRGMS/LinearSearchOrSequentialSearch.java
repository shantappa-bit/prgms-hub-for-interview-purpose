package PRGMS;

public class LinearSearchOrSequentialSearch 
{
	public static void main(String[] args)
    {
		//elements in an array may or may not be in an sorted order 
		int[]abb= {12,14,34,56,78};
		int search_ele=560;
		boolean flag=false;
		
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]==search_ele)
			{
				System.out.println("element is found at index :"+i);
				flag=true;
				break;
			}
			
		}
		
		
		if(flag==false)
		{
			System.out.println("Element is not present ..");
		}
		
	}

}
