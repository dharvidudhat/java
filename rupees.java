//dollar to indian rupees
import java.util.Scanner;
class rupees
{
	public static void main(String[]args)
	{
		double indian=89.63;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter dollar rupees:");
		double dollar=scn.nextDouble();
		double dti=dollar*indian;
		System.out.println("dollar rupees to indian rupees:"+dti);
	}
}