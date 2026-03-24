//method overloading
class methodover
{
	public int multiply(int a,int b)
	{
		int m=a*b;
		return m;
	}
	public int multiply(int a,int b,int c)
	{
		int m=a*b*c;
		return m;
	}
	public static void main(String[] args)
	{
		methodover ob=new methodover();
		int m1=ob.multiply(10,20);
		System.out.println("multiply of two int value : "+m1);
		int m2=ob.multiply(10,20,30);
		System.out.println("multiply of three int value : "+m2);
	}
}