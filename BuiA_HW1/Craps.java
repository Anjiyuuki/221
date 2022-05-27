/**
 * Name: Angie Bui
 * Craps.java
 * Summer 2022
 * 
 *  Craps.java - simulates the dice game of craps, Uses Switch and
 *  casses to check through the 12 dice numbers and determine whether
 *  player win or loses based on game rules. 
 *  
 *  Shell provide by McCauley
 * 
 * Certification of Authenticity:
 * I Certify that this homework is entirely my own work. 
 */
public class Craps
{
    /** 
     * instance variables
     */
    private Die die1 = new Die();
    private Die die2 = new Die();

    /**
     * playCraps - simulates a single game of craps
     * @return - 1 indicates a win, 0 a loss
     */  
    public int playCraps()
    {
        int dice1Score;
        int dice2Score;
        int round1;
        int moreRoll;
        boolean rolling;

        dice1Score = die1.roll();
        dice2Score = die2.roll();
        round1 = dice1Score + dice2Score; 

        System.out.println("Your dice score is : " +dice1Score + " + " +dice2Score + "= "+ round1);
        switch(round1){ 
                //Basically if they roll 2,3,12 they instantly lose
                //and 7,11, instantly win -on their first roll
            case 2:
            case 3:
            case 12:
                System.out.println("You lose!");
                System.out.println();
                return 0;
            case 7:
            case 11:
                System.out.println("You win!");
                System.out.println();
                return 1;
            default: // if they don't roll the above first roll then it goes to default 
                // where they continue to roll until they get their 
                //point or hit losing case 
                System.out.println("Continue rolling");
                rolling = true; 
                do{
                    moreRoll = die1.roll() + die2.roll();
                    System.out.println("You rolled: " + moreRoll);
                    if (moreRoll == round1 || moreRoll == 7)
                        rolling = false; //Won't excecute 
                } while (rolling); 
                switch (moreRoll) {
                    //they continue to roll until they hit their point
                    //or hit the losing number
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                        System.out.println("You win!");
                        System.out.println();
                        return 1;
                    case 7:
                        System.out.println("You lose.");
                        System.out.println();
                        return 0;
                    default:
                        System.out.println("Nothing");
                        break;
                }
                break;
        }
        return 1;
    }
}