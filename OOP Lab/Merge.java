//Program to merge the 2 arrays together
import java.util.*;
public class Merge
{
	public static void main(String[] args)
	{			
			Scanner in=new Scanner(System.in);
			int a[];
			System.out.println("Enter the size of the First array");
			int sizea=in.nextInt();
			a=new int[sizea];
			System.out.println("Enter the elements in the First array");
			for(int i=0;i<sizea;i++)
			{
				a[i]=in.nextInt();
			}
			int b[];
			System.out.println("Enter the size of the Second array");
			int sizeb=in.nextInt();
			b=new int[sizeb];
			System.out.println("Enter the elements in the Second array");
			for(int i=0;i<sizeb;i++)
			{
				b[i]=in.nextInt();
			}
			int c[];
			int size=sizea+sizeb;
			c=new int[size];
			int ind=0;
			int size1=sizea;
			for(int i=1;i<=2;i++)
			{
				for(int j=0;j<size1;j++)
				{
					if(i==1)
					{
						c[ind]=a[j];
						ind++;
					}
					else
					{
						c[ind]=b[j];
						ind++;
					}
				}
				size1=sizeb;
			}
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size-1;j++)
				{
					if(c[j]>c[j+1])
					{
						int temp=c[j];
						c[j]=c[j+1];
						c[j+1]=temp;
					}
				}
			}
			System.out.println("The Merge Sorted array is");
			for(int i=0;i<size;i++)
			{
				System.out.print(c[i]+" ");
			}
	}
}