class Room
{
	static int len,bre;
	static void read(int x,int y)
	{
		len=x;
		bre=y;
	}
	static int area()
	{
		return len*bre;
	}
}
class LivingRoom extends Room
{
	static int height;
	static void read2(int x)
	{
		height=x;
	}
	static int vol()
	{
		return height*len*bre;
	}
}
class MainRoom
{
	public static void main(String[] args)
	{
		LivingRoom.read(10,20);
		int area=LivingRoom.area();
		LivingRoom.read2(30);
		int vol=LivingRoom.vol();
		System.out.println(area);
		System.out.println(vol);
	}
}