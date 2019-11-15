//question 2 for programming assignment 2  
public class Question2 { 
    //method that prints the common elements 
    void question2(int ar1[], int ar2[], int ar3[]) { 
        //initialize starting indexes
        int i = 0, j = 0, k = 0; 
        //loop through three arrays 
        while (i < ar1.length && j < ar2.length && k < ar3.length) 
        { 
             if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) 
             {   System.out.print(ar1[i]+" ");   i++; j++; k++; } 
             else if (ar1[i] < ar2[j]) 
                 i++;
             else if (ar2[j] < ar3[k]) 
                 j++;
             else
                 k++; 
        } 
    } 
  //main method 
  public static void main(String args[]) { 
        Question2 ob = new Question2(); 
        //test arrays
        int ar1[] = {1, 5, 10, 25, 50, 83}; 
        int ar2[] = {5, 7, 25, 98, 103}; 
        int ar3[] = {3, 4, 5, 20, 25, 76, 89, 121}; 
        //prints out the common numbers
        System.out.print("The common elements are: "); 
        ob.question2(ar1, ar2, ar3); 
        System.out.println(" ");
    } 
} 