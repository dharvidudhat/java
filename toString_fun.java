//universal class-toString()
class toString_fun
{
		String name="dharvi";
		int age=18;
		public String toString()
		{
			return "student name : "+name+"  age : "+age;
		}
		public static void main(String[] args)
		{
			toString_fun obj=new toString_fun();
			System.out.println(obj.toString());
		}
}