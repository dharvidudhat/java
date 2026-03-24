//random class
import java.util.Random;
public class randomcls
{
	public static void main(String[] args)
	{
		Random r = new Random();
		System.out.println(r.nextInt(10));
		System.out.println(r.nextBoolean());
		System.out.println(r.nextDouble());
		System.out.println(r.nextFloat());
	}
}