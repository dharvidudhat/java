//non-static member
class helper
{
	public int sum(int a,int b)
	{
		return a+b;
	}
}
class nonstaticmem
{
	public static void main(String[] args)
	{
		helper h=new helper();
		int m=5,n=6;
		int s=h.sum(m,n);
		System.out.println("sum is : "+s);
	}
}