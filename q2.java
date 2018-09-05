/*
Q2. Create a class Complex with real and imaginary parts as it's data members.
Create a member function called Display() to display the complex number properly. 
Example : real part = 2 and imaginary part = 5, then the function should show 2+5i.
*/

class Complex
{
	private double real, imag;
	
	public void setVals(double r, double i)
	{
		real = r;
		imag = i;
	}
	
	public void display()
	{
		System.out.println("The complex number : " + real + " + i" + imag);
	}
}

class q2
{
	public static void main(String x[])
	{
		Complex obj = new Complex();
		obj.setVals(5.0,2.9);
		obj.display();
	}
}
