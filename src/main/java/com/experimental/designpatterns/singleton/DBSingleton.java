package com.experimental.designpatterns.singleton;

public class DBSingleton {

    private static DBSingleton instance = null;

    private DBSingleton() {
    }

    public static DBSingleton getInstance() {
        // LAZY LOADING
        if(instance == null) {
            instance = new DBSingleton();
        }
        return instance;
    }

}
