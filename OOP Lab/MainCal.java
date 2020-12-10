//Program to make a calculator using 2 classes
import java.util.*;
class Cal
{
	int num1,num2;
	void data(int x,int y)
	{
		num1=x;
		num2=y;
	}
	int add()
	{
		return num1+num2;
	}
	int sub()
	{
		return num1-num2;
	}
	int mul()
	{
		return num1*num2;
	}
	int div()
	{
		return num1/num2;
	}
}
class MainCal
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Cal c=new Cal();
		System.out.println("Enter the first no");
		int num1=in.nextInt();
		System.out.println("Enter the second no");
		int num2=in.nextInt();
		c.data(num1,num2);
		System.out.println("Press 1.To add");
		System.out.println("Press 2.To subtract");
		System.out.println("Press 3.To multiply");
		System.out.println("Press 4.To divide");
		System.out.println("Enter your Choice");
		int choice=in.nextInt();
		switch(choice)
		{
			case 1: int sum=c.add();
					System.out.println("The Sum is "+sum);
					break;
			case 2: int dif=c.sub();
					System.out.println("The Difference is "+dif);
					break;
			case 3: int pro=c.mul();
					System.out.println("The Product is "+pro);
					break;
			case 4: int quo=c.div();
					System.out.println("The Quotient is "+quo);
					break;
			default:System.out.println("wrong input!");
		}
	}
}