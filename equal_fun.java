//universal class equal()
class equal_fun
{
    String title;

    equal_fun(String title)
    {
        this.title = title;
    }

    public boolean equals(Object obj)
    {
        equal_fun e = (equal_fun) obj;
        return this.title.equals(e.title);
    }

    public static void main(String[] args)
    {
        equal_fun e1 = new equal_fun("java");
        equal_fun e2 = new equal_fun("java");
        System.out.println(e1.equals(e2));
    }
}