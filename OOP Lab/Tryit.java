//Program for inheritance
import java.util.*;
class Person
{
	String name,address,phone,email;
	void getData(String n,String a,String p,String e)
	{
		name=n;address=a;phone=p;email=e;
	}
	void showData()
	{
		System.out.println("Name="+name+"\nAddress="+address+"\nPhone="+phone+"\nEmail="+email);
	}
}
class Student extends Person
{
	String status;
	void getStatus(String s)
	{
		status=s;
	}
	void showStatus()
	{
		System.out.println("Status="+status);
	}
}
class Employee extends Person
{
	String office,salary,hiringDate;
	void getEmployee(String o,String s,String h)
	{
		office=o;salary=s;hiringDate=h;
	}
	void showEmployee()
	{
		System.out.println("Office="+office+"\nSalary="+salary+"\nHiring Date="+hiringDate);
	}
}
class Faculty extends Employee
{
	String officeHr,rank;
	void getFaculty(String oh,String r)
	{
		officeHr=oh;rank=r;
	}
	void showFaculty()
	{
		System.out.println("Office Hour="+officeHr+"\nRank="+rank);
	}
}
class Staff extends Employee
{
	String title;
	void getStaff(String t)
	{
		title=t;
	}
	void showStaff()
	{
		System.out.println("Title="+title);
	}
}
class Tryit
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Student s=new Student();
		s.getData("MyName","MyPlace","MyNo","MyEmail");
		s.getStatus("MyStatus");
		Employee e=new Employee();
		e.getEmployee("BCA","1000","19-9-2018");
		Faculty f=new Faculty();
		f.getFaculty("6 hrs","Professor");
		Staff st=new Staff();
		st.getStaff("Teaching Staff");
		System.out.println("1.Staff Details");
		System.out.println("2.Faculty Details");
		System.out.println("3.Student Details");
		int choice=in.nextInt();
		switch(choice)
		{
			case 1: st.showStaff();e.showEmployee();s.showData();
					break;
			case 2: f.showFaculty();e.showEmployee();s.showData();
					break;
			case 3: s.showStatus();s.showData();
					break;
			default: System.out.println("Wrong Input");
					 break;
		}
	}
}