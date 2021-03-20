package br.com.saulo.java.threads.interthread;

public class ProducerConsumer
{
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();

        System.out.println("Press Controll-c to stop");

    }
}
