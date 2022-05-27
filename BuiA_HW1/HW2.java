
/**
 * Name: Angie Bui 
 * HW2.java
 * Summer 2022
 * 
 * Problem: This calls the Crap game 10,000 times, includes a counter
 * for win and losses. And the probability of winning. 
 * 
 * Certification of Authenticity:
 * I Certify that this homework is entirely my own work. 
 */
public class HW2
{
    /**
     * main - drives the game of craps test of wins/losses in 10000 games
     */
    public static void main (String [] args)
    {
        int games = 10000; //Amount being played
        double winCounter = 0; //Counts time won
        double loseCounter = 0; // Counts time lost
        double probability; //probability of winning
        for (int i = 0; i <= games; i++){ //Loop for playing the game 10000 times
            Craps game = new Craps();  // an instance of a Craps class
            //Since it returns 1s and 0s if greater than 0 it will count 
            //towards winCounter else it will count as a lost towards loseCounter
            if (game.playCraps() > 0 ){
                winCounter++;
            }
            else{
                loseCounter++;
            }
        }
        probability = (100*(winCounter/(winCounter+loseCounter)));
        System.out.println();
        System.out.println("The result after 10,000 Crap games played.");
        System.out.println("Number of Wins: " + winCounter);
        System.out.println("Number of Losses: " + loseCounter);
        System.out.println("The probability of winning is: " + probability + "%");
    }
}
