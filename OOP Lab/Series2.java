//Program to print the foll series (10,13.5,17...)
import java.util.*;
public class Series2
{ 	   
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num;
		float num1=10.0f;
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(num1);		
			}
			else
			{
				num=(int)num1;
				System.out.println(num);
			}
			num1+=3.5f;	
		}	
	}
}