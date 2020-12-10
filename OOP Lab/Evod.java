//Program to find if the number is even or odd
import java.util.*;
public class Evod
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int res=0,flag=0;
		do
		{
			flag=0;
			System.out.println("Enter any Number");
			
				int n=in.nextInt();
			
			res=n%2;
			if(res==0)
			{
				System.out.println("The number "+n+" is an Even number");
			}
			else
			{
				System.out.println("The number "+n+" is an Odd number");
			}
			System.out.print("Enter 1 if you want to continue:");
			
				int c=in.nextInt();
			
			if(c==1){flag=1;}			
		}while(flag==1);
	}
}
		