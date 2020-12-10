class A
{
	int a;
	A(int x)
	{
		a=x;
		System.out.println(a);
	}
}
class B extends A
{
	int b;
	B(int x,int y)
	{
		super(x);
		b=y;
		System.out.println(b);
	}
}
class C extends A
{
	int c;
	C(int x,int y)
	{
		super(x);
		c=y;
		System.out.println(c);
	}
}class D extends A
{
	int d;
	D(int x,int y)
	{
		super(x);
		d=y;
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		B b=new B(10,20);
		C c=new C(20,30);
		D d=new D(40,50);
	}
}