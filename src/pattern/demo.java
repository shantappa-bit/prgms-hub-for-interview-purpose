package pattern;

public class demo 
{
	public static void main(String[] args) 
	{
		
		int space=0;
		int no=4;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no;k++)
			{
				if(i==1 || i==3)
				{
				System.out.print(k%2);
				}
				else
				{
					System.out.print(k);
				}
			}
			space++;
			no--;
			System.out.println();
			
		}
		
	}

}
