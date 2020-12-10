import java.util.*;
class Factorial
{
	int num,fact=1;
	void data()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=in.nextInt();
	}
	void exe()
	{
		fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
	}
	void res()
	{
		System.out.println("The Factorial of "+num+" is "+fact);
	}
}
class MainFactorial
{
	public static void main(String[] args)
	{
		Factorial f=new Factorial();
		f.data();
		f.exe();
		f.res();
	}
}