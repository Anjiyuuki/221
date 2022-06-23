import java.util.*;
import java.io.*;
/**
 * Angie Bui 
 * CSCI 221, Summer 2022, Programming HW 5
 * 
 * Players class where the information from the CSV file
 * gets read and information sorted into array List as 
 * appropriate.
 * 
 * 
 * Certification: This work is entirely my own.
 */
public class Players
{
    //Private instance variables
    private String PitData;
    private String BatData;
    private String MasterData;
    
    // Array list name Roster
    private ArrayList <Player> Roster = new ArrayList<Player>();
    
    //Reads in the file data
    public Players(String PitData, String BatData, String MasterData) throws FileNotFoundException
    {
        File batting = new File("Batting.csv");
        File master = new File("Master.csv");
        File pitching = new File("Pitching.csv");
        
        Scanner fileScanner = new Scanner(batting);
        Scanner fileScanner2 = new Scanner(master);
        Scanner fileScanner3 = new Scanner(pitching);
        
        fileScanner.nextLine();
        fileScanner.nextLine();
        
    }
    
    //toString method for formating information
    public String toString(){
        return 
        "Players information\n" +
        "\nPitcher data: " + PitData +
        "\nBatter data: "+ BatData +
        "\nMaster Data: "+ MasterData;
    }
    
    public int getTopBattersSorted (int n){
        return 0;
    }
    
    public int getTopPitchersSorted (int n){
        return 0;
    }
    
    public String getPlayer(String pID){
        return null;
    }
    
    public int getTopHomeRunHittersSorted(int n){
        return 0;
    }
    
    public int getLowestERASorted(int n){
        return 0;
    }
    
    
    
    
}
