public class Pattern
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			boolean toggle=true;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i&&toggle)
				{
					System.out.printf("*");
					toggle=false;
				}
				else
				{
					System.out.print(" ");
					toggle=true;
				}
			}
			System.out.println();
		}
	}
}