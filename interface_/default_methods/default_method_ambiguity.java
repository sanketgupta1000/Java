package interface_.default_methods;

//will address the ambiguity problem here

interface i1
{
    default void show()
    {
        System.out.println("Default show of i1");
    }
}

interface i2
{
    default void show()
    {
        System.out.println("Default show of i2");
    }
}

class c implements i1, i2
{
    //must override show, else compile time error
    public void show()
    {
        //can call show of parent like this:
        i1.super.show();
        i2.super.show();
        System.out.println("show() of c");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        c obj = new c();
        obj.show();
    }
}