package com.company;

public class Triangle {
        int a;
        int b;
        int c;

        void area() {
            double area = 0;
            double p = ((a + b + c) / 2);
            System.out.println("area of triangle: " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        }
}
