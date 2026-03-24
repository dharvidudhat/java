//interface with inheritance
interface a
{
	public void msg();
}
class b implements a
{
	public void msg()
	{
		System.out.println("hello bca");
	}
}
class c extends b
{
	int sum(int a,int b)
	{
		return a+b;
	}
}
class interface_inherit
{
	public static void main(String[] args)
	{
		c obj=new c();
		obj.msg();
		int s=obj.sum(10,20);
		System.out.println("sum is : "+s);
	}
}