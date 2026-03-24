//final keyword
//sinal class f 	//with error
class f				//without error
{
	int d=100;
}
class final_key extends f
{
	public static void main(String[] args)
	{
		final_key ob=new final_key();
		System.out.println(ob.d);
	}
}