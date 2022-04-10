/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.Random;
public class Games {
    Random rand = new Random();
    private final int playCost = 3;
    private int ticketWon;
    public void swipe(Card card){
        if (card.getTicketBalance()<playCost) {
            System.out.println("Sorry you don't have enough credits anything");
            return;
        }
        int remainingCredit = card.getCardBalance() - playCost;
        card.setCardBalance(remainingCredit);
        System.out.println("Welcome to the Win Random Ticket Game");
        ticketWon = rand.nextInt(46)+5;
        System.out.println("Congratulations you won "+ ticketWon+" tickets");
        card.setTicketBalance(card.getTicketBalance()+ticketWon);
    }
}
