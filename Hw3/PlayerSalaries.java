import java.io.File;

import java.io.*;

import java.util.*;
/**
 * Angie Bui
 * CSCI 221, Summer 2022, Programming HW 3
 * 
 * 
 * PlayerSalaries class includes methods that can be called
 * so output specific data that the user want that is in
 * the csv file. More function details provided on top 
 * of each methods.
 * 
 * 
 * This work is entirely my own.
 */
public class PlayerSalaries
{
    private PlayerSalary[] salariesArray; //Array for the csv player stats 

    //This method when called, let user input their csv file
    // name to be read, and split by the comma, into an array
    // where the information will be stored in the array
    public PlayerSalaries(String filename) throws FileNotFoundException
    {
        File inFile = new File(filename);
        Scanner readFile = new Scanner(inFile); 
        int salStats = readFile.nextInt();
        readFile.nextLine();
        readFile.nextLine();

        //loops through all the stats and splits the data by the comma
        // into an array
        for (int i = 0; i < salStats; i++)
        {
            String data = readFile.nextLine();
            String []splitData = data.split(","); //split by comma
            int theYear = Integer.valueOf(splitData[0]);
            int theSalary = Integer.valueOf(splitData[4]);
            salariesArray[i] = new PlayerSalary(theYear,splitData[1], 
                splitData[2],splitData[3], theSalary);

        }
    }

    // This method when called, let user input the year in the
    // parameter and it will output the average salaray in
    // the year
    public int averageSalaryInYear(int year)
    {
        int avgSalAcc = 0; //accumulate avg
        int theLine = 0; //counts the amount of line to calc avg
        //loops through the salariesArray and accumulates
        // all of the salary in the year
        for (int i = 0; i < salariesArray.length; i++)
        {
            if( year == salariesArray[i].getYearID()){
                //accumulate salary through that year
                avgSalAcc = avgSalAcc + salariesArray[i].getSalary();
                theLine+= 1; // add line by 1
            }
        }
        int avg = avgSalAcc / theLine; //calc the total avg salary in
        //specific year
        return avg;
    }

