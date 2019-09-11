package com.experimental.designpatterns.builder;

public class BuilderEverydayDemo {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append ");
        builder.append("almost anything to a string.");

        System.out.println(builder.toString());

    }

}
