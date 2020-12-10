//Program to return an object
class Object
{
	int a;
	Object(int x)
	{
		a=x;
	}
	Object incrBy10()
	{
		Object temp=new Object(a+10); //Creating an object temp
		return temp;// Returning the object
	}
}
class ObjectReturn
{
	public static void main(String[] args)
	{
		Object ob1=new Object(2);
		Object ob2;
		ob2=ob1.incrBy10();// Calling the incrBy10() method & increasing the value of ob1.a by 10 & assigning it to ob2
		System.out.println("Ob1(a)= "+ob1.a);
		System.out.println("Ob2(a)= "+ob2.a);
	}
}