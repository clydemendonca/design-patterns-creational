package com.experimental.designpatterns.structural.bridge.shape.right;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    public void applyColor() {
        color.applyColor();
    }
}
