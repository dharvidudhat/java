//static nested class
class outer
{
	static int outer_x=10;
	int outer_y=20;
	private static int outer_pvt=30;
	static class inner
	{
		void display()
		{
			System.out.println("outer_x : "+outer_x);
			System.out.println("outer_pvt : "+outer_pvt);
			outer ob=new outer();
			System.out.println("outer_y : "+ob.outer_y);
		}
	}
}
class static_nest
{
	public static void main(String[] args)
	{
		outer.inner obj=new outer.inner();
		obj.display();
	}
}