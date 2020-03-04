package com.experimental.designpatterns.structural.bridge.shape.wrong;

public class RedCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Red color circle");
    }
}
