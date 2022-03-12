/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import static java.lang.Math.*;
import java.util.Random;


public class ComputeMethods {
    public double fToC(double degreesF){
    double degreesC = 0.555*(degreesF-32);
    return degreesC;
    }
    public double Hypotenuse (int a, int b){
    double c= sqrt(pow((double)a,2.0)+pow((double)b,2.0));
    return c;
    }
    public int Roll(){
    Random roll = new Random();
    int result = (roll.nextInt(6)+1)+(roll.nextInt(6)+1);
    return result;
}
}

