/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemset3;

import javax.swing.JOptionPane;

/**
 *
 * @author Vincent Tanujaya
 */
public class ProblemSet3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hello there, What's your name?");
        String dateOfBirth = JOptionPane.showInputDialog("On what day were you born?");
        String monthOfBirth = JOptionPane.showInputDialog("On what month were you born?");
        String yearOfBirth = JOptionPane.showInputDialog("On what year were you born?");
        String job =  JOptionPane.showInputDialog("May I know your job?");
        int wage = Integer.parseInt(JOptionPane.showInputDialog("That's nice, how much do you earn monthly?"));
        int saving = Integer.parseInt(JOptionPane.showInputDialog("I see, How much do you have here right now?"));
        int store = Integer.parseInt(JOptionPane.showInputDialog("Then, How much more do you want to store?"));
        double interest = Double.parseDouble(JOptionPane.showInputDialog("How many is the interest you want?"));
        int totalWage = wage * 12;
        double totalInterest = (saving+store)*(1+interest)*12;
        String message = JOptionPane.showInputDialog("Do you have any other messages?");
        JOptionPane.showMessageDialog(null,"Okay then " + name + " You were born on "+ dateOfBirth +" "+monthOfBirth+" "+yearOfBirth+".\n And you're now working as "+ job+" with a monthly wage of "+wage+" so in a year you will earn around "+totalWage+". \n Right now you have "+saving+" in your account and you're adding "+store+" to your account. with an interest of "+interest+" so in a year your savings will be "+totalInterest+"\n and your message is "+message);
    }
    
}
