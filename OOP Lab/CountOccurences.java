//write a program to read a text and count all the occurences of the particular word
import java.util.*;
public class CountOccurences
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String word=in.nextLine();
		System.out.println("Enter the particular word you want to check");
		char ch=in.next().charAt(0);
		char arr[]=word.toCharArray();
		int size=word.length();
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(ch==arr[i])
			{
			count++;
			}
		}
		System.out.println("The number of Occurences of letter '"+ch+"' is "+count);
	}
}
