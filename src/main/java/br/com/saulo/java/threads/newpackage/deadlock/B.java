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
public class B {
    
    synchronized void bar(A a)
    {
        String name = Thread.currentThread().getName();
        
        System.out.println(name +" entered B.bar");
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B Interrupted");
        }
        
        System.out.println(name + " truing to call A.last");
        a.last();
    }
    
    synchronized void last()
    {
        System.out.println("Inside B.last");
    }
    
}
