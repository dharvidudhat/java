//method overriding
class vehicle
{
	void run()
	{
		System.out.println("vehicle is runing.");
	}
}
class bike extends vehicle
{
	void run()
	{
		System.out.println("bike runing safely.");
	}
}
class method_over
{
	public static void main(String[] args)
	{
		vehicle v=new vehicle();
		v.run();
		bike b=new bike();
		b.run();
	}
}