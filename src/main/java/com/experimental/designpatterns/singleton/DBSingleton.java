package com.experimental.designpatterns.singleton;

public class DBSingleton {

    private static volatile DBSingleton instance = null;

    private DBSingleton() {
        if(instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DBSingleton getInstance() {
        // LAZY LOADING
        if(instance == null) {
            synchronized (DBSingleton.class) {
                if(instance == null) {
                    instance = new DBSingleton();
                }
            }
        }
        return instance;
    }

}
