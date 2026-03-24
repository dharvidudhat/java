//private constructor
class pvtcon
{
	private pvtcon()
	{
		System.out.println("i am peivate constructor.");
	}
	public static void main(String[] args)
	{
		pvtcon p=new pvtcon();
		System.out.println("i am class.");
	}
}