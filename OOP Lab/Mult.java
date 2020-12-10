//Program to print the multiplication table
import java.io.*;
public class Mult
{
	public static void main(String[] args)
	{
		int table[][]=new int[50][50];
		for(int j=1;j<=10;j++)
		{
			for(int i=1;i<=10;i++)
			{
				table[j][i]=j*i;	
			}	
		}
		for(int j=1;j<=10;j++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%2d x %-2d = %-2d  ",i,j,table[j][i]);
			}
			System.out.println();
		}
	}
}