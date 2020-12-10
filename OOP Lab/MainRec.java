import java.util.*;
class Rec
{
	int len,bre;
	void data(int x,int y)
	{
		len=x;
		bre=y;
	}
	void show()
	{
		int area=len*bre;
		System.out.println("The area of the rectangle is "+area);
	}
}
class MainRec
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Rec r=new Rec();
		System.out.println("Enter the length of the rectangle");
		int len=in.nextInt();
		System.out.println("Enter the breath of the rectangle");
		int bre=in.nextInt();
		r.data(len,bre);
		r.show();
	}
}