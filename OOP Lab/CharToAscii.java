//Program to find the ascii value of the character
import java.util.*;
public class CharToAscii
{
	public static void main(String[] args)
	{
		int flag=0;
		do
		{
			flag=0;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the character to find its ASCII value");
			char ch=in.next().charAt(0);
			int num=ch;
			System.out.println("The ASCII value of "+ch+" is:"+num);
			System.out.println("Enter 1 if you want to continue");
			int x=in.nextInt();
			if(x==1){flag=1;}
		}while(flag==1);
	}
}