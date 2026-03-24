//string class library
public class strlibrary
{
	public static void main(String[] args)
	{
		String mystr="hello";
		char result=mystr.charAt(0);
		System.out.println(result);
		String firstnm="dharvi";
		String lastnm="dudhat";
		System.out.println(firstnm.concat(lastnm));
		String mystr1="hello";
		String mystr2="hello";
		String mystr3="another string";
		System.out.println(mystr1.equals(mystr2));
		System.out.println(mystr1.equals(mystr3));
		//String mystr="hello";
		System.out.println(mystr.contains("hel"));
		System.out.println(mystr.contains("e"));
		System.out.println(mystr.contains("hi"));
		String mystr4="hello";
		System.out.println(mystr4.endsWith("hel"));
		System.out.println(mystr4.endsWith("llo"));
		System.out.println(mystr4.endsWith("o"));
	}
}
