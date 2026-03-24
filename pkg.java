//user define package
package animals;
public class pkg
{
	public void eat()
	{
		System.out.println("mammal eats.");
	}
	public void travel()
	{
		System.out.println("mammal travels.");
	}
	public static void main(String[] args)
	{
		pkg p=new pkg();
		p.eat();
		p.travel();
	}
}