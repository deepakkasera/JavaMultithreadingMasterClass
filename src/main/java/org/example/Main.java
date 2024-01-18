package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! " + Thread.currentThread().getName());

        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
        Thread thread1 = new Thread(helloWorldPrinter);
        Thread thread2 = new Thread(helloWorldPrinter);
        Thread thread3 = new Thread(helloWorldPrinter);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}