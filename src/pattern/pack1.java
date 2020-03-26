package pattern;

public class pack1
{
	public static void main(String[] args) 
	{
		int[]abb= {12,14,359,67,1,120};
		int max=abb[0];
		
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]>max)
			{
				max=abb[i];
			}
		}
		System.out.println("max is :"+max);
		
		
	}

}
