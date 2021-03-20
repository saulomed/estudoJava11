package br.com.saulo.java.threads.interthread;

public class Producer  implements Runnable
{
    Queue q;
    Thread t;

    public Producer(Queue q) {
        this.q = q;
        t = new Thread(this,"Producer");
    }

    @Override
    public void run() {

        int i = 0;
        while (i++ < 50) {
            q.put(i++);
        }
    }
}
