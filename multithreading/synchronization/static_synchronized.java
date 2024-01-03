package multithreading.synchronization;

// as we saw, when a thread calls a synchronized method of the object, it 'locks' the object
// in cae of static synchronized method, it is a lock on class itself.
// so no other thread can call any static synchronized method of that class

class SyncClass
{
    static synchronized void method1()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("method1: "+(i+1));
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

    synchronized void method2()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println("method2: "+(i+1));
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

//will call static synchronized method from this thread
class Thread1 extends Thread
{
    Thread1()
    {
        start();
    }

    public void run()
    {
        //calling
        SyncClass.method1();
    }
}

//will call both synchronized methods from this thread
class Thread2 extends Thread
{

    private SyncClass target;

    Thread2(SyncClass t)
    {
        target = t;
        start();
    }

    public void run()
    {
        target.method2();
        // target.method1();
        // SyncClass.method1();
    }
}

class StaticSynchronizedDemo
{
    public static void main(String[] args)
    {
        //target obj
        SyncClass target = new SyncClass();

        //t1
        Thread1 t1 = new Thread1();

        //t2
        Thread2 t2 = new Thread2(target);

        //t3
        Thread1 t3 = new Thread1();
    }
}