import java.util.Scanner;

public class TextMsgDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      /* Type your code here. */
      System.out.println("Enter text:");
      String input = scnr.nextLine();
      
      System.out.print("You entered: ");
      System.out.println(input);
      
      if (input.indexOf("BFF") != -1){
         System.out.println("BFF: best friend forever");
      }
      if (input.indexOf("IDK") != -1){
         System.out.println("IDK: I don't know");
      }
      if (input.indexOf("JK") != -1){
         System.out.println("JK: just kidding");
      }
      if (input.indexOf("TMI") != -1){
         System.out.println("TMI: too much information");
      }
      if (input.indexOf("TTYL") != -1){
         System.out.println("TTYL: talk to you later");
      }
      
   }
}
