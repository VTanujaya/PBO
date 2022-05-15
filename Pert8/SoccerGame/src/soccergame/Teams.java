/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccergame;

public class Teams {

    private String name;
    private int teamWin;
    private int teamLose;
    private int teamTie;
    private int teamGoal;
    private int teamAllowed;

    public Teams(String team) {
        name = team;
    }
    public Teams() {
        
    }
    public String getName() {
        return name;
    }

    public int getTeamWin() {
        return teamWin;
    }

    public void setTeamWin(int teamWin) {
        this.teamWin = teamWin;
    }

    public int getTeamLose() {
        return teamLose;
    }

    public void setTeamLose(int teamLose) {
        this.teamLose = teamLose;
    }

    public int getTeamTie() {
        return teamTie;
    }

    public void setTeamTie(int teamTie) {
        this.teamTie = teamTie;
    }

    public int getTeamGoal() {
        return teamGoal;
    }

    public void setTeamGoal(int teamGoal) {
        this.teamGoal = teamGoal;
    }

    public int getTeamAllowed() {
        return teamAllowed;
    }

    public void setTeamAllowed(int teamAllowed) {
        this.teamAllowed = teamAllowed;
    }

}
