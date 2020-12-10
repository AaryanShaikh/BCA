//Program to swap the 2 numbers using bitwise operator
import java.util.*;
public class Swapbit
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int flag=0;
		do
		{
			flag=0;
				System.out.print("Enter the First number:");
				int num1=in.nextInt();
				System.out.print("Enter the Second number:");
				int num2=in.nextInt();
	
			System.out.println();
			System.out.println("After Swapping");
			num1=num1^num2;
			num2=num1^num2;
			num1=num1^num2;
			System.out.println("First number is "+num1);
			System.out.println("Second number is "+num2);
			System.out.print("Enter 1 if you want to continue:");
			
				int c=in.nextInt();
			
			if(c==1){flag=1;}			
		}while(flag==1);
	}
}
		