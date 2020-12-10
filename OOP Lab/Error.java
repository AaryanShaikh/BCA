//Program to test nested exceptions
class Error
{
	public static void main(String[] args)
	{
		try
		{
			int a=2,b=4,c=2,x=7,z;
			int p[]={2};
			p[3]=3;
			try
			{
				z=x/((b*b)-(4*a*c));
				System.out.println("The value of 2 is ="+z);
			}
			catch(ArithmeticException e){System.out.println("Division BY 0");}
		}
		catch(ArrayIndexOutOfBoundsException e){System.out.println("Array out of bound");}
	}
}