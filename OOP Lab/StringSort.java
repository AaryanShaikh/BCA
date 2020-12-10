//Program to input a number of names & display it in sorted order 
import java.util.*;
public class StringSort
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String name[];
		System.out.println("Enter the size/no of names you want to enter");
		int size=in.nextInt();
		in.nextLine();
		name=new String[size];
		System.out.println("Enter the "+size+" Names");
		for(int i=0;i<size;i++)
		{
			name[i]=in.nextLine();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(name[j].compareTo(name[j+1])>0)
				{
					String temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
				}
			}
		}
		System.out.println("The Sorted order of the names are");
		for(int i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
	}
}
		
	