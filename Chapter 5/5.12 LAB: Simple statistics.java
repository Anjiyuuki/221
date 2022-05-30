import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      
      /* Type your code here. */
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();
      
      int avg = (num1+num2+num3+num4)/4;
      int product = num1*num2*num3*num4;
      
      System.out.println(product+" "+avg);
      
      double avgf = (num1+num2+num3+num4)/4.0;
      double prof = (double)num1*(double)num2*(double)num3*(double)num4;
      
      System.out.printf("%.3f %.3f\n",prof,avgf);
   }
}
