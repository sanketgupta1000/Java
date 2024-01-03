package interface_.multiple_inheritance;

//implementing multiple inheritance through interfaces
//inheritance of type

interface i1
{
    void showA();
}

interface i2
{
    void showB();
}

class c implements i1, i2
{
    public void showA()
    {
        System.out.println("showA()");
    }

    public void showB()
    {
        System.out.println("showB()");
    }
}

class Driver
{
    public static void main(String[] args)
    {
        c obj1 = new c();
        obj1.showA();
        obj1.showB();
    }
}