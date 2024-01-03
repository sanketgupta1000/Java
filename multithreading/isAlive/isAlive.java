package multithreading.isAlive;

// isAlive() method of Thread class return boolean depending on if the thread is running or not
// it is useful when sometimes we want to proceed a thread ahead only after the completion some other thread

class MyThread extends Thread
{
    MyThread()
    {
        //start the thread
        start();
    }

    public void run()
    {
        for(int i = 0; i<5; i++)
        {
            System.out.println(i+1);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class IsAliveDemo
{
    public static void main(String[] args)
    {
        //creating and starting thread
        MyThread mt = new MyThread();

        System.out.println("This may be printed any time");
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("This may be printed any time");

        //check if mt is alive. If true, do not proceed ahead
        while(mt.isAlive());

        System.out.println("This will be printed only after MyThread object finishes execution");
    }
}