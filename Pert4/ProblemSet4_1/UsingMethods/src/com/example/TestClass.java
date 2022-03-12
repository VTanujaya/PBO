/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {
        //Create an instance of ComputeMethods, 
        ComputeMethods results = new ComputeMethods();
        //invoke the 3 methods and dispay their results
        double degreesC = results.fToC(72.0);
        double c = results.Hypotenuse(5, 4);
        int dice = results.Roll();
        System.out.println("Temp in celcius is "+degreesC);
        System.out.println("Hypotenuse is "+c);
        System.out.println("The sum of the dice value is "+dice);
    }
}
