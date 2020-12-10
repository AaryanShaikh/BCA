//bufferedWriter - Writing character stream example
import java.io.*;
class FileExample2
{
	public static void main(String[] args) throws IOException
	{
		File outFile=new File("file1.txt");
		FileWriter outs=new FileWriter(outFile);
		BufferedWriter bf=new BufferedWriter(outs);//uses object of FileWriter 
		outs.write("Computer");
		outs.close();
	}
}