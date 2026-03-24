// sub user define package
package animals.domenstic;
public class subpkg
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
		subpkg p=new subpkg();
		p.eat();
		p.travel();
	}
}