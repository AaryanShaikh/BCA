//Program to count the number of vowels & consonants in a String
import java.util.*;
public class Vowcon
{
	public static void main(String[] args)
	{
		int flag=0;
		do
		{
			int vowels=0,consonants=0;
			Scanner in=new Scanner(System.in);
			flag=0;
			System.out.println("Enter the word");
			String word=in.nextLine();
			word=word.toLowerCase();
			for(int i=0;i<word.length();i++)
			{
				char ch=word.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			System.out.println("In this string there are "+vowels+" vowels and "+consonants+" consonants");
			System.out.print("Enter yes if you want to continue:");
			String c=in.nextLine();
			if(c.equals("yes"))
			{
				flag=1;
			}			
		}while(flag==1);
	}
}