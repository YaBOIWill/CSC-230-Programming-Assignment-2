//question 5 for programming assignment 2 
import java.util.Scanner;

public class Question5 {
   //main method 
   public static void main(String args[]){
       int a, b;
       Scanner input= new Scanner(System.in);
       //get user input for number of rows and columns
       while(true){
           System.out.print("Enter number of Rows: ");
           a = input.nextInt();
           if(a < 4){
               System.out.println("Number of rows should be >= 4.");
           }else{
               break;
           }          
       }
       while(true){
           System.out.print("Enter number of Columns: ");
           b = input.nextInt();
           if(b < 4){
               System.out.println("Number of columns should be >= 4.");
           }else{
               break;
           }          
       }
       //generate numbers for the array
       int ran = (a * b) / 4;      
       int ranArr[][] = new int[a][b];
       fillTheArray(ranArr, ran);
       //prints out the array
       printTheArray(ranArr);
       //look for 4 consecutive numbers
       System.out.println("Four consecutive numbers have same value : " + isTheSame(ranArr));      
   }
   
   private static boolean isTheSame(int[][] arr) {
       //look for rows
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j <= arr[0].length - 4; j++){
               if(arr[i][j] == arr[i][j+1] && arr[i][j+1] == arr[i][j+2] && arr[i][j+2] == arr[i][j+3]){
                   return true;
               }
           }
       }
       //look for columns
       for(int j = 0; j < arr[0].length; j++){
           for(int i = 0; i <= arr.length - 4; i++){
               if(arr[i][j] == arr[i+1][j] && arr[i+1][j] == arr[i+2][j] && arr[i+2][j] == arr[i+3][j]){
                   return true;
               }
           }
       }
       //look for diagonal
       for(int i = 0; i <= arr.length - 4; i++){          
           if(arr[i][i] == arr[i+1][i+1] && arr[i+1][i+1] == arr[i+2][i+2] && arr[i+2][i+2] == arr[i+3][i+3]){
               return true;
           }          
       }
       return false; 
   }
   //fill array with numbers
   private static void fillTheArray(int arr[][], int range){
       for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr[0].length; j++){
               arr[i][j] = ((int) (Math.random() * (range)));
           }
       }
   }
   //print out array results
   private static void printTheArray(int arr[][]){
       for(int i = 0 ; i < arr.length; i++){
           for(int j = 0; j < arr[0].length; j++){
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
   }
}