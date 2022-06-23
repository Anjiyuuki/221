import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scrn = new Scanner(System.in);

    int arrayNum;
    arrayNum = scrn.nextInt();
    int numbers[] = new int[arrayNum];
    for (int i=0; i<arrayNum; i++) {
      numbers[i] = scrn.nextInt();
    }
    
    int low1 = Integer.MAX_VALUE;
    int low2 = Integer.MAX_VALUE;

    for (int i=0; i<arrayNum; i++) {
      int num = numbers[i];
         if (num < low1) {
            low2 = low1;
            low1 = num;
      } else if (num < low2) {
        low2 = num;
      }
    }
    System.out.println(low1+ " and " +low2);
   }
}
