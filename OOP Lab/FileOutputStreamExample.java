//Program for FileOutputStream
import java.io.*;
public class FileOutputStreamExample
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("File1.txt");
		FileOutputStream fout=new FileOutputStream(f1,true);
		String s="Computer";
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		fout.write(65);
		fout.close();
	}
}