package pattern;

public class helpme 
{
	public static void main(String[] args) 
	{
		int space=0;
		int no=4;
		
		for(char ch='a';ch<='d';ch++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=no;k++)
			{
				System.out.print(ch);
			}
			space++;
			no--;
			System.out.println();
			
		}
		
	}

}
