//Program to convert decimal to binary
import java.util.*;
public class Decbin
{
	public static void main(String[] args)
	{
		int flag=0;
		do
		{
			flag=0;
			Scanner in=new Scanner(System.in);
			int res=0,ind=0;
			int arr[]=new int[50];
			System.out.println("Enter the number");
			int n=in.nextInt();
			while(n>0)
			{
				res=n%2;
				arr[ind++]=res;
				n=n/2;
			}
			System.out.println("The binary form is");
			for(int i=ind-1;i>=0;i--)
			{
				System.out.print(arr[i]);
			}
			System.out.println();
			System.out.println("Enter 1 if you want to continue:");
				int c=in.nextInt();
		 if(c==1){flag=1;}			
		}while(flag==1);
	}
}	