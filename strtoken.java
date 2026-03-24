//stringtokenizer
import java.util.*;

class strtoken
{
    public static void main(String[] args)
    {
        System.out.println("Using StringTokenizer constructor 1 : ");
        StringTokenizer s1 = new StringTokenizer("javas for java");
        System.out.println(s1.hasMoreTokens());
        System.out.println(s1.nextToken());

        System.out.println();
        System.out.println("Using StringTokenizer constructor 2 : ");
        StringTokenizer s2 = new StringTokenizer("demo : code : String : Tokenizer", ":");
        System.out.println(s2.hasMoreTokens());
        System.out.println(s2.nextToken());

        System.out.println();
        System.out.println("Using StringTokenizer constructor 3 : ");
        StringTokenizer s3 = new StringTokenizer("java for student : code", ":", false);
        System.out.println(s3.hasMoreTokens());
        System.out.println(s3.nextToken());
        System.out.println(s3.countTokens());
        System.out.println(s3.nextElement());
    }
}