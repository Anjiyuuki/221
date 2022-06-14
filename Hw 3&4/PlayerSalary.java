
/**
 * Angie Bui
 * CSCI 221, Summer 2022, Programming HW 4
 * 
 *This PlayerSalary class contruct objects of class PlayerSalary.
 *It initilises the 5 object information that is from the csv.  
 * 
 * This work is entirely my own.
 */
public class PlayerSalary
{
    // private instance variables
    private int yearID;
    private String teamID;
    private String leagueID;
    private String playerID;
    private int salary;

    /**
     * Constructor for objects of class PlayerSalary
     */
    public PlayerSalary(int year, String team, String league,
    String player, int salary)
    {
        // initialise instance variables
        this.yearID = year;
        this.teamID = team;
        this.leagueID = league;
        this.playerID = player;
        this.salary = salary;
    }

    // toString prints the format of what it will look like 
    public String toString(){
        return 
        "Players information\n"  +
        "\nYear   : " + yearID   +
        "\nTeam   : " + teamID   +
        "\nLeague : " + leagueID +
        "\nPlayer : " + playerID +
        "\nSalary : " + salary ; 
    }

    //getter methods
    public int getYearID()   { return yearID; }

    public String getTeamID()   { return teamID; }

    public String getLeagueID() { return leagueID; }

    public String getPlayerID() { return playerID; }

    public int getSalary()   { return salary; }

    //Main methods to test if the getters methods
    public static void main(String [] args){

        PlayerSalary statsRecord = new PlayerSalary(1985,"ATL","NL","barkele01",870000) ;

        System.out.println(statsRecord.getYearID());

        System.out.println(statsRecord.getTeamID());

        System.out.println(statsRecord.getLeagueID());

        System.out.println(statsRecord.getPlayerID());

        System.out.println(statsRecord.getSalary());

    }
}

