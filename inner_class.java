// An inner class is just like any other member of a class
// it can also take access specifiers like public, private, protected, default
// An inner class can access all the members of the outer class
// Now in order to instantiate an inner class, we need an object of outer class
// Thus, we can say that an instantiate of inner class is attached with an instance of outer class

class OuterClass
{
    private int data;

    OuterClass(int d)
    {
        data = d;
    }

    class InnerClass
    {
        void change(int d)
        {
            data = d;
        }

        void show()
        {
            System.out.println("Data in inner class: "+data);
        }
    }

    void show()
    {
        System.out.println("Data in outer class: "+data);
    }
}

class Driver
{
    public static void main(String[] args)
    {
        OuterClass outerobj1 = new OuterClass(5);
        outerobj1.show();
        OuterClass.InnerClass innerobj1 = outerobj1.new InnerClass();
        innerobj1.change(15);
        outerobj1.show();
        innerobj1.show();
    }
}