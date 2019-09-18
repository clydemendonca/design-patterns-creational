package com.experimental.designpatterns.structural.bridge.wrong;

public class RedCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Red color circle");
    }
}
