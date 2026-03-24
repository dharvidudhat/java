//string buffer
class strbuf
{
	public static void main(String []args)
	{
		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		System.out.println("default constructor "+sb);
		
		StringBuffer sb1=new StringBuffer(50);
		sb1.append("java programming");
		System.out.println("with capacity 50  "+sb1);
		
		StringBuffer sb2=new StringBuffer("welcome ");
		sb2.append("to java");
		System.out.println("with string "+sb2);
		
		StringBuffer sb3=new StringBuffer();
		System.out.println(sb3.capacity());
	}
}