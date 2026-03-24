//stack class
import java.util.Stack;
class stackex
{
	public static void main(String[] args)
	{
		Stack<Integer> s=new Stack<>();
		s.push(40);
		s.push(30);
		s.push(70);
		s.push(60);
		s.push(60);
		System.out.println(s);
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}
}