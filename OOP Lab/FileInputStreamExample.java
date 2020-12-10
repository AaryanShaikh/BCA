//Program for FileInputStream
import java.util.*;  
import java.io.*;
public class FileInputStreamExample
{  
     public static void main(String args[])
	 {    
          try
		  {    
            File f=new File("File1.txt");
			Scanner in=new Scanner(f);    
            String i;
			while(in.hasNext())
			{				
				i=in.next();
				System.out.print(i);
			}
            in.close();    
          }
		  catch(Exception e){System.out.println(e);}    
    }    
} 