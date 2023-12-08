//In java, everything is call by value
//Here, we explore call by value of primitive data types

class CallByVal
{
    static void changeInt(int a)
    {
        //changes the local copy only
        a = 10;
    }
}

class Driver
{
    public static void main(String[] args)
    {
        int x = 100;
        System.out.println(x);
        //now calling changeInt()
        CallByVal.changeInt(x);
        System.out.println(x);
    }
}