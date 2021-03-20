package br.com.saulo.java.threads.sync;

public class Caller implements Runnable
{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme target,String msg) {
        this.msg = msg;
        this.target = target;
        this.t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
