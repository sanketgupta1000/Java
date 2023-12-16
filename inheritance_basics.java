//in java, except multiple inheritance, all other types of inheritance are there
//hybrid inheritance is also there, but without multiple inheritance

class Parent
{
    int a;

    Parent()
    {
        a = 10;
    }

    void showA()
    {
        System.out.println("a = "+a);
    }
}

class Child extends Parent
{
    int b;

    Child()
    {
        b = 5;
    }

    void showB()
    {
        System.out.println("b = "+b);
    }
}

class Driver
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.showA();
        c.showB();
    }
}