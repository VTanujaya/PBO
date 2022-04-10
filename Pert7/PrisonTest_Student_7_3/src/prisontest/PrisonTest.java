package prisontest;

public class PrisonTest {
    public static void main(String[] args) {
        Prisoner pr = new Prisoner("Ucok",1.1,10);
        Cell cl = new Cell("1st Cell", false, 1234);
        pr.output(true);
        cl.setDoor();
    } 
}
