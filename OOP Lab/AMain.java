class A1
{
	void A()
	{
		System.out.println("1");
	}
}
class A2 extends A1
{
	void A()
	{
		System.out.println("2");
	}
}
class A3 extends A2
{
	void A()
	{
		System.out.println("3");
	}
}
class AMain
{
	public static void main(String[] args)
	{
		A3 ob=new A3();
		ob.A();
	}
}