import java.util.*;
class C 
{
	public int in;
	void test()
	{
		System.out.println("enter the integer: ");
		Scanner obj=new Scanner(System.in);
		in = obj.nextInt();
	}
}
class B extends C
{
	void square()
	{
		System.out.println("Square of "+in+" is : "+in*in);
	}
}
class A extends B
{
	int cubee()
	{
		test();     //Accessed directly by calling the name of the method
		square();
		return in*in*in;
	}
	public static void main(String args[])
	{
		A objj = new A();
		int as = objj.cubee();
		System.out.println("Cube of "+objj.in+" is : "+as);
	}
}