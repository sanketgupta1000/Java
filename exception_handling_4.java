//here we will see try catch to catch exceptions

class TryCatchExample
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }
        //we know  division can generate div by zero exception, hence arithematic exception to be caught
        // catch(ArithmeticException ae)
        // {
        //     System.out.println(ae);
        // }
        //can also use superclass
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("This will be printed, since catching exception, so normal execution after handling");

    }
}

//here also, we have concepts like stack unwinding, and nested try catch just like cpp