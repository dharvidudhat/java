//default access specifiers
class car
{
		String model;
}
class default_mem
{
	public static void main(String[] args)
	{
		car c=new car();
		c.model="tesla";
		System.out.println(c.model);
	}
}