//explicit type casting
class explicit
{
	public static void main(String[]args)
	{
	double d=100.245;
	int k=(int)d;
	String str=String.valueOf(k);
	System.out.println("original value before casting : "+d);
	System.out.println("after type casting to int : "+k);
	System.out.println("after type casting to string : "+str);
	}
	
}