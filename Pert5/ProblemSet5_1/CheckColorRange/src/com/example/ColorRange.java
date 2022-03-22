/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a color code:");
    double spectrum = sc.nextDouble();
    if (spectrum>=380.0&&spectrum<=450.0){
        System.out.println("The Color is Violet");
        }
    else if (spectrum>450.0&&spectrum<=495.0){
        System.out.println("The Color is Blue");
        }
    else if (spectrum>495.0&&spectrum<=570.0){
        System.out.println("The Color is Green");
        }
    else if (spectrum>570.0&&spectrum<=590.0){
        System.out.println("The Color is Yellow");
        }
    else if (spectrum>590.0&&spectrum<=520.0){
        System.out.println("The Color is Orange");
        }
    else if (spectrum>620.0&&spectrum<=750.0){
        System.out.println("The Color is Red");
        }
    else{
        System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
