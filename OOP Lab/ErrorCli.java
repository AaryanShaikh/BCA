//Program to catch exceptions from CLI
class ErrorCli
{
	public static void main(String[] args)
	{
		int number=0,count=0,invalid=0,valid=0;
		for(int i=0;i<args.length;i++)
			{
				try
				{
			
					number=Integer.parseInt(args[i]);
				}
				catch(NumberFormatException e)
				{
					invalid++;
					continue;
				}
				count++;
			}
				System.out.println("The number of Valid numbers are "+count);
				System.out.println("The number of InValid numbers are "+invalid);
	}
}