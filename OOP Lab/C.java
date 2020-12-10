class A
{
	A(int x)
	{
		System.out.println("A class");
		int a1=x;
		System.out.println(a1);
	}
}
class B extends A
{
	
	B(int x,int y)
	{
		super(x);
		System.out.println("B class");
		int b1=y;
		System.out.println(b1);
	}
}
class C extends B
{
	C(int x,int y,int z)
	{
		super(x,y);
		System.out.println("C class");
		int c1=z;
		System.out.println(c1);
	}
	public static void main(String[] args)
	{
		C c=new C(10,20,30);
		B b=new B(10,20);
		A a=new A(10);
	}
}