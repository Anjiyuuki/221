import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
   
      double calories;
      int age;
      int weight;
      int heartRate;
      int time; 
      
      /* Type your code here. */
      Scanner input = new Scanner(System.in);
      
      //System.out.print("Enter age:");
      age = input.nextInt(); 
      //System.out.println(); 
      
      //System.out.print("Enter weight (pounds):");
      weight = input.nextInt(); 
      //System.out.println(); 
      
      //System.out.print("Enter heart rate (beats per min):");
      heartRate = input.nextInt(); 
      //System.out.println(); 
      
      //System.out.print("Enter time (mins):");
      time = input.nextInt(); 
      //ystem.out.println(); 
   
      calories = ((age * 0.2757) + (weight * 0.03295) + (heartRate * 1.0781) - 75.4991) * (time / 8.368);
      System.out.print("Calories: ");
      System.out.printf("%.2f", calories);
      System.out.println(" calories");
   }
} 
