/**
 * This file is designed for CSE 8B WI20 PA3. 
 * It contains few test cases for Part 2 of the assignment 
 * @author  CSE8B WI20 PA Team
 */

/**
 * This class is used to test the functions in Matrix class.
 */
public class MatrixTester {
  
    /** 
     * Main method containing the test cases for the Matrix class
     * @param String[] args - command line arguments that are unused
     * @return void
     */	
    public static void main(String[] args) {
        
        // Testing the constructor
        Matrix m = new Matrix(2,3);
        Matrix l = new Matrix(3,2);
        
        // Testing copy constructor
        Matrix n = new Matrix(m);
        
        // Testing setElement method
        int k = 1;
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 3;j++){
                m.setElement(i,j,k);
                k++;
            }
        }
        
        k = 1;
        for(int i = 0;i < 2;i++){
            for(int j = 0;j < 3;j++){
                n.setElement(i,j,k);
                k++;
            }
        }
        
        k = 1;
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 2;j++){
                l.setElement(i,j,k);
                k++;
            }
        }
        
        System.out.println("Matrix m:");
        System.out.println(m);

        // Testing getter methods
        System.out.println("Number of Columns in Matrix m: " + m.getColumns());
        System.out.println("Number of Rows in Matrix m: " + m.getRows());
        System.out.println("Element at 2nd row and 3rd Column in Matrix m: " + m.getElement(1,2));

        // Testing add method
        System.out.println("Testing Matrix m + Matrix n");
        Matrix sumMatrix = m.add(n);
        System.out.println(sumMatrix);
        System.out.println("Testing Matrix m + Matrix l");
        Matrix sumMatrixInvalid = m.add(l); 
        
        // Testing multiply method
        System.out.println("Testing Matrix n * Matrix l");
        Matrix prodMatrix = n.multiply(l);
        System.out.println(prodMatrix); 
        System.out.println("Testing Matrix m * Matrix n");
        Matrix prodMatrixInvalid = m.multiply(n); 
        
        // Testing transpose method
        Matrix transposed = m.transpose();
        System.out.println("Transpose of Matrix m:");
        System.out.println(transposed); 

    }

}
