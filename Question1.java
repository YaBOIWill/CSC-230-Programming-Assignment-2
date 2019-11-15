//question 1 for programming assignment 2 
public class Question1 {
    //creates the two matrices as arrays
    Double[][] Amat = { { 3.43, 5.12 }, { 2.12, 9.57 } };
    Double[][] Bmat = { { -0.42, 4.56 }, { 1.1, -2.31 } };

    public static Double[][] multiplicar(Double[][] Amat, Double[][] Bmat) {
        //variables for rows and columns
        int ar = Amat.length;
        int ac = Amat[0].length;
        int br = Bmat.length;
        int bc = Bmat[0].length;

        if (ac != br) {
            throw new IllegalArgumentException("A:Rows: " + ac + " did not match B:Columns " + br + ".");
        }
        //creates c value for position
        Double[][] Cvalue = new Double[ar][bc];
        for (int i = 0; i < ar; i++) {
            for (int j = 0; j < bc; j++) {
                Cvalue[i][j] = 0.0;
            }
        }
        //multiply values for rows and columns
        for (int i = 0; i < ar; i++) { 
            for (int j = 0; j < bc; j++) { 
                for (int k = 0; k < ac; k++) { 
                    Cvalue[i][j] += Amat[i][k] * Bmat[k][j];
                }
            }
        }
        return Cvalue;
    }
    //the main method
    public static void main(String[] args) {
        //creates new value for product
        Question1 matrix = new Question1();
        Double[][] product = multiplicar(matrix.Amat, matrix.Bmat);
        //prints out the product value
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(product[i][j] + " ");
            System.out.println();
        }
    }
}