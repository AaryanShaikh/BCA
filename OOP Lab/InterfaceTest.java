import java.util.*;
//Program to compute area using interfaces
//An Interface starts with the keyword "interface"
interface Area
{
//A data member in an interface should always have an assigned value	
	final float PI=3.14f;
//All the methods within an interface should be an abstract methods(No definition)	
	float compute(float x,float y);
}
//As in Inheritance we extend a class, in interface we implement an interface
class Rectangle implements Area
{
//if an interface is implemented in a class then its definition should be defined in that class	
	public float compute(float x, float y) 
	{
		return (x*y);
	}
}
class Circle implements Area
{
	public float compute(float x,float y)
	{
		return (PI*x*x);
	}
}
class InterfaceTest
{
	public static void main(String[] args)
	{
		Rectangle rect=new Rectangle();
		Circle cir=new Circle();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int len=in.nextInt();
		System.out.println("Enter the breath of the rectangle");
		int bre=in.nextInt();
		System.out.println("Enter the radius of the rectangle");
		int rad=in.nextInt();
		System.out.println(rect.compute(len,bre));
		System.out.println(cir.compute(rad,0));
//You can't create objects of an interface but you can create a refrence of an interface		
		Area A;
// and assign another class's object to that refrence		
		A=rect;
		System.out.println(A.PI);
	}
}