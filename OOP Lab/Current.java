//Program to show the working of Savings A/C & Current A/C 
import java.util.*;
class Account
{
	String name;
	int acno;
	int balance;
	void data(String x,int y,int z)
	{
		name=x;
		acno=y;
		balance=z;
	}
	void deposit(int x)
	{
		balance+=x;
		System.out.println("Amount Deposited Successfully!");
	}
}
class Savings extends Account
{
	void withdraw(int x)
	{
		int withdraw=x;
		if(withdraw>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			balance-=withdraw;
			System.out.println("Amount withdrawal was Successfull!");
		}
	}
		void interest()
		{
			int interest=(balance*10)/100;
			System.out.println("Interest Added="+interest);
			balance+=interest;
		}
}
class Current extends Savings
{
	int chbk;
	void check()
	{
		chbk=balance;
		if(chbk<1000)
		{
			System.out.println("Penalty Imposed");
		}
		else
		{
			System.out.println("Name = "+name+" Account.No = "+acno+" Balance = "+balance);
		}
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Name of the customer: ");
		String name=in.nextLine();
		System.out.print("Enter the Account.No: ");
		int acno=in.nextInt();
		System.out.print("Enter the Opening Balance: ");
		int balance=in.nextInt();
		Current c=new Current();
		c.data(name,acno,balance);
		boolean x=false;
		do
		{
			x=false;
			System.out.println("what you want to do?");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Compute Interest (10%)");
			System.out.println("4.Display Cheque Book");
			int choice=in.nextInt();
			switch(choice)
			{
				case 1: System.out.print("Enter the amount you want to deposit: ");
						int amt=in.nextInt();
						c.deposit(amt);
						break;
				case 2: System.out.print("Enter the amount you want to withdraw: ");
						int amt2=in.nextInt();
						c.withdraw(amt2);
						break;
				case 3: c.interest();
						break;
				case 4: c.check();
						break;
				default: System.out.println("Wrong Input");
						break;
			}
			System.out.print("Would you like to continue?\n1.Yes\n2.No\n");
			int z=in.nextInt();
			if(z==1){x=true;}
		}while(x);
	}	
}