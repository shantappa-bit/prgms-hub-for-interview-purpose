package pattern;

public class sample1
{
	public static void main(String[] args) 
	{
		
		
		int space=0;
		char ch='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(char k='d';k>=ch;k--)
			{
			System.out.print(k);	
			}
			space=space+1;
			ch=(char) (ch+1);
			
			System.out.println();
		}
		
	}

}
