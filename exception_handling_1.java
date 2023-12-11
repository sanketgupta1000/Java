//in java, if an exception occurs, either it needs to be handled, or jvm will handle it, and terminate the program
//here, the main method throws an Arithematic Exception, whihc is not handled by the code
//so program terminates

class ExcpExample
{
    public static void main(String[] args)
    {
        System.out.println(8/0);
        System.out.println("This will not be printed");
    }
}