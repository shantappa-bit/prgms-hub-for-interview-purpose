package PRGMS;

public class reverseString 
{
	public static void main(String[] args) 
	{
		//approach 1
		String original="JAVA";
		String rev="";
		int count=original.length();
		for(int i=count-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		
		System.out.println("reversed string is "+rev);
		
		//approach 2
		//by using tocharArray
		String original1="java";
		char[] array = original1.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);
		}
		//approach 3
		//by using stringBuffer class
		StringBuffer buff=new StringBuffer(original1);
		StringBuffer  tree=buff.reverse();
		System.out.println();
		System.out.println(tree+"  third approach");
		//approach 4 
		//by using stringbuilder class
		StringBuilder build=new StringBuilder(original1);
		StringBuilder lastbut=build.reverse();
		System.out.println();
		System.out.println(lastbut+" managed here ");
		
	}

}
