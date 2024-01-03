package multithreading.producer_consumer;

// many a time following situation can arise:
// two threads, working on same data buffer
// producer thread produces some data
// consumer thread comsumes that data
// we want that producer produces only when consumer has consumed previously produced data
// and consumer consumes only when producer has produced that data
// this can't be achieved with synchronized alone, since it gurauntees only that simultaneousl two things will not happen, not the gurauntee that producer,then consumer,then producer and so on
// must use wait()

//common data buffer
class Data
{
    private int data;
    //boolean to help in achieving alternateness
    private boolean is_produced;

    Data()
    {
        //initialize
        data = 0;
        is_produced = false;
    }

    //this method will be called by producer thread
    synchronized void put()
    {
        //first will check if can produce or not
        while(is_produced)
        {
            //already produced, must wait
            try
            {
                //this releases lock
                wait();
            }
            catch
            (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        //consumed
        //can produce
        data++;
        is_produced = true;
        System.out.println("Put: "+data);
        //now need to notify consumer who might be waiting
        notify();
    }

    //this will be called by consumer
    synchronized void get()
    {
        //checking if already consumed before
        while(!is_produced)
        {
            //release lock, so producer can produce
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        //can consume
        is_produced = false;
        System.out.println("Got: "+data);
        //now notifying producer, who might be waiting
        notify();
    }

}

class Producer extends Thread
{
    private Data buff;

    Producer(Data b)
    {
        buff = b;
        start();
    }

    public void run()
    {
        //will continuously call put
        while(true)
        {
            buff.put();
        }
    }
}

class Consumer extends Thread
{
    private Data buff;

    Consumer(Data b)
    {
        buff = b;
        start();
    }

    public void run()
    {
        //will continuously call get
        while(true)
        {
            buff.get();
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Data buffer = new Data();
        Producer p1 = new Producer(buffer);
        Consumer c1 = new Consumer(buffer);
    }
}