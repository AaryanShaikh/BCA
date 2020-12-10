//Program to print the Fibonacci series
import java.util.*;
public class Fibo
{
	public static void main(String[] args)
	{
		int flag=0;
		do
		{
			flag=0;
			Scanner in=new Scanner(System.in);
			int a=0,b=1;
			System.out.println("Enter the number of Fibonacci series");
			int n=in.nextInt();
			System.out.println("The First "+n+" Fibonacci series is:");
			System.out.println(a);
			System.out.println(b);
			for(int i=0;i<n-2;i++)
			{
				int c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
			System.out.println("Enter 1 if you want to continue");
			int num=in.nextInt();
			if(num==1){flag=1;}
		}while(flag==1);
	}
}