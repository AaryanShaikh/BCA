import java.util.*;
class Person
{
String name;
long phone;
int age;
String course;
Scanner abc = new Scanner(System.in);

	void GetData()
	{
	System.out.println("ENTER NAME ");
	name=abc.next();
	System.out.println("ENTER PHONE ");
	phone=abc.nextLong();	
	System.out.println("ENTER AGE ");
	age=abc.nextInt();		
	System.out.println();
	}
	
	void Display()
	{
		System.out.println("\tNAME "+name);
		System.out.println("\tPHONE "+phone);
		System.out.println("\tAGE "+age);
		System.out.println();
	}
		
}

class Student extends Person
{
	String course;
	String status;
	int rollno;
		Student(String c,int r)
		{
			course=c;
			rollno=r;
		}
		
		void Stud()
		{
			System.out.println("enter status(nri/indian) ");
			status=abc.next();
			if(status=="nri")
			{
				System.out.println("------------MES COLLAGE----------------");
				System.out.println("\t______course is ______"+course);
				System.out.println("\t______Status is _______"+status);
				System.out.println("\t______Rollno is _______"+rollno);
			}
			else
			{
				System.out.println("------------Student From mes----------------");
				System.out.println("\t______course is ______"+course);
				System.out.println("\t______Status is _______"+status);
				System.out.println("\t______Rollno is _______"+rollno);
				
			}
		}
}	
class Employee extends Person
{
	int hours;
	float salary;
	
	String rank;
	String building;
	String date;
	void Employ()
	{
	System.out.println("--------FACULTY OF MES COLLAGE-------");
		System.out.println("     HOURS OF: "+name+" is "+hours);
		System.out.println("     BUILDING IS: "+building);
		System.out.println("     DATE OF HIRING :"+date);
	}
}

class Staff extends Employee
{
	Staff(int h,String r,String b,float s,String d)
	{
		hours=h;
		rank=r;
		building=b;
		salary=s;
		date=d;
	}	
}


class Faculty extends Employee
{
	Faculty(int h,String r,String b,float s,String d)
	{
		hours=h;
		rank=r;
		building=b;
		salary=s;
		date=d;
	}	
}

class Swida 
{
public static void main(String args[])
		{
		int ans;
		int and;
		String again="yes";
		Scanner abc= new Scanner(System.in);
		do
		{
			System.out.println("student(1) or employee(2) ?");
			ans=abc.nextInt();
		if(ans==1)
		{
			Student s1=new Student("ooc",17005);
			
			s1.GetData();
			s1.Stud();
			s1.Display();
		}
		else
		{
		
			System.out.println("faculty(1) or staff(2)");
			and=abc.nextInt();
			if(and==1)
			{
				Faculty f1=new Faculty(6,"professor","bca",20000,"12-09-15");
					f1.GetData();
					f1.Employ();
					f1.Display();
					
			}
			else
			{
				Staff st=new Staff(12,"peon","bba",12000,"10-12-2016");
				st.GetData();
				st.Employ();
				st.Display();
			}
		}
		System.out.println("do u wanna continue yes/no");
		again=abc.next();
		}while(again.equalsIgnoreCase("yes"));	
 }		

}

