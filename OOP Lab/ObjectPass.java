//Program to pass an Object as a parameter
class ObjectPass
{
	int a,b;
	ObjectPass(int x,int y)
	{
		a=x;
		b=y;
	}
	boolean equalTo(ObjectPass o)
	{
		return(o.a==a&&o.b==b);
	}
	public static void main(String[] args)
	{
		ObjectPass ob1=new ObjectPass(100,220);
		ObjectPass ob2=new ObjectPass(100,220);
		ObjectPass ob3=new ObjectPass(-1,-1);
		System.out.println("ob1==ob2="+ob1.equalTo(ob2));// object ob2 is passed as an parameter
		System.out.println("ob1==ob3="+ob1.equalTo(ob3));// object ob3 is passed as an parameter
	}
}