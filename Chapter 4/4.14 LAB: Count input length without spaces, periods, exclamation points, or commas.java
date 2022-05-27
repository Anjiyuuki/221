import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int wordCount;
      // Add more variables as needed
   
      userText = scnr.nextLine();  // Gets entire line, including spaces. 
      wordCount = 0;

      /* Type your code here. */
       for (int i = 0; i < userText.length(); i++){
         char current = userText.charAt(i);
            if (current  != ' ' && current  != ',' && current  != '.'&& current  != '!'){
            wordCount++;
    }
 }
      System.out.println(wordCount);
      
   }
}
