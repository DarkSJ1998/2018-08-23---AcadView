class Test
{
	static
	{
		System.out.println("Static block called");
	}
}

class q3
{
	public static void main(String x[])
	{
		System.out.println("main() called");
		Test obj = new Test();
	}
}