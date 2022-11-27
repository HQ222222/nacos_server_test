package com.hq;

public class hqThread extends Thread {
    private String  name;
    private int  age;

    public hqThread (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        while (age > 0) {
//            age--;
//            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getName()  + name + ":" + age--);
        }

    }


    public static void main(String[] args) {
        Thread h1 = new hqThread("hq1",6);
//        Thread h2 = new hqThread("hq2",22);
//        h1.run();
        new Thread(h1,"线程1").start();

        System.out.println("kaiqil");
        new Thread(h1, "线程2").start();
//        h2.run();
    }

}
