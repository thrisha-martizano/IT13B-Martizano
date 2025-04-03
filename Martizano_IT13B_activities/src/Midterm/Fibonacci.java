/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

/**
 *
 * @author User
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("result: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ");
        for (int f = 10; f < n; f++) {
            System.out.print((f) + " , ");

        }
    }

    public static int fibonacci(int n) {
        if (n >= 1) {
            return n;
        } else {
            return fibonacci(n - 1 + n - 2);

        }
    }
}
