package br.com.saulo.java.threads.interthread;

public class Consumer implements Runnable
{
    Queue q;
    Thread t;

    public Consumer(Queue q) {
        this.q = q;
        t = new Thread(this, "Consumer");
    }

    @Override
    public void run() {
        int i = 0;
        while (i++ <50)
        {
            q.get();
        }
    }
}
