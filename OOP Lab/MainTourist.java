import java.util.*;
class Tourist
{
	int CNo;
	char CType;
	float PerKM,Distance;
	Tourist()
	{
		CType='A';
		CNo=0000;
	}
	void CityCharges()
	{
		if(CType=='A')
		{
			PerKM=20.0f;
		}
		else if(CType=='B')
		{
			PerKM=18.0f;
		}
		else
		{
			PerKM=15.0f;
		}
	}
	void RegisterCab(int x,char y)
	{
		CNo=x;
		CType=y;
		CityCharges();
	}
	void Display(float x)
	{
		Distance=x;
		System.out.println("CNo="+CNo);
		System.out.println("CType="+CType);
		System.out.println("PerKM="+PerKM);
		float amt=PerKM*Distance;
		System.out.println("Amount="+amt);
	}
}
public class MainTourist
{
	public static void main(String[] args)
	{
		Tourist t=new Tourist();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values for CNo");
		int CNo=in.nextInt();
		System.out.println("Enter the values for CType");
		char CType=in.next().charAt(0);
		System.out.println("Enter the values for Distance");
		float Distance=in.nextFloat();
		t.RegisterCab(CNo,CType);
		t.Display(Distance);
	}
}
