//Program to print the foll series:(1 + 1/4 + 1/7...)
import java.util.*;
public class Series
{
	public static void main(String[] args)
	{
		int flag=0;
		do
		{
			flag=0;
			Scanner in=new Scanner(System.in);
			int num=1;
			int j=4;
			System.out.println("Enter the number of occurences");
			int size=in.nextInt();
			System.out.println();
			for(int i=0;i<size;i++)
			{
				if(i==0){System.out.print(num);continue;}
				System.out.print(" + "+num+"/"+j);
				j+=3;
			}
			System.out.println();
			System.out.println("Enter 1 if you want to continue");
			int x=in.nextInt();
			if(x==1){flag=1;}
		}while(flag==1);
	}
}