//in java, packages are to encapsulate classes, just like namespaces in C++
//a directory in our project represents a package, and a subdirectory represents a subpackage

//this is how you specify a package
//directory_name.sub_directory_name.sub_sub_directory_name...
package pkg_example.pkg1;

//default access modifier with class MyClass
//so it is visible in the same package only
class MyClass
{
    MyClass()
    {
        System.out.println("MyClass()");
    }
}