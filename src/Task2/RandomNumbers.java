package Task2;

import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {

        int a = 4;
        int b = 20;
        int c = 0;
        int d = 92;
        System.out.println( a);
        System.out.println( b);
        System.out.println( c);
        System.out.println( d);

        int maxNumber = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Максимальное число: " + maxNumber);
    }
}
