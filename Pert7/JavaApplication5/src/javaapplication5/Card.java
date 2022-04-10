package javaapplication5;

public class Card {
    private int cardBalance;
    private int ticketBalance;
    private int cardNumber;
    public int getCardBalance() {
        return cardBalance;
    }
    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }
    public int getTicketBalance() {
        return ticketBalance;
    }
    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public Card(int number, int card, int ticket){
        cardBalance = card;
        ticketBalance = ticket;
        cardNumber = number;
    }
}
