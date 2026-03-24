////basic exception handling or pre define exception
class usrexception
{
	public static void main(String[] args)
	{
		int a=3;
		int b=0;
		try
		{
			int ans=a/b;
			System.out.println(ans); //its throws run time error
		}
		catch(Exception e)
		{
			System.out.println("something went wrong ..divide zero is not possible.");
		}
	}
}