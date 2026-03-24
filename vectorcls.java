//vector class
import java.util.Vector;
public class vectorcls
{
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<>(2);
		System.out.println("initial capacity : "+v.capacity());
		v.add(10);
		v.add(20);
		System.out.println("capacity after adding 2 elements : "+v.capacity());
		System.out.println(v);
		v.add(30);
		v.add(40);
		System.out.println("capacity after adding 3rd elements : "+v.capacity());
		System.out.println(v);
		v.add(50);
		v.add(60);
		System.out.println("capacity after adding 5 elements : "+v.capacity());
		System.out.println(v);
	}
}