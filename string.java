//java provides 3 classes to create and manipulate strings: String, StringBuilder, StringBuffer
//here, we will explore String class

class Driver
{
    public static void main(String[] args)
    {
        //string objects can be created in two ways:

        //by using a string literal
        String s1 = "Sanket";
        //By using new keyword
        String s2 = new String("Sanket");

        //if we use new keyword, it will always create a new object, and its address is assigned to the reference variable(s2, in this case)
        //if we use literals, JVM first looks into "String consant pool", where all literals are stored. If the literal already exists, it simply returns the address of it, otherwise, creates a new literal in the pool

        String s3 = "Sanket";
        String s4 = new String("Sanket");

        String s5 = new String("Gupta");
        String s6 = "Gupta";

        //verification of concept of string constant pool
        //== compares values of reference variables
        System.out.println(s1==s2);     //false
        System.out.println(s1==s3);     //true
        System.out.println(s2==s4);     //false
        System.out.println(s5==s6);     //false

        //equals method compares strings char by char
        System.out.println(s1.equals(s2));

        //String objects are immutable
        s1.concat(s6);
        System.out.println(s1);     //Sanket, not SanketGupta
        
        //so string manipulation methods return an altered string which can be assigned to other strings
        String name = s1.concat(s6);
        System.out.println(name);       //SanketGupta

        
    }
}