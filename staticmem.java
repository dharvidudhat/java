//static member
class helper
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
}
class staticmem
{
	public static void main(String[] args)
	{
		int m=5,n=6;
		int s=helper.sum(m,n);
		System.out.println("sum is : "+s);
	}
}