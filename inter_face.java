//interface
interface printable
{
	void print();
}
class printer impliments printable
{
	public void print()
	{
		System.out.println("hello,my name is dharvi.");
	}
}
class inter_face
{
	public static void main(String[] args)
	{
		printer p=new printer();
		p.print();
	}
}