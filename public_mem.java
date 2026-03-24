//public access specifiers
class public_mem
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		System.out.println(public_mem.sum(50,60));
	}
}