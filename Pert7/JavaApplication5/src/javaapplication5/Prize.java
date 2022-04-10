/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Vincent Tanujaya
 */
public class Prize {

    private String prize;
    private int ticketRequired;
    private int quantity;

    public Prize(String name, int ticket, int qty) {
        prize = name;
        ticketRequired = ticket;
        quantity = qty;
    }

    public String getPrize() {
        return prize;
    }

    public int getTicketRequired() {
        return ticketRequired;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public void setTicketRequired(int ticketRequired) {
        this.ticketRequired = ticketRequired;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
