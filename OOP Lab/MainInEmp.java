class InEmp
{
	String name;
	int age;
	String add;
}
class program extends InEmp
{
	String lan;
}
class MainInEmp
{
	public static void main(String[] args)
	{
		program p=new program();
		p.name="xyz";
		p.age=25;
		System.out.println(p.name);
	}
}