    // This method when called, let user input the playerID and year
    // output the specific player information in that year
    public PlayerSalary findPlayerInYear(String player, int year)
    {   
        PlayerSalary answer = null;
        for (int i = 0; i < salariesArray.length; i++)
        {
            //matches user player parameter within the salariesArray
            // using getter methods to receive that data, uses && to 
            // check for both condition player and year
            if (salariesArray[i].getPlayerID().equals(player) && 
            year == salariesArray[i].getYearID()){
                answer = new PlayerSalary(salariesArray[i].getYearID(),
                    salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() , 
                    salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                break;
            }
        }
        return answer;
    }

    // This method takes in the year parameter and gets highest salary
    // from that year
    public PlayerSalary highestSalaryInYear(int year)
    {
        PlayerSalary answer = new PlayerSalary(salariesArray[0].getYearID(), 
                salariesArray[0].getTeamID(), salariesArray[0].getLeagueID() ,
                salariesArray[0].getPlayerID() , salariesArray[0].getSalary());
        
        for (int i = 0; i < salariesArray.length; i++) 
        //i - goes through array first
        {
                if (year == salariesArray[i].getYearID()) //check if year match
                {
                    // if the year does match, answer array will loop through
                    // and check if it is greater than salariesArray[i] to get
                    // the highest salarie, and return back the PlayerSalary answer
                     if (answer.getSalary() < salariesArray[i].getSalary()) 
                { // compares the salary if the year matches
                    answer = new PlayerSalary(salariesArray[i].getYearID(), 
                        salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() ,
                        salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                }
                }
        }
        return answer;
    }   

    
    // This method takes in the year parameter and gets lowest salary
    // from that year
    public PlayerSalary lowestSalaryInYear(int year)

    {
        PlayerSalary answer = new PlayerSalary(salariesArray[0].getYearID(), 
                salariesArray[0].getTeamID(), salariesArray[0].getLeagueID() ,
                salariesArray[0].getPlayerID() , salariesArray[0].getSalary());
        
     
        for (int i = 0; i < salariesArray.length; i++)
        { //i - goes through array first
                if (year == salariesArray[i].getYearID()) //check if year match
                {
                    // if the year does match, answer array will loop through
                    // and check if it is lower than salariesArray[i] to get
                    // the lowest salarie, and return back the PlayerSalary answer
                     if (answer.getSalary() > salariesArray[i].getSalary()) 
                { // compares the salary if the year matches
                    answer = new PlayerSalary(salariesArray[i].getYearID(), 
                        salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() ,
                        salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                }
                }
            
        }
        return answer;
    }

    // This method takes in the specific team and year parameter
    //  and gets highest salary 
    public PlayerSalary highestSalaryInTeamInYear(String team, int year)
    {
        PlayerSalary answer = new PlayerSalary(salariesArray[0].getYearID(), 
                salariesArray[0].getTeamID(), salariesArray[0].getLeagueID() ,
                salariesArray[0].getPlayerID() , salariesArray[0].getSalary());
     
        for (int i = 0; i < salariesArray.length; i++)
        { //i - goes through array first
                if (salariesArray[i].getTeamID().equals(team) &&
                year == salariesArray[i].getYearID())
                { //check and matches the team ID and if year is same as
                    // where the year in the array is at
                    if (answer.getSalary() < salariesArray[i].getSalary()) 
                { // compares the salary if the team and year matches
                    answer = new PlayerSalary(salariesArray[i].getYearID(), 
                        salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() ,
                        salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                }
                }
            
        }
        return answer;
    }

    // This method takes in the specific team and year parameter
    //  and gets lowest salary 
    public PlayerSalary lowestSalaryInTeamInYear(String team, int year)

    {
        PlayerSalary answer = new PlayerSalary(salariesArray[0].getYearID(), 
                salariesArray[0].getTeamID(), salariesArray[0].getLeagueID() ,
                salariesArray[0].getPlayerID() , salariesArray[0].getSalary());
    
        for (int i = 0; i < salariesArray.length; i++)
        { //i - goes through array first
                if (salariesArray[i].getTeamID().equals(team) &&
                year == salariesArray[i].getYearID())
                { //Checks for team id and year if they match parameter
                    if (answer.getSalary() > salariesArray[i].getSalary()) 
                { // compares the salary if the team and year matches
                    answer = new PlayerSalary(salariesArray[i].getYearID(), 
                        salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() ,
                        salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                }
                }
            
        }
        return answer;
    }

    // This method takes in the specific league and year parameter
    //  and gets highest salary 
    public PlayerSalary highestSalaryInLeagueInYear(String leag, int year)
    {
        PlayerSalary answer = new PlayerSalary(salariesArray[0].getYearID(), 
                salariesArray[0].getTeamID(), salariesArray[0].getLeagueID() ,
                salariesArray[0].getPlayerID() , salariesArray[0].getSalary());
        
        for (int i = 0; i < salariesArray.length; i++)
        { //i - goes through array 
            if (leag == salariesArray[i].getLeagueID() &&
            year == salariesArray[i].getYearID())
            { //Checks for league id and year if they match parameter
                if (answer.getSalary() < salariesArray[i].getSalary()) 
                { // compares the salary if the league and year matches
                    answer = new PlayerSalary(salariesArray[i].getYearID(), 
                        salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() ,
                        salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                }
            }
        }
        return answer;
    }
    
    // This method takes in the specific league and year parameter
    //  and gets lowest salary 
    public PlayerSalary lowestSalaryInLeagueInYear(String leag, int year)
    {

        PlayerSalary answer = new PlayerSalary(salariesArray[0].getYearID(), 
                salariesArray[0].getTeamID(), salariesArray[0].getLeagueID() ,
                salariesArray[0].getPlayerID() , salariesArray[0].getSalary());
       
        for (int i = 0; i < salariesArray.length; i++)
        { //i - goes through array 
            if (leag == salariesArray[i].getLeagueID() &&
            year == salariesArray[i].getYearID())
            { //Checks for league id and year if they match parameter
                if (answer.getSalary() > salariesArray[i].getSalary()) 
                { // compares the salary if the league and year matches
                    answer = new PlayerSalary(salariesArray[i].getYearID(), 
                        salariesArray[i].getTeamID(), salariesArray[i].getLeagueID() ,
                        salariesArray[i].getPlayerID() , salariesArray[i].getSalary());
                }
            }
        }
        return answer;
    }
}

