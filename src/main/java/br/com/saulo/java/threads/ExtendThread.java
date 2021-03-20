package br.com.saulo.java.threads;

public class ExtendThread
{
    public static void main(String[] args) {
        ExtNewThread nt = new ExtNewThread();
        nt.start();

        try {
            for (int n = 5; n > 0; n--)
            {
                System.out.println("Main Thread: "+n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread exiting");
    }
}
