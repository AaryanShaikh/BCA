public class SampleA
{
	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("Object Language");
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			int p=i+1;
			System.out.println("The character at "+p+" is "+str.charAt(i));
		}
		String str1=new String(str);
		int pos=str1.indexOf(" Language");
		System.out.println("IndexOf (Language) is "+pos);
		str.insert(pos," Oriented");
		System.out.println(str);
		str.append(" is the best for security");
		System.out.println(str);
	}
}