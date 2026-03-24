//deep cloning
class abc
{
	int i,j;
	public String toString()
	{
		return "abc i = "+i+" abc j = "+j;
	}
}
class deep_clo
{
	public static void main(String[] args)
	{
		abc o=new abc();
		o.i=5;
		o.j=6;
		abc o1=new abc();
		o1.i=o.i;
		o1.j=o.j;
		o1.j=10;
		System.out.println(o);
		System.out.println(o1);
	}
}