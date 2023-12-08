//a sample program of java
//to understand structure of a java program and concepts in it

//jvm will call main method upon execution of bytecode
//it will do so without creating any object
//so our main method must be public, and static

class Sample
{

    //instance variables/data members
    int num;

    //constructor
    Sample()
    {
        num = 10;
    }

    //method
    void show()
    {
        System.out.println(num);
    }
    
    public static void main(String[] args)
    {
        //must create an object here
        //since jvm will call this without creation of any object
        Sample obj = new Sample();
        obj.show();
    }

}