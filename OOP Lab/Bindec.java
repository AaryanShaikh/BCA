//Program to convert binary to decimal
import java.util.*;
public class Bindec
{
	public static void main(String[] args)
	{
		int flag=0;
		do
		{
			flag=0;
			Scanner in=new Scanner(System.in);
			System.out.println("Enter the Binary number");
			String bin=in.nextLine();
			System.out.println("The Decimal number is "+Integer.parseInt(bin,2));
			System.out.print("Enter 1 if you want to continue:");
			
				int c=in.nextInt();
				
		 if(c==1){flag=1;}			
		}while(flag==1);
	}
}