//here, we take an example of checked exception via an inbuilt one

class Checked
{
    public static void main(String[] args) throws InterruptedException
    {
        //this method has the ability to throw a checked exception, an InterruptedException
        //if we do not handle it, compiler gives error 
        //two ways to handle: catch it, or declare it to be thrown
        Thread.sleep(1000);
        
    }
}