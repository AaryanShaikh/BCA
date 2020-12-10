import java.util.*;
public class Pascal
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			int k=i;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i)
				{
					System.out.print(k);
					if(j<5)
					{
						k++;
					}
					else
					{
						k--;
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}