//question 6 for programming assignment 2 
import java.util.Scanner;

public class Question6 {
    //get strings from user input 
    static String [] getStrings() {
        String[] array1;
        try (Scanner input = new Scanner(System.in)) {
            String newLine;
            array1 = new String[2];
            int s = 0;
            while (true) {
                newLine = input.nextLine();
                if(newLine.isEmpty()) {
                    break;
                }
                if(s == array1.length) {
                    array1 = resize(array1, 2*s);
                }
                array1[s++] = newLine;
            }   array1 = resize(array1, s);
        }
        return array1;
    }
    //stores inputs in string array
    static String [] resize( String [] array, int newSize) {
        String[] arr = new String[newSize];
        int len = Math.min(array.length, newSize);
        for(int i = 0; i < len; ++i) {
            arr[i] = array[i];
        }
        return arr;
    }
    //main method
    public static void main(String[] args) {
        String[] arr = getStrings();
        System.out.println("\n\nYou entered:");
        for(int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }
}