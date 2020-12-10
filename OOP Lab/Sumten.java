//Program to find the sum of the first 10 natural numbers
import java.util.*;
public class Sumten
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum of the First 10 natural numbers is "+sum);
	}
}