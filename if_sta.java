//if statement
class if_sta
{
	public static void main(String[]args)
	{
		String name[]={"dharvi","trusha","twinsi","priyanka"};
		int roll[]={1,2,3,4};
		if(name[0]=="dharvi"&&roll[0]==1)
		{
			System.out.println("info about dharvi.");
		}
		else if(name[1]=="trusha"&&roll[1]==2)
		{
			System.out.println("info about trusha.");
		}
		else if(name[2]=="twinsi"&&roll[2]==3)
		{
			System.out.println("info about twinsi.");
		}
		else 
		{
			System.out.println("info about priyanka.");
		}
	}
}