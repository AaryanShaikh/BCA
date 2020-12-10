//Program to find if the number is positive negative or zero
import java.util.*;
public class Pone
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int c=0,flag=0;
		do
		{
			flag=0;
			System.out.println("Enter the Number ");
			
				int n=in.nextInt();
				
			if(n<0)
			{
				System.out.println("The number "+n+" is negative number");
			}
			else if(n>0)
			{
				System.out.println("The number "+n+" is Positive number");
			}
			else
			{
			System.out.println("The number "+n+" is Zero");
			}
			System.out.println("Enter 1 to continue");
				c=in.nextInt();
	
			if(c==1){flag=1;}			
		}while(flag==1);
	}
}
		