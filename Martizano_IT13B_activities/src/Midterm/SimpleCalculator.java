package Midterm;

import java.util.Scanner;

public class SimpleCalculator {

    public static int addnum(int a, int b) {
        return a + b;
    }

    public static int subnum(int a, int b) {
        return a - b;
    }

    public static int multnum(int a, int b) {
        return a * b;
    }

    public static double divnum(double a, double b) {
        return a / b;
    }

    public static double percentnum(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();

        int t = 25, m = 19;
        System.out.println("The addition: " + addnum(t, m));
        System.out.println("The subtraction: " + subnum(t, m));
        System.out.println("The multiplication: " + multnum(t, m));
        System.out.println("The division: " + divnum(t, m));
        System.out.println("The percentage: " + percentnum(t, m));
    }

}
