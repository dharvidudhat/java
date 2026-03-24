//constructer overloading
class conover
{
	String model;
	int year;
	conover()
	{
		year=2006;
		model="alpha";
	}
	conover(int year)
	{
		this.year=year;
		model="beta";
	}
	conover(int year,String model)
	{
		this.year=year;
		this.model=model;
	}
	void display()
	{
		System.out.println("year : "+year+" model : "+model);
	}
	public static void main(String[] args)
	{
		conover c1=new conover();
		conover c2=new conover(2007);
		conover c3=new conover(2008,"gamma");
		c1.display();
		c2.display();
		c3.display();
	}
}