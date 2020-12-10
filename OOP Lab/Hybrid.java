//Program for Hybrid Inheritance
class Student
{
	int roll;
	public void getmarks(int x)
	{
		roll=x;
	}
	public void putnumber()
	{
		System.out.println("Roll No:"+roll);
	}
}
class Test extends Student
{
	float pt1,pt2;
	public void getmarks(float x,float y)
	{
		pt1=x;
		pt2=y;
	}
	public void putmarks()
	{
		System.out.println("Part 1:"+pt1+" & Part 2:"+pt2);
	}
}
interface sports
{
	float sportwt=0.0f;
	void putwt();
}
class Results extends Test implements sports
{
	float total;
	public void putwt()
	{
		System.out.println("sportwt:"+sportwt);
	}
	public void display()
	{
		putnumber();
		putmarks();
		putwt();
		total=pt1+pt2+sportwt;
		System.out.println(total);
	}
}
class Hybrid
{
	public static void main(String[] args)
	{
		Results r=new Results();
		r.getmarks(10);
		r.getmarks(20.0f,30.0f);
		r.display();
	}
}