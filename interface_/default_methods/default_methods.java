package interface_.default_methods;

//we can have default methods in interfaces, which we dont necessarily need to implement in a class which implements the interface
//but, wont this cause the same problem then? problem of ambiguity if we implement multiple interfaces containing same signature default method?
//we will discuss that later

interface i1
{
    //this is how you define default methods
    default void show()
    {
        System.out.println("Default show method");
    }
}

class c implements i1
{
    //no need to implement show()
}

class Driver
{
    public static void main(String[] args)
    {
        c obj = new c();
        obj.show();
    }
}