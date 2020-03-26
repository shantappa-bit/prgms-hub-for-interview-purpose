package PRGMS;

public class countOccuerenceofCharacter 
{
	public static void main(String[] args)
	{
	  String name="hello welcome back to my class";
	 int count1= name.length();
     int count2=name.replaceAll("e", "").length();	
     System.out.println(count1-count2);
	}

}
