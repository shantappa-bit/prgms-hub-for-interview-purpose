package PRGMS;

public class removeWhiteSpaces 
{
	public static void main(String[] args)
	{
		String name="hello            wordl  is bigger    than   what   we thought";
//		//here \\s it will match with the spaces so it will replace all the spaces by an empty string 
//	name=name.replaceAll("\\s", "");
//		System.out.println(name);
		
		String[] name2 = name.split(" ");
		for(int i=0;i<name2.length;i++)
		{
			System.out.print(" "+name2[i]);
		}
		
	}

}
