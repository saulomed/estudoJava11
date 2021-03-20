package br.com.saulo.java.threads;

public class MultiThreadDemo
{


    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is alive: "+nt1.t.isAlive());
        System.out.println("Thread Two is alive: "+nt2.t.isAlive());
        System.out.println("Thread Three is alive: "+nt3.t.isAlive());

        try {
//            Thread.sleep(10000);
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Thread One is alive: "+nt1.t.isAlive());
        System.out.println("Thread Two is alive: "+nt2.t.isAlive());
        System.out.println("Thread Three is alive: "+nt3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
