//here, we will understand concepts regarding exception handling in java

//in java, an exception can be of either if two types: checked, or unchecked
//those exceptions from which our system can reasonably recover SHOULD be of checked type
//this is because compiler insists that we handle checked exceptions, and gives compile time error if we don't, so that we never miss handling a checked exception
//those exceptions from which our system cannot recover should be unchecked
//this is because compiler does not generate any error if we don't handle them; anyway jvm will handle them and terminate them, as expected from unrecoverable situations

//here we will see an inbuilt unchecked exception as an example

import java.util.Scanner;

class Unchecked
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers to be divided: ");
        int n1 = scan.nextInt();
        //try to enter 0 for n2
        //the program throws error, we do not handle it, jvm does, and terminates the program
        //this is because in most cases, /0 is such an exception from which it is not possible to recover
        int n2 = scan.nextInt();
        System.out.println(n1/n2);
    }
}