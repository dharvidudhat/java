//constructor inheritance of base class object
class a
{
	a()
	{
		System.out.println("class a's constructor.");
	}
}
class b extends a
{
	b()
	{
		System.out.println("class b's constructor.");
	}
}
class conherit
{
	public static void main(String[] args)
	{
		a obj=new a();
	}
}
