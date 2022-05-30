
/*
 * Angie Bui
 * CSCI 221, Summer 2022, Programming HW 2
 * 
 *
 * This program analyzes movie review data to determine if words have a 
 * negative or positive meaning. If a word is used more often in positive 
 * reviews, it is assumed that the word is positive, and vice versa. It
 * can get score of a word, avg score of words in user file, and find highest
 * and lowest score words from user file. 
 * 
 * 
 * 
 * This work is entirely my own.
 */

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW2
{
    //Run void main(String[] args) to run the program
    public static void main(String[] args) throws FileNotFoundException 
    {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        String word;
        while(true)
        {
            System.out.println();
            // \n create new line so don't have to write println for every line
            System.out.println("What would you like to do?\n" +
                "1. Get the score of a word\n" +
                "2. Get the average score of words in a file (one word per line)\n" +
                "3. Find the highest/lowest scoring words in a file\n" +
                "4. Sort words from a file into positive.txt and negative.txt\n" +
                "5. Exit the program\n"+ 
                "Enter a number 1-5: ");

            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    word = input.nextLine();
                    getWordScore(word);
                    break;
                case 2:
                    averageScoreFile();
                    break;
                case 3:
                    negPos();
                    break;
                case 4:
                    System.out.println("This choice does not do anything.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("\nInvalid Input! Enter number 1-5: ");
                    break;

            }
        }
    }

    static double getWordScore(String word) throws FileNotFoundException 
    {
        // Create file instance for input
        File reviewFile = new File("movieReviews.txt");
        // This scanner instance will read from the aforementioned file, which
        // must be in your BlueJ project directory for it to find it.
        Scanner reviewScanner = new Scanner(reviewFile);
        // This scanner instance reads from the input
        Scanner input = new Scanner(System.in);

        double reviewValue;
        String reviewLine;
        double wordLineCount;
        wordLineCount = 0;
        double averageScore;
        averageScore = 0;
        double totalReviewScore = 0;

        // Ask the user to enter a word
        System.out.print("Enter a word: ");
        word = input.nextLine();

        // Most of your code is added below this line, except possibly for variable declarations

        // This loop iterates as long as there is text in the file    

        while(reviewScanner.hasNext())
        {
            // Read the numeric movie rating
            reviewValue = reviewScanner.nextInt();
            // Read the text of the verbal review
            reviewLine = reviewScanner.nextLine();

            // If the review contains the word the user entered, print the 
            // rating and the review and continue; if it does not, process the
            // next review. Your program will do more than this, of course!!
            if(reviewLine.contains(word))
            {
                //System.out.println("Score: "+reviewValue);
                //System.out.println("Text: "+reviewLine);
                wordLineCount++;
                totalReviewScore = totalReviewScore + reviewValue;
            }          
        }
        averageScore = (totalReviewScore)/ (wordLineCount);

        System.out.println( word +" appears "+ wordLineCount +" times");
        System.out.print("The average score for review containing");
        System.out.println(" the word "+ word+ " is "+ averageScore);
        return averageScore;
    }

    static void averageScoreFile() throws FileNotFoundException
    {
        String inputFile;
        double wordCount;
        double wordScore; 
        String word;
        int reviewValue;
        String reviewText;
        int lineWithWord;
        lineWithWord = 0;
        double wordAvg; 
        double wholeAvg;
        wholeAvg = 0;

        // read the main file
        File mainFile = new File("movieReviews.txt");
        Scanner input = new Scanner(System.in);

        //read the user file
        System.out.print("Enter the name of the file with words");
        System.out.println(" you want to find the average score for: ");

        inputFile = input.nextLine();
        File userFile = new File(inputFile);

        Scanner userScanner = new Scanner (userFile);

        // Nest loop- Compares both files to each other to get  avg
        while(userScanner.hasNext()){
            Scanner mainScanner = new Scanner (mainFile);
            wordCount = 0;
            wordScore = 0;
            word = userScanner.nextLine();

            while(mainScanner.hasNext()){
                reviewValue = mainScanner.nextInt();
                reviewText = mainScanner.nextLine();

                if (reviewText.contains(word)){
                    wordCount++;
                    wordScore += reviewValue;
                }
            }

            lineWithWord += 1; //counts the amount of line with a word to calc avg
            wordAvg = (double) wordScore / (double) wordCount;
            wholeAvg += wordAvg; // Accumulates all the words averages 
        }
        wholeAvg = wholeAvg / lineWithWord; // get the final avg divded by lines 

        System.out.print("The average score of words in " + inputFile );
        System.out.println(" is " + wholeAvg );

        if (wholeAvg >= 2.01){
            System.out.print("The overall sentiment of "+ inputFile);
            System.out.println(" is positive");
        }
        else{
            System.out.print("The overall sentiment of "+ inputFile);
            System.out.println(" is negative");
        }
    }

    static void negPos() throws FileNotFoundException
    {
        String inputFile;
        double wordCount;
        double wordScore; 
        String word;
        int reviewValue;
        String reviewText;
        int lineWithWord;
        lineWithWord = 0;
        double wordAvg; 
        double wholeAvg;
        wholeAvg = 0;
        double lowestAvg;
        lowestAvg = 0;
        double highestAvg;
        highestAvg = 0;
        String mostPosWord = null;
        String mostNegWord = null;

        // reading main file 
        File mainFile = new File("movieReviews.txt");
        Scanner input = new Scanner(System.in);

        //user file 
        System.out.print("Enter the name of the file with words");
        System.out.println(" you want to find the average score for: ");

        inputFile = input.nextLine();
        File userFile = new File(inputFile);

        Scanner userScanner = new Scanner (userFile);

        //Nested loop to compare user words to our main file
        while(userScanner.hasNext()){
            Scanner mainScanner = new Scanner (mainFile);
            wordCount = 0;
            wordScore = 0;
            word = userScanner.nextLine();

            while(mainScanner.hasNext()){
                reviewValue = mainScanner.nextInt();
                reviewText = mainScanner.nextLine();

                if (reviewText.contains(word)){
                    wordCount++;
                    wordScore += reviewValue;
                }
            }
            
            //calc word avg
            wordAvg = (double) wordScore / (double) wordCount;

            //if else statement to get highest and lowest word avg w/ the word
            if (wordAvg > highestAvg)
            {
                highestAvg = wordAvg;
                mostPosWord = word;

            }
            if (wordAvg < highestAvg)
            {
                lowestAvg = wordAvg;
                mostNegWord = word;
            }
        } 
        System.out.print("The most positive word, with a score of ");
        System.out.println(highestAvg + " is "+ mostPosWord  );  
        System.out.print("The most negative word, with a score of ");
        System.out.println(lowestAvg + " is " + mostNegWord );
    }
}

