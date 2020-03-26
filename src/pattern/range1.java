package pattern;

public class range1 
{
	public static void main(String[] args) 
	{
		int space=0;
		int no=4;
		for(char ch4='d';ch4>='a';ch4--)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no;k++)
			{
             System.out.print(ch4);
				
			}
			space++;
			no--;
			System.out.println();
			
			
		}
		
	}

}
