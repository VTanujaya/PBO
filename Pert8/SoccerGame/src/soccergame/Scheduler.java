/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccergame;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Vincent Tanujaya
 */
public class Scheduler {

    Game gm = new Game();
    private int tempCounter;

    public void displayStat(ArrayList<Teams> team) {
        for (int i = 0; i < team.size(); i++) {
            System.out.println("Status for Team " + team.get(i).getName());
            System.out.print("Wins: " + team.get(i).getTeamWin());
            System.out.print(", Loses: " + team.get(i).getTeamLose());
            System.out.println(", Ties: " + team.get(i).getTeamTie());
            System.out.print("Points Scored: " + team.get(i).getTeamGoal());
            System.out.println(", Points Allowed: " + team.get(i).getTeamAllowed());
            System.out.println("");
        }
    }

    public void startGame(ArrayList<Teams> team) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        int temp = sc.nextInt();
        int t1 = 0, t2 = 0, t3 = 0, t4 = 0;
        if (tempCounter == 2) {
            System.out.println("Season is Over");
            gm.display();
            gm.displayTemp();
            displayStat(team);
            return;
        }
        if (temp <= 0) {
            System.out.println("Too Cold for a Match");
            tempCounter++;
            startGame(team);
return;
        } else {
            tempCounter = 0;
        }
        while (t1 == t2 || t3 == t4) {
            t1 = rd.nextInt(team.size());
            t2 = rd.nextInt(team.size());
            t3 = rd.nextInt(team.size());
            t4 = rd.nextInt(team.size());
        }
        gm.playGame(temp, team.get(t1), team.get(t2));
        gm.playGame(temp, team.get(t3), team.get(t4));
        startGame(team);
    }
}
