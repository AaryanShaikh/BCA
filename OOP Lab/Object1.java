import java.util.*;
class Object
{
	int num;
	Object(int x)
	{
		num=x;
	}
	Object add(Object o)
	{
		Object temp=new Object(num+o.num);
		return temp;
	}
	Object sub(Object o)
	{
		Object temp=new Object(num-o.num);
		return temp;
	}
	Object mul(Object o)
	{
		Object temp=new Object(num*o.num);
		return temp;
	}
	Object div(Object o)
	{
		Object temp=new Object(num/o.num);
		return temp;
	}
}
class Object1
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the First number");
		int num1=in.nextInt();
		System.out.println("Enter the Second number");
		int num2=in.nextInt();
		Object ob1=new Object(num1);
		Object ob2=new Object(num2);
		System.out.println("1=add\n2=subtract\n3=multiply\n4=divide\nWhat U choose??");
		int choice=in.nextInt();
		switch(choice)
		{
			case 1: Object ob3=ob1.add(ob2);
					System.out.println("Addition="+ob3.num);
					break;
			case 2: Object ob4=ob1.sub(ob2);
					System.out.println("Subtraction="+ob4.num);
					break;
			case 3: Object ob5=ob1.mul(ob2);
					System.out.println("Multiplication="+ob5.num);
					break;
			case 4: Object ob6=ob1.div(ob2);
					System.out.println("Division="+ob6.num);
					break;
			default: System.out.println("Wrong Input!");
					break;
		}
	}
}