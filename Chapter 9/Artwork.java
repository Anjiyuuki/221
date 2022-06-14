public class Artwork {
   // TODO: Declare private fields - title, yearCreated
   private String title;
   private int yearCreated;
   
   
   // TODO: Declare private field artist of type Artist 
   private Artist artist;

   // TODO: Define default constructor
   public Artwork(){
      title = "unknown";
      yearCreated = -1;
     artist = new Artist();
   }
   
   // TODO: Define get methods: getTitle(), getYearCreated()
   public String getTitle() {
      return this.title;
      }
      
      public int getYearCreated() {
         return this.yearCreated;
         }

   // TODO: Define second constructor to initialize 
   //       private fields (title, yearCreated, artist)
   public Artwork(String title, int yearCreated, Artist artist) {
      this.title = title;
      this.yearCreated = yearCreated;
      this.artist = artist;
      }

   // TODO: Define printInfo() method                                                                                             
   public void printInfo() {
      artist.printInfo();
      System.out.println("Title: " + title + ", " + yearCreated);
      
   }
}
