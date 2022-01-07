package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println(rectangle.display());
        System.out.println("Area= " + rectangle.area());
        System.out.println("Perimeter= " + rectangle.perimeter());
    }
}
