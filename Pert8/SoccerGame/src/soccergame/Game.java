/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccergame;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Vincent Tanujaya
 */
public class Game {

    Random rd = new Random();
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    private int temperature;
    private ArrayList<Game> record = new ArrayList<>();

    public Game(String home, String away, int in, int out, int temp) {
        homeTeam = home;
        awayTeam = away;
        homeScore = in;
        awayScore = out;
        temperature = temp;
    }

    public Game() {

    }

    public void playGame(int temp, Teams tm1, Teams tm2) {
        homeScore = rd.nextInt((temp / 10)+1);
        awayScore = rd.nextInt((temp / 10)+1);
        tm1.setTeamGoal(tm1.getTeamGoal() + homeScore);
        tm2.setTeamGoal(tm2.getTeamGoal() + awayScore);
        tm1.setTeamAllowed(tm1.getTeamAllowed() + awayScore);
        tm2.setTeamAllowed(tm2.getTeamAllowed() + homeScore);
        Game gm = new Game(tm1.getName(), tm2.getName(), homeScore, awayScore, temp);
        record.add(gm);
        if (homeScore > awayScore) {
            tm1.setTeamWin(tm1.getTeamWin() + 1);
            tm2.setTeamLose(tm2.getTeamLose() + 1);
        } else if (homeScore < awayScore) {
            tm2.setTeamWin(tm2.getTeamWin() + 1);
            tm1.setTeamLose(tm1.getTeamLose() + 1);
        } else if (homeScore == awayScore) {
            tm1.setTeamTie(tm1.getTeamTie() + 1);
            tm2.setTeamTie(tm2.getTeamTie() + 1);
        }
    }

    public void display() {
        for (int i = 0; i < record.size(); i++) {
            System.out.println();
            System.out.println("Game #" + (i + 1));
            System.out.println("Temperature: " + record.get(i).temperature);
            System.out.print("Home Team: " + record.get(i).homeTeam);
            System.out.println(", " + record.get(i).homeScore);
            System.out.print("Away Team: " + record.get(i).awayTeam);
            System.out.println(", " + record.get(i).awayScore);
        }
    }

    public void displayTemp() {
        int temp = 0;
        int maxTemp = 0;
        for (Game gm : record) {
            temp += gm.temperature;
            if (gm.temperature > maxTemp) {
                maxTemp = gm.temperature;
            }
        }
        double averageTemp = temp / record.size();
        System.out.println();
        System.out.println("Average Temperature: "+averageTemp);
        System.out.println("Max Temperature: "+maxTemp);
    }
}
