import java.util.*;
public class SampleB
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StringBuffer str=new StringBuffer("My name is");
		System.out.println(str);
		int len=str.length();
		int cap=str.capacity();
		System.out.println("The length of the String is:"+len);
		System.out.println("The Capacity of the String is:"+cap);
		str.append(" Aaryan");
		System.out.println("After append");
		System.out.println(str);
		str.insert(11,"Mr.");
		System.out.println("After insert");
		System.out.println(str);
		str.reverse();
		System.out.println("After reverse");
		System.out.println(str);
		str.reverse();
		str.delete(0,5);
		System.out.println("After delete");
		System.out.println(str);
		str.deleteCharAt(7);
		System.out.println("After deleteCharAt");
		System.out.println(str);
		str.replace(0,2,"name");
		System.out.println("After replace");
		System.out.println(str);
		StringBuffer str2=new StringBuffer();
		StringBuffer res=str2.append(in.nextLine());
		System.out.println(res);
	}
}