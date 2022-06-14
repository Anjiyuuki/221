public class Artist {
   // TODO: Declare private fields - artistName, birthYear, deathYear
   private String artistName;
   private int birthYear;
   private int deathYear;
   // TODO: Define default constructor
   public Artist(){
      artistName = "unknown";
      birthYear = -1;
      deathYear = -1;
   }
   // TODO: Define second constructor to initialize 
   //       private fields (artistName, birthYear, deathYear)
   public Artist( String artistName, int birthYear, int deathYear){
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
   }
   // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
   public String getName(){
      return this.artistName;
   }
   public int getBirthYear(){
      return this.birthYear;
   }
   public int getDeathYear(){
      return this.deathYear;
   }
   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
   public void printInfo(){
      System.out.print("Artist: ");
        System.out.print(artistName);
        if (deathYear == -1 && birthYear != -1) {
            System.out.println(" (" + birthYear +" to present)");
        }
        if (deathYear == -1 && birthYear == -1 ){
           System.out.println(" (unknown)");
        }
        if (deathYear != -1 && birthYear != -1){
            System.out.println(" (" + birthYear + " to " + deathYear + ")");
        }

} 
}
