package pattern;

public class pp 
{
	public static void main(String[] args)
	{
		int[]abb= {12,14,2,34,67,120};
		int count=abb.length;
		boolean status=false;
		
		for(int i=0;i<count;i++)
		{
			for(int j=0;j<count;j++)
			{
				if(abb[j]==abb[j+1])
				{
					System.out.println("duplicate element found: "+i);
					status=true;
					break;
				}
			}
		  
		}
		if(status==false)
		{
			System.out.println("element is not found");
		}
		
	}
	
}


