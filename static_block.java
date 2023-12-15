//in java, blocks are defined with {}
//static blocks are those blocks which are preceeded by static keyword
//for each class, static blocks are executed only once, in top-down manner, only when class is loaded
//static blocks are used to initialize static class variables, create db conncection, etc.

class StaticBlockDemo
{
    StaticBlockDemo()
    {
        System.out.println("Inside StaticBlockDemo()");
    }

    static
    {
        //initialize static vars here
        System.out.println("Inside StaticBlockDemo static block-1");
    }

    static
    {
        //initialize static vars here
        System.out.println("Inside StaticBlockDemo static block-2");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        System.out.println("Inside psvm()");
        StaticBlockDemo sbd1 = new StaticBlockDemo();
        StaticBlockDemo sbd2 = new StaticBlockDemo();
    }

    static
    {
        System.out.println("Inside Driver static block");
    }
}