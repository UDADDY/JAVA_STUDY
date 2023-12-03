package org.example;

interface Calcaulate {
    int cal(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        Calcaulate c;
        c = (a, b) -> {
            return a + b;
        };
        System.out.println(c.cal(1, 2));

        c = (a, b) -> {
            return a - b;
        };
        System.out.println(c.cal(10, 5));
    }
}
