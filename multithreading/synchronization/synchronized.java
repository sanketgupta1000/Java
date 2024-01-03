package multithreading.synchronization;

// when two threads work on same data 'buffer', we would like to have some synchronization.
// for eg: when a thread is accessing something of that buffer, we would not like other thread to do so
// simply speaking, we want mutually exclusive accessing of data in threads

// synchronized keyword is there to help us
// if a thread A is accessing a synchronized method of an object, it is said to have acquired lock on the object
// no other thread can access any synchronized method of the same object at that time, it will have to wait
// however, if a thread B wants to access synchronized method on any other object, it is allowed

class SyncClass
{
    //will call this method from three different threads on same object, as well as different ones
    synchronized void method(String msg)
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
        target.method(msg);
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