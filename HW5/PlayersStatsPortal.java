import java.util.*;
import java.io.*;
/**
 * Angie Bui 
 * CSCI 221, Summer 2022, Programming HW 5
 * 
 * This program creates a menu to run all the methods.
 * User can choose any information option they would
 * like to get. 
 * 
 * Certification: This work is entirely my own.
 */
public class PlayersStatsPortal
{
    //Menu to use the program
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        String word;
        
        do
        {
            System.out.println();
            //Menu options for the user to pick from 
            System.out.println("Menu:\n" +
                "1. Get top batters\n" +
                "2. Get top pitchers\n" +
                "3. Get player\n" +
                "4. Get top home run hitters\n" +
                "5. Get lowest ERA\n"+ 
                "6. Quit\n"+ 
                "Enter a number 1-6: ");

            choice = input.nextInt(); // get user choice
            switch(choice)
            {
                case 1:
                    System.out.println("Should call the .getTopBattersSorted(int n) on ArrayList then\n" +
                    "have a Scanner for user input of how many Top batters they want. \n"+
                    "then return the top n batter with the toString formatting made in Batter class.");
                    break;
                case 2:
                    System.out.println("Should call the .getTopPitchersSorted(int n) on ArrayList then\n" +
                    "have a Scanner for user input of how many Top pitchers they want. \n"+
                    "then return the top n pitcher with the toString formatting made in Pitcher class.");
                    break;
                case 3:
                    System.out.println("Should call the .getPlayer(String pID) on ArrayList then\n" +
                    "have a Scanner for user input String Player ID of the player information they want.\n"+
                    "then return the player information with the toString formatting made in Player class.");
                    break;
                case 4:
                    System.out.println("Should call the .getTopHomerunHittersSorted(int n) on ArrayList (made using compareTo method) then\n" +
                    "have a Scanner for user input int number of the top homerun hitter they want.\n"+
                    "then return the n number homerun hitter information with the toString formatting made in Batter class.");
                    break;
                case 5:
                    System.out.println("Should call the .getLowestERASorted(int n) on ArrayList (made using compareTo method) then\n" +
                    "have a Scanner for user input int number of the people with Lowest ERA they want.\n"+
                    "then return the n number of ERA information with the toString formatting made in Pitcher class.");
                    break;
                case 6:
                    return;
                default: 
                    System.out.println("Enter a number 1-6: ");
                    
            }
        } while (choice != 6);
    }
}
