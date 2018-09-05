/*
Q4.Study about Static blocks and push 1 example code on github.
*/

class Test
{
	static
	{
		System.out.println("Static block called");
	}
}

class q4
{
	public static void main(String x[])
	{
		System.out.println("main() called");
		Test obj = new Test();
	}
}
