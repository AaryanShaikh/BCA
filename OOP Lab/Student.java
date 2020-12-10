//Program to print the marksheet of a student
import java.util.*;
class Student
{
	static int roll;
	static String name;
	static int age;
	static int sub[]=new int[4]; 
	static void data()
	{
		Scanner in=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the roll no of the student");
		roll=in.nextInt();
		in.nextLine();
 		System.out.println("Enter the name of the student");
		name=in.nextLine();
		System.out.println("Enter the age of the student");
		age=in.nextInt();
		System.out.println("Enter the marks in OOC(out of 50)");
		sub[count]=in.nextInt();
		count++;
		System.out.println("Enter the marks in DBMS(out of 50)");
		sub[count]=in.nextInt();
		count++;
		System.out.println("Enter the marks in CPS(out of 50)");
		sub[count]=in.nextInt();
		count++;
		System.out.println("Enter the marks in Economics(out of 50)");
		sub[count]=in.nextInt();
	}
	static void show()
	{
		int i=0,sum=0;
		float percentage=0.0f;
		System.out.println("\n		M.E.S College of Arts and Commerce\n");
		System.out.println("Name 	Roll.No 	OOC 	DBMS 	CPS 	Economics 	Percentage 	Grade");
		for(int j=0;j<4;j++)
		{
			sum=sum+sub[j];
		}
		percentage=(sum/200.0f)*100.0f;
		System.out.printf("%2s %10s %12d %8d %6d %6d ",name,roll,sub[i],sub[++i],sub[++i],sub[++i]);
		System.out.format("		%.2f",percentage);
		if(percentage>=86.0f)
		{
			System.out.print("  	   	A");
		}
		else if(percentage>=71.0f && percentage<=85.0f)
		{
			System.out.print("  	   	B");
		}
		else if(percentage>=51.0f && percentage<=70.0f)
		{
			System.out.print("  	   	C");
		}
		else if(percentage>=40.0f && percentage<=50.0f)
		{
			System.out.print("  	   	D");
		}
		else
		{
			System.out.print("  	   	F");
		}
	}
	public static void main(String[] args)
	{
		Student.data();
		Student.show();
	}
}