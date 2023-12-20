//inner class can have static members
//the static members of inner class are allocated memory only once
//no matter how we try to access them: from instances of outer class, from instances of inner class, without any instance, it always accesses the same memory

class OuterClass
{
    class InnerClass
    {
        static int stat = 10;

        void changeStat(int s)
        {
            stat = s;
        }

        void show()
        {
            System.out.println("Stat in inner class: "+stat);
        }
    }

    void show()
    {
        System.out.println("Stat in outer class: "+InnerClass.stat);
    }
}

class Driver
{
    public static void main(String[] args)
    {
        OuterClass outerobj1 = new OuterClass();
        outerobj1.show();
        OuterClass.InnerClass innerobj1 = outerobj1.new InnerClass();
        innerobj1.changeStat(15);
        outerobj1.show();
        innerobj1.show();
        OuterClass.InnerClass innerobj2 = outerobj1.new InnerClass();
        innerobj2.show();

        OuterClass outerobj2 = new OuterClass();
        outerobj2.show();

        System.out.println((OuterClass.InnerClass.stat));
    }
}