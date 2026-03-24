//hashtable class
import java.util.*;
public class hashtablecls
{
	public static void main(String[] args)
	{
		Hashtable<Integer,String> h1=new Hashtable<>();
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>(4);
		
		h1.put(1,"one");
		h1.put(2,"two");
		h1.put(3,"three");
		h2.put(4,"four");
		h2.put(5,"five");
		h2.put(6,"six");
		
		System.out.println("mapping of h1 : "+h1.size());
		System.out.println("key & value : "+h1);
		
		System.out.println("mapping of h2 : "+h2.size());
		System.out.println("key & value : "+h2);
	}
}