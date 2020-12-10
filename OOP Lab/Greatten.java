//Program to find the largest of the 3 numbers using ternary operator
import java.util.*;
public class Greatten
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int flag=0,large=0;
		do
		{
			flag=0;
			
				System.out.println("Enter the First number");
				int num1=in.nextInt();
				System.out.println("Enter the Second number");
				int num2=in.nextInt();
				System.out.println("Enter the Third number");
				int num3=in.nextInt();
			
			large=num3>(num1>num2?num1:num2)?num3:(num1>num2?num1:num2);
			System.out.println("The Largest out of the 3 is "+large);
			System.out.print("Enter 1 if you want to continue:");
			
				int c=in.nextInt();

			if(c==1){flag=1;}			
		}while(flag==1);
	}
}
		