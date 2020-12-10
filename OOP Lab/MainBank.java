//Program for basic operations of a bank
import java.util.*;
class Bank
{
	int cid;
	String name;
	float amount;
	Scanner in=new Scanner(System.in);
	void data(int x,String y,float z)
	{
		cid=x;
		name=y;
		amount=z;
	}
	void deposit()
	{
		System.out.println("Enter the amount you want to deposit");
		float dep=in.nextFloat();
		amount=amount+dep;
	}
	void withdraw()
	{
		System.out.println("Enter the amount you want to withdraw");
		float wit=in.nextFloat();
		if(wit>amount)
		{
			System.out.println("you don't have that much of amount");
		}
		else
		{
			amount=amount-wit;
		}
	}
	void chkBal()
	{
		System.out.println("The amount remaining is "+amount);
	}
}
class MainBank
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Bank b=new Bank();
		boolean x=true;
		System.out.println("Enter the Customer ID");
		int cid=in.nextInt();
		in.nextLine();
		System.out.println("Enter the name of the customer");
		String name=in.nextLine();
		System.out.println("Enter the amount");
		float amount=in.nextFloat();
		b.data(cid,name,amount);
		do
		{
			System.out.println();
			System.out.println("Press 1.to deposit");
			System.out.println("Press 2.to withdraw");
			System.out.println("Press 3.to check balance");
			System.out.println("Press 4.to quit");
			System.out.println("what you want to do?");
			int choice=in.nextInt();
			switch(choice)
			{
				case 1:b.deposit();
					   break;
				case 2:b.withdraw();
					   break;
				case 3:b.chkBal();
					   break;
				case 4:x=false;
					   break;
				default:System.out.println("wrong input!");
					   break;
			}
		}while(x);
	}
}