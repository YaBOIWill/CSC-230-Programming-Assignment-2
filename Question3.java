//question 3 for programming assignment 2 
public class Question3 {
    //main method
    public static void main(String[] args) {
        //variables
        int num = 2000;
        boolean pn[] = new boolean[num + 1];
        //for loops to find prime numbers
        for (int i = 0; i < num; i++) {
            pn[i] = true;
        }
        for (int j = 2; j * j <= num; j++) {
            if (pn[j] == true) {
                for (int i = j * 2; i <= num; i += j) {
                    pn[i] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            //prints out the prime numbers
            if (pn[i] == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}