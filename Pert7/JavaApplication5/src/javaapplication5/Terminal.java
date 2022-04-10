/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.Scanner;

public class Terminal {

    Prize pencil = new Prize("Pencil", 5, 10);
    Prize doll = new Prize("Doll", 10, 5);
    Prize ice = new Prize("Ice Cream", 15, 3);

    public void convert(Card card) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your card number is: " + card.getCardNumber());
        System.out.print("How many credits do you want to exchange (2 Credits/1$): ");
        int exchange = sc.nextInt() * 2;
        card.setCardBalance(card.getCardBalance() + exchange);
        System.out.println("You now have " + card.getCardBalance() + " credits");
        sc.close();
    }

    public void transferBalance(Card card1, Card card2) {
        Scanner sc = new Scanner(System.in);
        if (card1.getCardBalance() == 0) {
            System.out.println("Sorry you can't transfer anything");
            return;
        }
        System.out.println("How many credits do you want to transfer from " + card1.getCardNumber() + " to " + card2.getCardNumber());
        int exch = sc.nextInt();
        card1.setCardBalance(card1.getCardBalance() + exch);
        card2.setCardBalance(card2.getCardBalance() - exch);
        System.out.println(card1.getCardNumber() + " now has " + card1.getCardBalance() + " credits");
        System.out.println(card2.getCardNumber() + " now has " + card2.getCardBalance() + " credits");
    }

    public void transferTicket(Card card1, Card card2) {
        Scanner sc = new Scanner(System.in);
        if (card1.getTicketBalance() == 0) {
            System.out.println("Sorry you can't transfer anything");
            return;
        }
        System.out.println("How many tickets do you want to transfer from " + card1.getCardNumber() + " to " + card2.getCardNumber() + "?");
        int excT;
        excT = sc.nextInt();
        card1.setTicketBalance(card1.getTicketBalance() + excT);
        card2.setTicketBalance(card2.getTicketBalance() - excT);
        System.out.println(card1.getCardNumber() + " now has " + card1.getTicketBalance() + " tickets");
        System.out.println(card2.getCardNumber() + " now has " + card2.getTicketBalance() + " tickets");
    }

    public void exchange(Card card) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to exchange?");
        System.out.println("1. Pencil (5 tickets)");
        System.out.println("2. Doll (10 tickets)");
        System.out.println("3. Ice Cream (15 tickets)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                if (card.getTicketBalance() < pencil.getTicketRequired()) {
                    System.out.println("Sorry you don't have enough tickets");
                    break;
                }
                if (pencil.getQuantity() == 0) {
                    System.out.println("Sorry it's now out of stock");
                    break;
                }
                pencil.setQuantity(pencil.getQuantity() - 1);
                card.setTicketBalance(card.getTicketBalance() - pencil.getTicketRequired());
                System.out.println("Congratulations you got a pencil");
                System.out.println("You now have " + card.getTicketBalance() + " tickets");
                break;
            case 2:
                if (card.getTicketBalance() < doll.getTicketRequired()) {
                    System.out.println("Sorry you don't have enough tickets");
                    break;
                }
                if (doll.getQuantity() == 0) {
                    System.out.println("Sorry it's now out of stock");
                    break;
                }
                doll.setQuantity(doll.getQuantity() - 1);
                card.setTicketBalance(card.getTicketBalance() - doll.getTicketRequired());
                System.out.println("Congratulations you got a doll");
                System.out.println("You now have " + card.getTicketBalance() + " tickets");
                break;
            case 3:
                if (card.getTicketBalance() < ice.getTicketRequired()) {
                    System.out.println("Sorry you don't have enough tickets");
                    break;
                }
                if (ice.getQuantity() == 0) {
                    System.out.println("Sorry it's now out of stock");
                    break;
                }
                ice.setQuantity(ice.getQuantity() - 1);
                card.setTicketBalance(card.getTicketBalance() - ice.getTicketRequired());
                System.out.println("Congratulations you got an ice cream");
                System.out.println("You now have " + card.getTicketBalance() + " tickets");
                break;
            default:
                System.out.println("Invalid input please try again");
                this.exchange(card);
        }
    }
}
