//to achieve multithreading in java, we need to create a new thread and tell jvm to use it.
//jvm then runs the code of that thread whenever it finds suitable
//so we can see that a thread has an important thing associated with it: the code of it!
//that is why Thread is a class in java
//to create a new thread, we need to create its object
//now, if this is the case, where to write code related to that thread?
//The answer to this lies in the concept that different thread will have different codes, and still, jvm has to know to execute them
//this means, we would be inheriting Thread and overriding a method called run() which jvm will call through runtime polymorphism

class MyThread extends Thread
{
    MyThread()
    {
        //calling constructor of Thread
        super("My thread");
        //telling jvm to use this thread
        start();
    }

    //method that jvm will call through runtime polymorphism
    public void run()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("My thread: "+i);
            //putting current thread to sleep, so as to see switching
            try
            {
                sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}

class MultiThreadingDemo1
{
    public static void main(String[] args)
    {
        //execution of main() starts in Main thread
        //first lets create our another thread
        new MyThread();

        for(int i = 0; i<5; i++)
        {
            System.out.println("Main thread: "+i);
            //putting current thread to sleep, so as to see switching
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}