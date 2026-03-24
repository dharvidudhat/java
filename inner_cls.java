//inner class (non-static nested class)
class outer
{
	static int outer_x=10;
	int outer_y=20;
	private int outer_pvt=30;
	class inner
	{
		void display()
		{
			System.out.println("outer_x : "+outer_x);
			System.out.println("outer_y : "+outer_y);
			System.out.println("outer_pvt : "+outer_pvt);
		}
	}
}
class inner_cls
{
	public static void main(String[] args)
	{
		outer o_obj=new outer();
		outer.inner i_obj=o_obj.new inner();
		i_obj.display();
	}
}