package com.mycompany.discountchecker;

import java.util.Scanner;

public class DiscountChecker {
    public static void main(String[] args) {
        Scanner scanner;
        
        scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        System.out.println("Enter your membership status:");
        boolean status = scanner.nextBoolean();
        
        discountCheck(age, status);
        scanner.close();
    }

    public static void discountCheck(int age, boolean status) {
        if (age >= 18 || status) {
            System.out.println("Discount is valid.");
        } else {
            System.out.println("Discount is invalid.");
        }
    }
}
