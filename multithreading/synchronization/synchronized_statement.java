package multithreading.synchronization;

//we can explicitly lock an object using synchronized statement

class SyncClass
{

    void method(String msg)
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println(msg+": "+(i+1));
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

class Thread1 extends Thread
{
    //target object containing a synchronized method
    SyncClass target;
    String msg;

    Thread1(SyncClass t, String m)
    {
        //setting target
        target = t;
        //msg
        msg = m;
        //start the thread
        start();
    }

    public void run()
    {
        //getting lock on target
        synchronized(target)
        {
            //here target is locked
            target.method(msg);
        }
    }
}

class SynchronizedDemo
{
    public static void main(String[] args)
    {
        //creating object of SyncClass
        SyncClass target1 = new SyncClass();

        //three threads
        Thread1 t1 = new Thread1(target1, "t1");
        //since same targets, whichever thread gets lock first, it will run the method() of target of its completion, will then, other thread will have to wait
        Thread1 t2 = new Thread1(target1, "t2");
        Thread1 t3 = new Thread1(target1, "t3");

        // comment above two and uncomment below two, interleaving will be seen
        // Thread1 t2 = new Thread1(new SyncClass(), "t2");
        // Thread1 t3 = new Thread1(new SyncClass(), "t3");
    }
}