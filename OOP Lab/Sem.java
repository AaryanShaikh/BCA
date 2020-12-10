import java.util.*;
class Sem
{
	int src;
	String tnm,dest;
	float charges;
	void getData()
	{
		if(dest=="mumbai")
		{
			charges=1000;
		}
		else if(dest=="Chennai")
		{
			charges=2000;
		}
		else
		{
			charges=2500;
		}
	}
	Sem()
	{
		src=0;
		tnm="";
		dest="";
		charges=0.0f;
	}
	void inputData(int x,String y,String z)
	{
		src=x;
		tnm=y;
		dest=z;
	}
	void displayData()
	{
		System.out.println("src="+src);
		System.out.println("tnm="+tnm);
		System.out.println("dest="+dest);
		getData();
		System.out.println("charges="+charges);
	}
	public static void main(String[] args)
	{
		Sem s=new Sem();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value for src");
		int src1=in.nextInt();
		in.nextLine();//to come to next line
		System.out.println("Enter the value for tnm");
		String tnm1=in.nextLine();
		System.out.println("Enter the value for dest");
		String dest1=in.nextLine();
		s.inputData(src1,tnm1,dest1);
		s.displayData();
	}
}
