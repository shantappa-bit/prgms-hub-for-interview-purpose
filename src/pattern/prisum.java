package pattern;

public class prisum
{
	public static void main(String[] args) 
	{
		int space=3;
		int star=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(k);
			}
			space--;
			star=star+2;
			System.out.println();
			
			
		}
		
		int space1=0;
		int star1=7;
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				System.out.print(k);
			}
			space1++;
			star1=star1-2;
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
	}

}
