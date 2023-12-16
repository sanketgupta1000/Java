package pkg_example.pkg1;
//here we will try to use MyClass of file1.java

//just make sure that while compiling, you use all those files with javac that contain the classes you are using

class Driver
{
    public static void main(String[] args)
    {
        MyClass mc = new MyClass();
    }
}