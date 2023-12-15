//initializer block is defined using {}, and is placed in a class
//it is executed before every object creation, no matter which constructor is invoked
//so, its purpose is to contain code common to all constructors

class InitBlockDemo
{
    {
        //do something common to all constructors here
        System.out.println("Inside initializer block");
    }

    InitBlockDemo()
    {
        System.out.println("Default constructor");
    }

    InitBlockDemo(int a)
    {
        System.out.println("Parameterized constructor: "+a);
    }

    public static void main(String[] args)
    {
        InitBlockDemo ibd1 = new InitBlockDemo();
        InitBlockDemo ibd2 = new InitBlockDemo(5);
    }
}