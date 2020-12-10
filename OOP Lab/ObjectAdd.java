//Program to add 2 objects values
class Object
{
	int num1,num2;
	Object(int x,int y)
	{
		num1=x;
		num2=y;
	}
	Object add(Object o)
	{
		Object temp=new Object(num1+o.num1,num2+o.num2);
		return temp;
	}
}
class ObjectAdd
{
	public static void main(String[] args)
	{
		Object ob1=new Object(4,6);
		Object ob2=new Object(2,4);
		Object ob3=ob1.add(ob2);
		System.out.println("ob1-> num1:"+ob1.num1+" num2:"+ob1.num2);
		System.out.println("ob2-> num1:"+ob2.num1+" num2:"+ob2.num2);
		System.out.println("ob3-> num1:"+ob3.num1+" num2:"+ob3.num2);
	}
}