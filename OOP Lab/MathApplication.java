class MathOperations
{
	static float mul(float x,float y)
	{
		return x*y;
	}
	static float div(float x,float y)
	{
		return x/y;
	}
}
class MathApplication
{
	public static void main(String[] args)
	{
		float a=MathOperations.mul(4.0f,5.0f);
		float b=MathOperations.div(a,20.0f);
		System.out.println(b);
	}
}