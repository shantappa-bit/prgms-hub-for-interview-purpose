package PRGMS;

public class DuplicateElementInAnArray 
{
	public static void main(String[] args) 
	{
		String[]abb= {"hi","hello","hi","hi"};
		boolean status=false;
		
		for(int i=0;i<abb.length;i++)
		{
			for(int j=i+1;j<abb.length;j++)
			{
				if(abb[i]==abb[j])
				{
					status=true;
					System.out.println("found an duplicate element is :"+abb[i]);
				}
				
			}
		}
		
		if(status==false)
		{
			System.out.println("no duplicate element");
		}
		
	}

}
