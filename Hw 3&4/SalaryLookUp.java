import java.util.*;
import java.io.*;
/**
Angie Bui
 * CSCI 221, Summer 2022, Programming HW 4
 * 
 * 
 * This program creates a menu to run all the methods.
 * Try and catch exceptions for possible scenerios.
 * Also will catch some extra exception just in case. 
 * 
 *
 */
public class SalaryLookUp
{
    public static void main (String [] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String userFile;
        userFile = input.nextLine();

        PlayerSalaries theStats = new PlayerSalaries(userFile);

        int choice = 0;
        String word;
        // Do - Runs the program, unless user enters 10 which will end the program
        do
        { 
            //Menu Options user can choose from
            System.out.println();
            System.out.println("Please enter your choice: \n" +
                "1: See average salary in a specific year\n"+
                "2: See a specific player’s salary in a specific year\n" + 
                "3: See the highest salary in a specific year\n" +
                "4: See the lowest salary in a specific year\n"+
                "5: See the highest salary on a specific team in a specific year\n"+ 
                "6: See the lowest salary on a specific team in a specific year\n" + 
                "7: See the highest salary in the league in a specific year\n" +
                "8: See the lowest salary in league in a specific year\n"+
                "9: Compare salaries of two specific players in a specific year\n"+ 
                "10: Quit.");

            try { // try and catches the user choice for which item them want in menu
                // will catch InputMismatchException if not an int 
                choice = input.nextInt();
                switch(choice)
                {
                    case 1:
                        //Prompt user to input the year
                        //catches InputMismatchException if year is not entered 
                        Scanner in = new Scanner(System.in);
                        PlayerSalaries theStats1 = new PlayerSalaries(userFile);
                        try{
                            System.out.println("Enter year: ");
                            int year = in.nextInt();
                            theStats1.averageSalaryInYear(year);

                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter a valid year.");
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }
                        break;
                    case 2:
                        //catches InputMisMatch if int year is not enter correctly
                        // also catch if string playerID is not enter correctly
                        // will catch other exceptions just in case
                        Scanner inPlayer1 = new Scanner(System.in);
                        Scanner inY1 = new Scanner(System.in);
                        PlayerSalaries theStats8 = new PlayerSalaries(userFile);
                        
                        try{
                            System.out.println("Enter year: ");
                            int yr1 = inY1.nextInt();
                            System.out.println();
                            System.out.println("Enter Player ID: ");
                            String pID = inPlayer1.nextLine();
                            theStats8.findPlayerInYear(pID, yr1);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter valid input.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }

                        break;

                    case 3:
                        //catches InputMisMatch if year is not enter correctly
                        // will catch other exceptions just in case
                        Scanner i = new Scanner(System.in);
                        PlayerSalaries theStats2 = new PlayerSalaries(userFile);
                        try{
                            System.out.println("Enter year: ");
                            int y = i.nextInt();
                            theStats2.highestSalaryInYear(y);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter a valid year.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }

                        break;
                    case 4:
                        //catches InputMisMatch if year is not enter correctly
                        // will catch other exceptions just in case
                        Scanner inputYear = new Scanner(System.in);
                        PlayerSalaries theStats3 = new PlayerSalaries(userFile);
                        
                        try{
                            System.out.println("Enter year: ");
                            int yl = inputYear.nextInt();
                            theStats3.lowestSalaryInYear(yl);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter valid input.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }

                        break;
                    case 5:
                        //catches InputMisMatch if int year is not enter correctly
                        // also catch if string team is not enter correctly
                        // will catch other exceptions just in case
                        Scanner inTeam1 = new Scanner(System.in);
                        Scanner inYear1 = new Scanner(System.in);
                        PlayerSalaries theStats4 = new PlayerSalaries(userFile);
                        
                        try{
                            System.out.println("Enter year: ");
                            int year1 = inYear1.nextInt();
                            System.out.println();
                            System.out.println("Enter Team: ");
                            String team1 = inTeam1.nextLine();
                            theStats4.highestSalaryInTeamInYear(team1.toUpperCase(), year1);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter valid input.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }
                        
                        break;
                    case 6:
                        //catches InputMisMatch if int year is not enter correctly
                        // also catch if string team is not enter correctly
                        // will catch other exceptions just in case
                        Scanner inTeam1l = new Scanner(System.in);
                        Scanner inYear1l = new Scanner(System.in);
                        PlayerSalaries theStats5 = new PlayerSalaries(userFile);
                        
                        try{
                            System.out.println("Enter year: ");
                            int year1 = inYear1l.nextInt();
                            System.out.println();
                            System.out.println("Enter Team: ");
                            String team1 = inTeam1l.nextLine();
                            theStats5.lowestSalaryInTeamInYear(team1.toUpperCase(), year1);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter valid input.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }
                        
                        
                        break;
                    case 7:
                        //catches InputMisMatch if int year is not enter correctly
                        // also catch if string league is not enter correctly
                        // will catch other exceptions just in case
                        Scanner inLeague1 = new Scanner(System.in);
                        Scanner inYear2 = new Scanner(System.in);
                        PlayerSalaries theStats6 = new PlayerSalaries(userFile);
                        
                        try{
                            System.out.println("Enter year: ");
                            int year1 = inYear2.nextInt();
                            System.out.println();
                            System.out.println("Enter League: ");
                            String league1 = inLeague1.nextLine();
                            theStats6.highestSalaryInLeagueInYear(league1.toUpperCase(), year1);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter valid input.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }
                        
                        
                        break;
                    case 8:
                        //catches InputMisMatch if int year is not enter correctly
                        // also catch if string league is not enter correctly
                        // will catch other exceptions just in case
                        Scanner inLeague2 = new Scanner(System.in);
                        Scanner inYear3 = new Scanner(System.in);
                        PlayerSalaries theStats7 = new PlayerSalaries(userFile);
                        
                        try{
                            System.out.println("Enter year: ");
                            int year1 = inYear3.nextInt();
                            System.out.println();
                            System.out.println("Enter League: ");
                            String league1 = inLeague2.nextLine();
                            theStats7.lowestSalaryInLeagueInYear(league1.toUpperCase(), year1);
                        }catch(InputMismatchException e){
                            System.out.println("Invalid input, choose option again and re-enter valid input.");
                        }catch (NullPointerException f){
                            System.out.println("Error: " + f);
                        }catch (Exception g){
                            System.out.println("Error: " + g);
                        }
                        break;
                    case 9:
                        // there was no method for this option
                        // will catch Exception if anything goes wrong
                        try{
                        System.out.println("This option does not have anything.");
                    }catch(Exception g){
                            System.out.println("Error: " + g);
                        }
                        break;
                    case 10:
                        return;
                    default:
                        System.out.println("\nInvalid Input! Enter number 1-10: ");
                        break;

                }
            }
            catch(InputMismatchException ime){
                System.out.println("Invalid Input! Enter number 1-10:");
                input.next();
            }
        }while (choice != 10);
    }
}
