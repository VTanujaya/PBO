/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 12345678;
        System.out.println("Input PIN: ");
        int input = sc.nextInt();
        while (input != pin){
            System.out.println("Wrong PIN! Please try again!");
            input = sc.nextInt();
        }
        System.out.println("Welcome!");
    }
}
