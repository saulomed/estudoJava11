package br.com.saulo.java.threads;

public class NewThread implements Runnable {
    Thread t;
    String name;

    public NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread: "+t);
    }

    public NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println(this.name +": " + t);
    }

    @Override
    public void run() {

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(this.name +": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(this.name+" interrupted");
        }
        System.out.println(this.name+" exiting");
    }
}
