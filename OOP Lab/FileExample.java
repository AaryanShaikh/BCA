//Program for file handling
import java.io.*;
public class FileExample
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("ErrorCli.java");
		f1.createNewFile();
		System.out.println("Is Exists: "+f1.exists());
		System.out.println("Size of the file: "+f1.length());
		System.out.println("Filename: "+f1.getName());
		System.out.println("can write file: "+f1.canWrite());
	}
}