//question 4 for programming assignment 2 
public class Question4 {
   //main method
   public static void main(String[] args) {
       //variables for dice and rolls
       int [] rollSum = new int[21];
       int d1, d2, d3, d4;
       //loop to simulate dice rolls
       for (int i = 0; i < 12960; i++) {
           d1 = 1 + (int)(Math.random() * 6);
           d2 = 1 + (int)(Math.random() * 6);
           d3 = 1 + (int)(Math.random() * 6);
           d4 = 1 + (int)(Math.random() * 6);
           rollSum[d1 + d2 + d3 + d4 - 4] += 1;
       }
      //print out statement for the results 
      System.out.println("The Sum of Rolls        The Frequency ");
       for(int i = 4; i < 25; i++) {
           System.out.printf("    %3d            %7d ", i, rollSum[i-4]);
           System.out.println("");
       }
   }
}