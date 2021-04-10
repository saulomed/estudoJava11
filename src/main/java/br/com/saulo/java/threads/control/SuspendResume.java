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
public class SuspendResume {
    
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        
        ob1.t.start();
        ob2.t.start();
        
        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resuming thread One");
            ob2.mySuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        
        try {
            System.out.println("Waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        
        System.out.println("Main thread exiting.");
    }
}
