//Program to print the corresponding week name
import java.util.*;
public class Week
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int flag=0;
		do
		{
			flag=0;
			System.out.println("Enter the number to find the corresponding Week Name(1-7)");
			int num=in.nextInt();
			switch(num)
			{
				case 1: System.out.println(num+".Monday is the First day of the week");
				break;
				case 2: System.out.println(num+".Tuesday is the Second day of the week");
				break;
				case 3: System.out.println(num+".Wednesday is the Third day of the week");
				break;
				case 4: System.out.println(num+".Thursday is the Fourth day of the week");
				break;
				case 5: System.out.println(num+".Friday is the Fifth day of the week");
				break;
				case 6: System.out.println(num+".Saturday is the Sixth day of the week");
				break;
				case 7: System.out.println(num+".Sunday is the Seventh day of the week");
				break;
				default: System.out.println(num+".Does not come in the range of 1-7");
				break;
			}
			System.out.println("Enter 1 if you want to continue");
			int x=in.nextInt();
			if(x==1){flag=1;}
		}while(flag==1);
	}
}
		
		