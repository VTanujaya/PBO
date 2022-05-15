/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soccergame;

import java.util.ArrayList;

public class SoccerGame {

    public static void main(String[] args) {
        ArrayList<Teams> everyone = new ArrayList<>();
        Teams tm1 = new Teams("Karen");
        everyone.add(tm1);
        Teams tm2 = new Teams("Digital");
        everyone.add(tm2);
        Teams tm3 = new Teams("Sky");
        everyone.add(tm3);
        Teams tm4 = new Teams("Fine");
        everyone.add(tm4);
        Scheduler sch = new Scheduler();
        sch.startGame(everyone);
    }

}
