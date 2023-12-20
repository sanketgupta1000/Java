// a static nested class cannot access the non-static members of the outer class directly.
// it can access them only through a referece variable
// in this sense, a static nested class is just like any other top level class, packaged in the outer class for logical reasons and/or conevnience

class OuterClass
{
    static int stat = 5;
    int data = 10;

    static class StaticNestedClass
    {
        public void show(OuterClass obj)
        {
            System.out.println("Stat accessed directly = "+stat);
            // gives error
            // System.out.println("Data accessed directly = "+data);

            //now accessing through reference
            System.out.println("Data accessed through a reference = "+obj.data);
        }
    }
}

class Driver
{
    public static void main(String[] args)
    {
        //also, as the class is static, we can instantiate it directly, without need of object of outer class
        OuterClass outerobj = new OuterClass();
        OuterClass.StaticNestedClass nestedobj = new OuterClass.StaticNestedClass();
        nestedobj.show(outerobj);    
    }
}