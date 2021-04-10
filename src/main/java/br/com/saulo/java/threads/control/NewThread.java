/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saulo.java.threads.control;

/**
 *
 * @author saulo
 */
public class NewThread implements Runnable
{
    String name;
    Thread t;
    boolean suspendFlag;

    public NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: "+t);
        suspendFlag = false;
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": "+i);
                Thread.sleep(200);
                synchronized(this)
                {
                    while(suspendFlag)
                    {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name +" interrupted");
        }
        System.out.println(name + "exiting");
    }
    
    synchronized void mySuspend()
    {
        suspendFlag = true;
    }
    
    
    synchronized void myResume()
    {
        suspendFlag = false;
        notify();
    }
    
    
}
