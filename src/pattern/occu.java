package pattern;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class occu 
{
public static void main(String[] args) throws IOException 
{
	
	File f2=new File("D://computer.txt");
	f2.createNewFile();
	
	FileWriter fw=new FileWriter(f2);
	fw.write("shantappa vdsd");
	fw.flush();
	
	FileReader read=new FileReader(f2);
	//char rr = (char)read.read();
	
	
	long count = f2.length();
	System.out.println("number of char are :"+count);
	
	for(int i=0;i<count;i++)
	{
	System.out.print((char)read.read()+" ");	
	
	
	}
	
	
	
	
	
	
}	
}


