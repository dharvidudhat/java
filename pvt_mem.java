//private access specifiers
class person
{
	private String name;
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
}
class pvt_mem
{
	public static void main(String[] args)
	{
		person p=new person();
		p.setname("dharvi");
		System.out.println(p.getname());
	}
}