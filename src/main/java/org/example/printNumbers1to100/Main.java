package org.example.printNumbers1to100;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World " + Thread.currentThread().getName());


        //Print 100 numbers, each from a different thread.
//        NumberPrinter numberPrinter = new NumberPrinter(1);
//        NumberPrinter numberPrinter = new NumberPrinter(2);
//        NumberPrinter numberPrinter = new NumberPrinter(3);

        for (int i = 1; i <= 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread =  new Thread(numberPrinter);
            thread.start();
        }
    }
}
