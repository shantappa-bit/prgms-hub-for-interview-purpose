package pattern;

public class sample7 
{
	public static void main(String[] args)
	{
		int space=0;
	    char ch='d';
	    
	    for(int i=1;i<=4;i++)
	    {
	    	for(int j=1;j<=space;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(char ch1='a';ch1<=ch;ch1++)
	    	{
	    		System.out.print(ch1);
	    	}
	    	space++;
	    	ch--;
	    	System.out.println();
	    	
	    }
		
	}

}
