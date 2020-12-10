//Program to find the area & volume of LivingRoom using Inheritance
class Room
{
	int len,bre;
	Room(int x,int y)
	{
		len=x;
		bre=y;
	}
	int area()
	{
		return len*bre;
	}
}
class LivingRoom extends Room
{
	int hei;
	LivingRoom(int x,int y,int z)
	{
		super(x,y);
		hei=z;
	}
	int vol()
	{
		return hei*len*bre;
	}
	public static void main(String[] args)
	{
		LivingRoom l=new LivingRoom(10,20,30);
		int area=l.area();
		int vol=l.vol();
		System.out.println(area);
		System.out.println(vol);
	}
}