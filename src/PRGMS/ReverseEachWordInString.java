package PRGMS;

public class ReverseEachWordInString 
{
	public static void main(String[] args) 
	{
		String name="java hello welcome back";
		int count=name.length();
		 String[]array=name.split(" ");
		 
		 for(int i=0;i<array.length;i++)
		 {
			 String word=array[i]; 
			 
			 for(int j=word.length()-1;j>=0;j--)
			 {
				 System.out.print(word.charAt(j));
				 
			 }
			 System.out.print(" ");
			 
		 }
		
	}

}
