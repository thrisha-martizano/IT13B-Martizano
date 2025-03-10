/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Midterm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Act1_Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String name = in.nextLine();

        String reversedName = new StringBuilder(name).reverse().toString();

        System.out.println("Reversed word: " + reversedName);

        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("The word is a palindrome.");
        } else if (name.length() < 3) {
            System.out.println("The word is too short to check.");
        } else {
            System.out.println("The word is not a palindrome.");
        }

    }
}
