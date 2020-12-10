//FileReader - Reading CharacterStream example
import java.io.*;
class FileExample3
{
	public static void main(String[] args)
	{
		File inFile=new File("file1.txt");
		FileReader ins=null;
		try
		{
			int ch;
			ins=new FileReader(inFile);
			while((ch=ins.read())!=-1)
			{
				System.out.println((char)ch);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}
		finally
		{
			try
			{
				ins.close();
			}
			catch(IOException e){System.out.println(e);}
		}
	}
}