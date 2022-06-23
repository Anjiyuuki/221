import java.util.Scanner;

public class LabProgram {
   
   /* Define your method here */ 
   public static double lapsToMiles(double userLaps){
        return userLaps*0.25;
   }
   
   public static void main(String[] args) {
      /* Type your code here. Your code must call the method.  */
      Scanner scrn = new Scanner(System.in);
      double amountLaps = scrn.nextDouble();
      double miles = lapsToMiles(amountLaps);
      System.out.printf("%.2f\n",miles);
    }
   }
