//example of simple stack unwinding

class UnwindDemo
{
    static void procedure(boolean shouldThrow) throws Exception
    {
        try
        {
            if(shouldThrow)
            {
                //an exception thrown here
                throw new Exception("Exception thrown in procedure()");
            }
        }
        finally
        {
            //free some resources like file handlers, connection objects, other things
            //garbage collector will handle variables
            System.out.println("Finally of procedure()"); 
        }
        System.out.println("procedure()");
    }

    public static void main(String[] args)
    {
        try
        {
            procedure(true);
            // procedure(false);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally of main()");
        }
        System.out.println("main()");
    }
}