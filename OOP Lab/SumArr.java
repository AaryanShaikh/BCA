//Program to find the sum of all the elements of the array
import java.util.*;
public class SumArr
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int flag=0;
		do
		{
			flag=0;
			System.out.println("Enter the size of the array");
			int size=in.nextInt();
			int a[];
			a=new int[size];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<size;i++)
			{
				a[i]=in.nextInt();
			}
			int sum=0;
			for(int i=0;i<size;i++)
			{
				sum+=a[i];
			}
			System.out.print("The sum of all the elements of the array is:"+sum);
			System.out.println();
			System.out.println("Enter 1 if you want to continue");
			int x=in.nextInt();
			if(x==1){flag=1;}
		}while(flag==1);
	}
}
		