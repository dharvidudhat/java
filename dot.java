//dot operator
class person
{
	String name;
	int age;
}
class dot
{
	public static void main(String[]args)
	{
		person p=new person();
		p.name="dharvi";
		p.age=18;
		System.out.println("name : "+p.name);
		System.out.println("age : "+p.age);
	}
}