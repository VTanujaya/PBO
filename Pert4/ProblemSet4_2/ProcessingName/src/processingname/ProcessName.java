/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingname;

import java.util.Scanner;


public class ProcessName {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = console.next();
        String lastName = console.next();
        System.out.println(firstName.length());
        System.out.println("Your name is: "+lastName+", "+firstName.charAt(0)+".");
        // your code goes here
        
        
    }
}