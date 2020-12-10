//Program to copy the values of 1 Object to another
class Box
{
	int w,h,d;
	Box(Box b)// takes an object as a parameter
	{
		w=b.w;
		h=b.h;
		d=b.d;
	}
	Box(int w,int h,int d)
	{
		this.w=w;
		this.h=h;
		this.d=d;
	}
	int vol()
	{
		return (w*h*d);
	}
}
class ObjectCopy
{
	public static void main(String[] args)
	{
		Box b1=new Box(10,20,30);
		Box b2=new Box(b1);// Coping values from b1 to b2
		int vol1=b1.vol();
		int vol2=b2.vol();
		System.out.println("Volume of b1= "+vol1);
		System.out.println("Volume of b2= "+vol2);
	}
}