//access specifiers in java are at two levels:
//1. Class level
//2. Member level

//At class level, two modifiers: public (meaning that the class is visible everywhere), and default or no specifier (meaning that the class is visible only in the same package)

//At member level, public, default (both same as above), private (member accessible only in its class), and protected (member accessible in its package, and its sub classes)

package access_specifiers.pkg1;

//this class is visible only in the same package
class DefaultClass
{
    DefaultClass()
    {
        System.out.println("I am DefaultClass()");
    }
}

//this class is visible to the world
//the name of this file must be PublicCLass.java
//this is because only then will jvm easily know where the public class required resides
//also, at most one public class per file
public class PublicClass
{
    //if making class public, then it is logical to make the constructor public too, since we wont be able to make an object of class in other packages otherwise

    public PublicClass()
    {
        System.out.println("I am PublicClass()");
    }
}