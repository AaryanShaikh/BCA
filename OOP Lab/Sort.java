//Program to sort the array
import java.util.*;
public class Sort
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
			int a[];
			System.out.println("Enter the size of the array");
			int size=in.nextInt();
			a=new int[size];
			System.out.println("Enter the elements of the array");
			for(int i=0;i<size;i++)
			{
				a[i]=in.nextInt();
			}
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			System.out.println("The sorted array is:");
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
	}
}