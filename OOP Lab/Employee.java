//Program to show the details of 3 employees
import java.util.*;
class Employee
{
	static String name[]=new String[3];
	static String year[]=new String[3];
	static String salary[]=new String[3];
	static String address[]=new String[3];
	static int count=0;
	static void details(String w,String x,String y,String z)
	{
		name[count]=w;
		year[count]=x;
		salary[count]=y;
		address[count]=z;
		count++;
	}
	static void show()
	{
		System.out.println("Name			 Year	     		Salary				Address");
		for(int i=0;i<3;i++)
		{
			System.out.printf("%2s %25s %21s %25s",name[i],year[i],salary[i],address[i]);
			System.out.println();
		}
	}
public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int count=1;
		do
		{
			System.out.println("Details for the "+count+" employee");
			System.out.println("Enter the name of the employee");
			String name=in.nextLine();
			System.out.println("Enter the year of joining");
			String year=in.nextLine();
			System.out.println("Enter the salary of the employee");
			String salary=in.nextLine();
			System.out.println("Enter the address of the employee");
			String address=in.nextLine();
			Employee.details(name,year,salary,address);
			count++;
		}while(count<=3);
		Employee.show();
	}
}