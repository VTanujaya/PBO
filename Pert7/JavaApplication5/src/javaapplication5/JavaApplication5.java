package javaapplication5;

public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card cr1 = new Card(0001, 2, 0);
        Card cr2 = new Card(0002,10,0);
        Games gm = new Games();
        Terminal tm = new Terminal();
        gm.swipe(cr1);
        tm.transferBalance(cr1, cr2);
        tm.transferTicket(cr2, cr1);
        tm.exchange(cr2);
        tm.exchange(cr1);
    }

}
