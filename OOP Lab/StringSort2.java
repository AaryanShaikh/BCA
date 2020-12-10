//Program to sort the letters in the String in sorted order (JAVA=AAJV)
import java.util.*;
public class StringSort2
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=in.nextLine();
		char arr[]=word.toCharArray();
		for(int i=0;i<word.length();i++)
		{
			for(int j=0;j<(word.length())-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<word.length();i++)
		{
				System.out.print(arr[i]);
		}
	}
}