//bufferedReader - Reading CharacterStream example
import java.io.*;
class FileExample4
{
	public static void main(String[] args) throws IOException
	{
		File inFile=new File("file1.txt");
		FileReader ins=new FileReader(inFile);
		BufferedReader bf=new BufferedReader(ins);
		int ch;
		char s[]=new char[20];
		bf.read(s,0,16);//s=the word 0=s
		System.out.println(s);
		bf.close();
	}
}

/**while((ch=ins.read())!=-1)
{
	System.out.print((char)ch);
}*/
/**String s1;
while((s1=bf.readLine())!=null)
	System.out.println(s1);*/
