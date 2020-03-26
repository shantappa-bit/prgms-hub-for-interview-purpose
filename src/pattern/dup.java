package pattern;

public class dup
{
	public static void main(String[] args)
	{
		String[]abb= {"hi","hello","der","hello"};
		boolean status=false;
		
		for(int i=0;i<abb.length;i++)
		{
			for(int j=i+1;j<abb.length;j++)
			{
				if(abb[i]==abb[j])
				{
					System.out.println("duplicate found at "+abb[i]);
					status=true;
					break;
				}
			}
		}
		if(status==false)
		{
			System.out.println("duplicate element  is not found ");
		}
		
	}

}
