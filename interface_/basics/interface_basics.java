package interface_.basics;

//interfaces are similar to abstract class, but they do not (generally) contain any method definition
//because of this characteristic, they can be helpful in multiple inheritance

interface i1
{
    int a = 5;  //always final

    //always public static
    void show();
}

//class which implements i1
class c1 implements i1
{
    public void show()
    {
        System.out.println("show() of c1");
    }
}

class c2 implements i1
{
    public void show()
    {
        System.out.println("show() of c2");
    }
}

class BasicDemo
{
    public static void main(String[] args)
    {
        //just to show that runtime polymorphism can be achieved too, just like abstract classes
        i1 obj = new c1();
        // i1 obj = new c2();
        obj.show();

        //also fine:
        c1 o = new c1();
        o.show();
    }
}

//following things are also possible:
// class c implements i1, i2
// here, i1 and i2 are two interfaces, and c must implement methods of both

//class c extends parent implements i1
// c contains properties of parent, and must implement methods of i1

//interface i extends i1
//interfaces can also have inheritance