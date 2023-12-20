//another way is to implement runnable interface

class MyThread implements Runnable
{
    //must create a thread
    private Thread t;

    MyThread()
    {
        //calling constructor of Thread
        t = new Thread(this, "My Thread");
        //telling jvm to use this thread
        t.start();
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
                Thread.sleep(500);
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