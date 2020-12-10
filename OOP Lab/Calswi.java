//Program to make a calculator using switch
import java.util.*;
public class Calswi
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num1=0,num2=0,choice=0,res=0,flag=0,c=0;
		do
		{
			flag=0;
				System.out.println("Enter the First Number");
				num1=in.nextInt();
				System.out.println("Enter the Second Number");
				num2=in.nextInt();
			System.out.println("");
			System.out.println("Press 1 to Add the 2 numbers");
			System.out.println("Press 2 to Subtract the 2 numbers");
			System.out.println("Press 3 to Multiply the 2 numbers");
			System.out.println("Press 4 to Divide the 2 numbers");
			System.out.println("Press 5 to find the Remainder");
			System.out.println("");
			System.out.println("What would you like to do?");
				choice=in.nextInt();
			switch(choice)
			{
				case 1: res=num1+num2;
						System.out.println("The Sum of the 2 numbers is "+res);
						break;
				case 2: res=num1-num2;
						System.out.println("The Difference of the 2 numbers is "+res);
						break;
				case 3: res=num1*num2;
						System.out.println("The Product of the 2 numbers is "+res);
						break;
				case 4: res=num1/num2;
						System.out.println("The Quotient after dividing the 2 numbers is "+res);
						break;
				case 5: res=num1%num2;
						System.out.println("The Remainder after dividing the 2 numbers is "+res);
						break;
				default: System.out.println("Please get your eyes checked! I said 1-5 ;)");
						break;
			}
			System.out.print("Enter 1 if you want to continue:");
				c=in.nextInt();
			if(c==1){flag=1;}			
		}while(flag==1);
	}
}