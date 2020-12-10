import java.util.*;
public class Multab
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int res=0;
		for(int j=1;j<=10;j++)
		{
			for(int i=2;i<=10;i++)
			{
				res=i*j;
				System.out.print(res+"	");
			}
			System.out.println();
		}
		
	}
}