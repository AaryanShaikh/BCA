//Program to write objects to file
import java.io.*;
class Demo implements Serializable
{
	public int a;
	public String b;
	public Demo(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
	public Demo()
	{
		a=0;
		b="null";
	}
}
public class FileExample5
{
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Demo object1=new Demo(1,"abc");
		Demo object2=new Demo(2,"xyz");
		FileOutputStream fout=new FileOutputStream("file1.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(object1);
		out.writeObject(object2);
		out.close();
		fout.close();
		
		Demo object3=new Demo();
		FileInputStream fin=new FileInputStream("file1.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		while(true)
		{
			try
			{
				object3=(Demo)in.readObject();
				System.out.println("a="+object3.a);
				System.out.println("b="+object3.b);
			}
			catch(EOFException e)
			{
				System.out.println("Reading done");
				fin.close();
			    in.close();
				System.exit(-1);
			}
		}
	}
}

				