package com.experimental.designpatterns.creational.singleton;

public class EverydaySingletonExample {

    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if(anotherInstance == singletonRuntime) {
            System.out.println("They're the same instance");
        }
    }

}
