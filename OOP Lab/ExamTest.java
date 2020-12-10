import java.util.*;
class Publication
{
	String title;
	float price;
	void getData(String t, float p)
	{
		title=t;
		price=p;
	}
	void putData()
	{
		System.out.println("Title="+title+"\nPrice="+price);
	}
}
class Book extends Publication
{
	int count;
	void getData(int c)
	{
		count=c;
	}
	void putData()
	{
		System.out.println("Count="+count);
	}
}
class Tape extends Publication
{
	float min;
	void getData(float m)
	{
		min=m;
	}
	void putData()
	{
		System.out.println("Minutes="+min);
	}
}
class ExamTest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Book b=new Book();
		Tape t=new Tape();
		System.out.println("Enter the No of pages");
		int bp=in.nextInt();
		b.getData(bp);
		System.out.println("Enter the No of Time");
		float mt=in.nextFloat();
		t.getData(mt);
		System.out.println("1.No of pages\n2.No of time\nEnter your choice");
		int choice=in.nextInt();
		switch(choice)
		{
			case 1: b.putData();
					break;
			case 2: t.putData();
					break;
			default: System.out.println("Wrong Input!");
					break;
		}
	}
}