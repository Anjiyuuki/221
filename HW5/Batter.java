import java.io.*;
import java.util.*;
/**
 * Angie Bui 
 * CSCI 221, Summer 2022, Programming HW 5
 * 
 * This program creates Batter class where 
 * different getter and setters methods can 
 * be used and a toString formatter. Also uses
 * CompareTo relating to the interface.
 * 
 * Certification: This work is entirely my own.
 */
public abstract class Batter extends Player implements Comparable
{
    //private instance variables
    private int YearID;
    private String TeamID;
    private int HomeRuns;
    private int RBI;

    //Constructor
    public Batter(String playerID, String firstName, String lastName, String birthDate,
    String birthLocation, int height, int weight, int year, String team, int homeRuns, int rbi){
        super(playerID, firstName, lastName, birthDate, birthLocation, height, weight);
        YearID = year;
        TeamID = team;
        HomeRuns = homeRuns;
        RBI = rbi;
    }
    
    //ComapreTo -- Comapres the batter RBI and return back 1 or 0 if nothing applies
    public int compareTo (Batter bat1, Batter bat2){
        if(bat1.getRBI() == bat2.getRBI()){ // if RBI is tie
            if(bat1.getHomeRuns() > bat2.getHomeRuns()){ //highest Homerun return 1
                return 1;
            }
        } else if (bat1.getRBI()> bat2.getRBI()){ // else object highest RBI is better
                return 1;
        }else{
            return 0;
        }
        return 0;
    }
    
    //All Setter/Getter Methods
    public void setYearID(int y){
        this.YearID = y;
    }
    public int getYearID(){
        return YearID;
    }

    public void setTeamID(String t){
        this.TeamID = t;
    }
    public String getTeamID(){
        return TeamID;
    }

    public void setHomeRuns( int h){
        this.HomeRuns = h;
    }
    public int getHomeRuns(){
        return HomeRuns;
    }

    public void setRBI(int rbi){
        this.RBI = rbi;
    }
    public int getRBI(){
        return RBI;
    }

    //toString to return player information in this format
    public String toString(){
    return
        "Players information\n"+
        "\nYear: " + YearID   +
        "\nTeam: " + TeamID   +
        "\nHome Runs: " + HomeRuns +
        "\nRBI: " + RBI ; 
    }

}
