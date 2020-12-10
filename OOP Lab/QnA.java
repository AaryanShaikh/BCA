//Program to output the question & read in the correct answer.
import java.util.*;
public class QnA
{
	public static void main(String[] args)
	{
		int flag=0;
		boolean x=false;
		do
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Who is the inventer of C?");
			String result=in.nextLine();
			if(result.equalsIgnoreCase("dennis ritchie"))
			{
				System.out.println("Good");
				flag=3;
				x=true;
			}
			else
			{
				if(flag<2)
				{
					System.out.println("Try again!");
				}
				flag++;
			}
		}while(flag<3);
		if(x==false)
		{
			System.out.println("The Correct answer is Dennis Ritchie!");
		}
	}
}