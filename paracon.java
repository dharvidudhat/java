//parameterized constructor
class paracon
{
	String name;
	int id;
	paracon(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void display()
	{
		System.out.println("name : "+name+" id : "+id);
	}
	public static void main(String[] args)
	{
		paracon obj=new paracon("dharvi",47);
		obj.display();
	}
}