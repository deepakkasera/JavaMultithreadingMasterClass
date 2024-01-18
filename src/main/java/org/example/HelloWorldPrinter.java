package org.example;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello Wolrd ! " + Thread.currentThread().getName());
    }
}
