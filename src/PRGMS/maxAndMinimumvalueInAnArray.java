package PRGMS;

public class maxAndMinimumvalueInAnArray 
{
public static void main(String[] args) 
{

	int []abb= {200,56,67,120,45};
	int max=abb[0];
	
	for(int i=1;i<abb.length;i++) 
	{
		if(abb[i]>max)
		{
			max=abb[i];
		}
	}
	
	System.out.println("Maximum element in an arrya is : "+max);
	
	
	

	int []abb1= {200,56,67,120,45};
	int min=abb[0];
	
	for(int i=1;i<abb1.length;i++) 
	{
		if(abb[i]<min)
		{
			min=abb1[i];
		}
	}
	
	System.out.println("Maximum element in an arrya is : "+min);
}
	
}
