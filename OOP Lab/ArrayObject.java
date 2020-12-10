//Program to create an Array of Objects
import java.util.*;
class A
{
	int i;
	A()
	{
		System.out.println("Welcome!");
	}
	void read(int x)
	{
		i=x;
	}
	void display()
	{
		System.out.println("i="+i);
	}
}
class ArrayObject
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the objects");
		int size=in.nextInt();
		A a1[]=new A[size];// Specifying there are 10 objects
		for(int i=0;i<size;i++)
			a1[i]=new A();// Creating the objects
		for(int i=0;i<size;i++)
			a1[i].read(i);
		for(int i=0;i<size;i++)
			a1[i].display();
	}
}