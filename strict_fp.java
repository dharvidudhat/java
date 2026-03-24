//strictfp keyword
class strict_fp
{
	public strictfp double sum()
	{
		double n1=10e+10;
		double n2=6e+02;
		return(n1+n2);
	}
	public static void main(String[]args)
	{
		strict_fp s=new strict_fp();
		System.out.println(s.sum());
	}
}