package com.hq;

public class hqThread2  {
    static class hqThread22 implements Runnable {
        private String name;
        private int age;
        public hqThread22 (String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public void run() {
            while (age > 0) {
//                age--;
                System.out.println(Thread.currentThread().getName()  + name + ":" + age--);
            }
        }
    }

    public static void main(String[] args) {
        hqThread22 h1 = new hqThread22("hq",5);
        new Thread(h1, "线程1").start();
        new Thread(h1, "线程2").start();
    }
}
