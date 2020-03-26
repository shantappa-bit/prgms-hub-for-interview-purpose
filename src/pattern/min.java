package pattern;

public class min
{
	public static void main(String[] args)
	{
		int[]abb= {12,1,34,56,4,129};
		int min=abb[0];
		
		for(int i=0;i<abb.length;i++)
		{
			if(abb[i]<min)
			{
				min=abb[i];
			}
		}
		System.out.println("min is :"+min);
		
	}

}
