package prisontest;
import java.util.Scanner;
public class Prisoner {

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the sentence
     */
    public int getSentence() {
        return sentence;
    }

    /**
     * @param sentence the sentence to set
     */
    public void setSentence(int sentence) {
        this.sentence = sentence;
    }
    //Fields 
    private String name;
    private double height;
    private int sentence;
    //Constructor   
    Cell cl = new Cell("1st Cell", false, 1234);
    public Prisoner(String a, double b, int c){
        name = a;
        height = b;
        sentence= c;
    }
    public void output(){
        System.out.println("Prisoner: "+ getName());
        System.out.println("Height: "+ getHeight());
        System.out.println("Sentence: "+getSentence());
        System.out.println("Cell Name: "+cl.getCell());
    }
    public void output(boolean yes){
        output();
        think();
    }
    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public String getName(){
    return name;
    }
    public double getHeight(){
        return height;
    }
}
