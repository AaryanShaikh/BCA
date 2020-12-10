//Program to find the  largest of 3 numbers using if else
import java.util.*;
public class Greatif
{ 
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num1=0,num2=0,num3=0,large=0,flag=0,c=0;
		do
		{
			flag=0;
				System.out.println("Enter the First number");
				num1=in.nextInt();
				System.out.println("Enter the Second number");
				num2=in.nextInt();
				System.out.println("Enter the Third number");
				num3=in.nextInt();
			if(num1>num2&&num1>num3)
			{
				System.out.println("The largest of the 3 numbers is "+num1);
			}
			else if(num2>num3)
			{
				System.out.println("The largest of the 3 numbers is "+num2);
			}
			else
			{
				System.out.println("The largest of the 3 numbers is "+num3);
			}
			System.out.print("Enter 1 if you want to continue:");			
				c=in.nextInt();
			if(c==1){flag=1;}			
		}while(flag==1);
	}
}