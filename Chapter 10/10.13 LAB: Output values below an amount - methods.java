import java.util.Scanner;

public class LabProgram {

   /* Define your methods here */
   public static void getUserValues(int[] myArr,int arrSize,Scanner scnr){
    int i;
    for(i=0;i<arrSize;i++){
        myArr[i]=scnr.nextInt();
    }
}
   
   public static int intsLessThanOrEqualToThreshold(int[] userValues,int userValSize,int upperThresold,int[]resValues)
{
    int count=0;
    for(int i=0; i<userValSize; i++){
        if(userValues[i]<=upperThresold){
            resValues[count++]=userValues[i];
        }
    }
    return count;
}
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];
      int[] resValues = new int[20];
      int upperThreshold;
      int numInVals;
      int numResVals;
      int i;

      numInVals = scnr.nextInt();
      getUserValues(userValues, numInVals, scnr);

      upperThreshold = scnr.nextInt();
      numResVals = intsLessThanOrEqualToThreshold(userValues, numInVals, upperThreshold, resValues);
      
      for (i = 0; i < numResVals; ++i) {
         System.out.print(resValues[i] + " ");
      }
      System.out.println();
   }
}
