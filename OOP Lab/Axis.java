//Program to show the working of Hierarchical Inheritance
class Bank
{
	void getRateOfInterest()
	{
		System.out.println("Bank Interest");
	}
}
class Sbi extends Bank
{
	void getRateOfInterest()
	{
		System.out.println("SBI Interest");
	}
}
class Icici extends Bank
{
	void getRateOfInterest()
	{
		System.out.println("ICICI Interest");
	}
}
class Axis extends Bank
{
	void getRateOfInterest()
	{
		System.out.println("AXIS Interest");
	}
	public static void main(String[] args)
	{
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		s.getRateOfInterest();
		i.getRateOfInterest();
		a.getRateOfInterest();
	}
}