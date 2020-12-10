class Rectangle
{
	int len,bre;
	Rectangle()
	{
		len=bre=0;
	}
	Rectangle(int x,int y)
	{
		len=x;
		bre=y;
	}
	void rectArea()
	{
		int area=len*bre;
		System.out.println("The area of the rectangle is "+area);
	}
}
class MainRectangle
{
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();
		Rectangle r2=new Rectangle(10,20);
		r.rectArea();
		r2.rectArea();
	}
}