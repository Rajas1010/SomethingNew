public class  AnonymousSubclass 
{
    public static void main(String[] args) 
	{
        new AnonymousSubclass().foo("Hello");
    }
    void foo(String s) 
	{
        System.out.println(s);
    }
}
