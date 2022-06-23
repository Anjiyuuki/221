
/**
 * Angie Bui 
 * CSCI 221, Summer 2022, Programming HW 5
 * 
 * This program creates Pitcher class where 
 * different getter and setters methods can 
 * be used and a toString formatter. Also uses
 * CompareTo relating to the interface.
 * 
 * Certification: This work is entirely my own.
 */
public abstract class Pitcher extends Player implements Comparable
{
    //Private instance variables
    private int YearID;
    private String TeamID;
    private int Wins;
    private int Loses;
    private double ERA;
    
    // Constructor
    public Pitcher(String playerID, String firstName, String lastName, String birthDate,
    String birthLocation, int height, int weight, int year, String team, int wins, int loses,
    double ear){
        super(playerID, firstName, lastName, birthDate, birthLocation, height, weight);
        YearID = year;
        TeamID = team;
        Wins = wins;
        Loses = loses;
        ERA = ear;
    }
    
    //CompareTo -- if win - lost is tie ojact lowest ERA is better
    //else object highest win-losses is better 
    // will return 1 if non is true then it will return 0
    public int compareTo(Pitcher pit1, Pitcher pit2){
        if(pit1.getWins() - pit1.getLoses() == 0){
            if (pit1.getERA() < pit2.getERA()){
                return 1;
            }
        } else if (pit1.getWins()-pit1.getLoses() > pit2.getWins()- pit2.getLoses()){
            return 1;
        }else{
            return 0;
        }
        return 0;
    }

    // All the Setter and Getter Methods
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
    
    public void setWins(int w){
        this.Wins = w;
    }
    public int getWins(){
        return Wins;
    }
    
    public void setLoses(int l){
        this.Loses = l;
    }
    public int getLoses(){
        return Loses;
    }
    
    public void setERA(double era){
        this.ERA = era;
    }
    public double getERA(){
        return ERA;
    }
    
    //toString to return player information in this format
    public String toString(){
    return
        "Players information\n"+
        "\nYear: " + YearID   +
        "\nTeam: " + TeamID   +
        "\nWins: " + Wins +
        "\nLoses: " + Loses +
        "\nERA: "+ ERA;
    }
}
