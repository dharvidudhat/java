//constructor inheritance of derived class object
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
		System.out.println("class b's constructor.");
	}
}
class conherit2
{
	public static void main(String[] args)
	{
		b obj=new b();
	}
}