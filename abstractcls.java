//abstract class and abstract method
abstract class book
{
	public abstract void page();
}
public class abstractcls extends book
{
	public void page()
	{
		System.out.println("old book page.");
	}
	public static void main(String[] args)
	{
		book obj=new abstractcls();
		obj.page();
	}
}