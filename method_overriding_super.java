class Parent
{
    private int a;
    
    Parent(int i)
    {
        a = i;
    }

    void show()
    {
        System.out.println("a = "+a);
    }
}

class Child extends Parent
{
    private int b;

    Child(int i, int j)
    {
        //calling parent class constructor with super()
        //if dont use super(), compiler will try to call no arg constructor of parent class, which must exist, otherwise error
        super(i);
        b = j;
    }

    //this method overrides parent's show()
    //can call parent's show using super.show()
    void show()
    {
        super.show();
        System.out.println("b = "+b);
    }
}

class Driver
{
    public static void main(String[] args)
    {
        Child c = new Child(12, 16);
        c.show();
    }
}