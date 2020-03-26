package pattern;

public class numberprint 
{
	public static void main(String[] args) 
	{
		int no=1;
		int space=0;
		int no1=4;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no1;k++)
			{
				System.out.print(no);
				no++;
			}
			no1--;
			space++;
			System.out.println();
			
		}
		
	}

}
