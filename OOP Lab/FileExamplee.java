//Filewriter -  writing character Stream example 
import java.io.*;
class FileExamplee
{
	public static void main(String[] args)
	{
		FileWriter outs=null;
		try
		{
			outs=new FileWriter("file.txt");//outs connects the program to the file
			outs.write("welcome");//writes to the file
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);//exists the program
		}
		finally
		{
			try
			{
				outs.close();
			}
			catch(IOException e){System.out.println(e);}
		}
	}
}