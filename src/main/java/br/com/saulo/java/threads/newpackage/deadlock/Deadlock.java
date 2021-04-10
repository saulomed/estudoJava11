/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saulo.java.threads.newpackage.deadlock;

/**
 *
 * @author saulo
 */
public class Deadlock implements Runnable{
    
    A a = new A();
    B b = new B();
    Thread t;

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this,"RacingThread");
    }
    
    void deadlockStart()
    {
        t.start();
        a.foo(b);
        System.out.println("Back in main thread");
    }
    
    public void run()
    {
        b.bar(a);
        System.out.println("Back in other thread");
    }
    
    
    public static void main(String[] args) {
        Deadlock dl = new Deadlock();
        dl.deadlockStart();
    }
}
