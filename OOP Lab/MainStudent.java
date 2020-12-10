import java.util.*;
class Student
{
	int roll;
	String name;
	int age;
	
	void data()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the roll no of the student");
		roll=in.nextInt();
		in.nextLine();
		System.out.println("Enter the name of the student");
		name=in.nextLine();
		System.out.println("Enter the age of the student");
		age=in.nextInt();
	}
	void show()
	{
		System.out.println("The student "+name+" is "+age+" yrs old & roll no is "+roll);
	}
}
class MainStudent
{
	public static void main(String[] args)
	{
		Student stud=new Student();
		stud.data();
		stud.show();
	}
}