//Program to show the working of a TicketBooth
import java.util.*;
class TicketBooth
{
	int visitors,count;
	float money;
	TicketBooth()
	{
		visitors=0;
		count=0;
		money=0.00f;
	}
	void ticNotSold()
	{
		visitors++;
	}
	void ticSold()
	{
		count++;
		visitors++;
		money+=2.50f;
	}
	void show()
	{
		System.out.println("The no of people visited the Ticket Booth are:"+visitors);
		System.out.println("The Total no of money collected is:"+money);
	}
	void noTicSold()
	{
		System.out.println("The no of tickets sold are:"+count);
	}
}
class MainBooth extends TicketBooth
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		TicketBooth tb=new TicketBooth();
		boolean x=false;
		do
		{
			x=false;
				System.out.println("\nWelcome to the Ticket Booth!!\n");
				System.out.println("Would you like to buy a Ticket?\n1.Yes sure!\n2.No thanks.");
				int ans=in.nextInt();
				if(ans==1)
				{
					tb.ticSold();
					System.out.println("\nThank You for buying the ticket!");
				}
				else
				{
					tb.ticNotSold();
					System.out.println("\nPlease visit again another time!");
				}
			System.out.println("\nSo you want to.......?\n1.I want to try again!\n2.No thanks show me the results!");
			int ans2=in.nextInt();
			if(ans2==1){x=true;}
		}while(x);
		tb.show();
		tb.noTicSold();
	}
}