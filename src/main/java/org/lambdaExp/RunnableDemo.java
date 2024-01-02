package org.lambdaExp;
//Traditional way of creating threads

class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("run() method running...");
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        //creating thread using traditional way
        Thread t1 = new Thread(new MyThread());
        t1.start();

        //creating thread using lambda expresssion
        Runnable runnable = ()->System.out.println("run() method running... using lambda");
        Thread t2 = new Thread(runnable);
        t2.start();

    }

}
