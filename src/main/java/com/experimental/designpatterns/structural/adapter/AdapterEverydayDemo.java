package com.experimental.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterEverydayDemo {

    public static void main(String[] args) {

        Integer[] arrayOfInts = new Integer[]{10, 20, 30, 40};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(listOfInts);

    }

}
