/**
 * class Die simulates a roll of a die by returning a 
 * pseudo-random value in the range 1-6.
 * 
 * @author (McCauley) 
 */
import java.util.Random;
public class Die
{
    private int value;

    /**
     * Constructor for objects of class Die 
     */
    public Die()
    {
    }

    /**
     * method roll - simulates a roll of the die
     * return an int in the range 1-6, inclusive
     */
    public int roll()
    {
        Random rand = new Random();
        value = rand.nextInt(6) + 1;
        return value;
    }
}