//Program to print the output using command line interface(input from the command prompt) 
class CLA
{
	public static void main(String args[])
	{
		System.out.println("Welcome");
		System.out.println("To the world of Java");
		
		for(int i=0;i<args.length;i++)
			System.out.println(args[i]);
	}
}
		
