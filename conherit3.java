//constructor inheritance of sub derived class
class a
{
	a()
	{
		System.out.println("class a's constructor");
	}
}
class b extends a
{
	b()
	{
		System.out.println("class b's constructor");
	}
}
class c extends b
{
	c()
	{
		System.out.println("class c's constructor");
	}
}
class conherit3
{
	public static void main(String[] args)
	{
		c obj=new c();
	}
}