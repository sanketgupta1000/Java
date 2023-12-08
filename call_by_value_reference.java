//whenever we create an object in java, we are actually doing two things:
//1. allocating a memory for the object
//2. creating a 'reference variable' which (points to)/(contains) the memory address
//so when we do: MyClass obj = new MyClass();
//obj is a reference variable which stores actual address of the object
//similarly, array variables are reference variables only

//so if call by value applies to references, then the addresses are copied
//meaning that methods can indeed change the data of object

class CallByVal
{
    static void changeObj(MyClass obj)
    {
        obj.i = 5;
    }

    static void changeArr(int arr[])
    {
        arr[0] = 10;
    }
}

class MyClass
{
    int i;

    MyClass()
    {
        i = 10;
    }

    void show()
    {
        System.out.println(i);
    }
}

class Driver
{
    public static void main(String[] args)
    {
        MyClass obj1 = new MyClass();
        obj1.show();
        CallByVal.changeObj(obj1);
        obj1.show();

        //checking for array
        int[] arr = {1, 2, 3, 4, 5};
        CallByVal.changeArr(arr);
        System.out.println(arr[0]);

    }
}