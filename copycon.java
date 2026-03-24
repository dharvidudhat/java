//copy constructor
class copycon
{
	String name;
	int id;
	copycon(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	copycon(copycon obj)
	{
		this.name=obj.name;
		this.id=obj.id;
	}
	public static void main(String[] args)
	{
		copycon ob=new copycon("dharvi",47);
		System.out.println("name : "+ob.name+" id : "+ob.id);
		copycon ob1=new copycon(ob);
		System.out.println("name : "+ob1.name+" id : "+ob1.id);
		
		
	}
}