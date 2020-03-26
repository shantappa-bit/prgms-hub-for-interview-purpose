package PRGMS;

public class removeJunk 
{
	public static void main(String[] args) 
	{
		//here we need  to use regular expression to remove the junk data or any data by using char operator 
		// ^ is a char operator , where in it will retain the data which contains a-z A-Z 0-9 apart from this what ever there 
		//it will be replaced by an empty string
		String junk="@$!%^&hello##$ world !@@!is@#@ big@@# man@#@";
		junk=junk.replaceAll("[^a-z A-Z 0-9]","" );
		System.out.println(junk);
		
	}

}
