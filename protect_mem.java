//protected access specifiers
class vehicle
{
	protected int speed;
}
class bike extends vehicle
{
	void setspeed(int s)
	{
		speed=s;
	}
	int getspeed()
	{
		return speed;
	}
}
class protect_mem
{
	public static void main(String[] args)
	{
		bike b=new bike();
		b.setspeed(100);
		System.out.println("speed via derived class : "+b.getspeed());
		vehicle v=new vehicle();
		System.out.println(v.speed);
	}
}