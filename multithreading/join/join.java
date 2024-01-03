package multithreading.join;

//better and more logical way of waiting till a thread completes execution

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

class JoinDemo
{
    public static void main(String[] args)
    {
        MyThread mt = new MyThread();

        System.out.println("This may be printed anytime");

        try {
            mt.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Printed last");
    }
}