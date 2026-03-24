//find area using encapsulation
class area
{
	int length;
	int breadth;
	void getdata()
	{
		int a=length*breadth;
		System.out.println("ractangle area:"+a);
	}
}
class encap
{
	public static void main(String[] args)
	{
		area obj=new area();
		obj.length=5;
		obj.breadth=6;
		obj.getdata();
	}
}