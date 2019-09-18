package com.experimental.designpatterns.structural.bridge.right;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}
