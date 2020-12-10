import java.util.*;
public class NumPat
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			int k=1;
			for(int j=1;j<=7;j++)
			{
				if(j>=5-i&&j<=3+i)
				{
					System.out.print(k);
					if(j<4)
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