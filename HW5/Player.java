
/**
 * Angie Bui 
 * CSCI 221, Summer 2022, Programming HW 5
 * 
 * This program creates Player class where 
 * different getter and setters methods can 
 * be used. And a toString formatter.
 * 
 * Certification: This work is entirely my own.
 */
public class Player
{
    //private instance variables
    private String PlayerID;
    private String FirstName;
    private String LastName;
    private String BirthDate;
    private String BirthLocation;
    private int Height;
    private int Weight;
    
    //Constructor 
    public Player(String playerID, String firstName, String lastName, String birthDate, String birthLocation, 
    int height, int weight){
        this.PlayerID = playerID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.BirthDate = birthDate;
        this.BirthLocation = birthLocation;
        this.Height = height;
        this.Weight = weight;
    }
    
    //All the Getter/Setter Methods
    public void setPlayerID(String p){
        this.PlayerID = p;
    }
    public String getPlayerID(){
        return PlayerID;
    }
    
    public void setFirstName(String name){
        this.FirstName = name;
    }
    public String getFirstName(){
        return FirstName;
    }
    
    public void setLastName(String last){
        this.LastName = last;
    }
    public String getLastName(){
        return LastName;
    }
    
    public void setBirthDate(String bday){
        this.BirthDate = bday;
    }
    public String getBirthDate(){
        return BirthDate;
    }
    
    public void setBirthLocation(String location){
        this.BirthLocation = location;
    }
    public String getBirthLocation(){
        return BirthLocation;
    }
    
    public void setHeight(int h){
        this.Height = h;
    }
    public int getHeight(){
        return Height;
    }
    
    public void setWeight(int w){
        this.Weight = w;
    }
    public int getWeight(){
        return Weight;
    }
    
    
    //toString to return player information in this format
    public String toString(){
        return
        "Players information\n"+
        "\nPlayer: " + PlayerID   +
        "\nFirst Name: " + FirstName   +
        "\nLast Name: " + LastName +
        "\nBirth Date: " + BirthDate + 
        "\nBirth Location: " + BirthLocation + 
        "\nHeight: " + Height + 
        "\nWeight: " + Weight;
    }
}
