/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1111;

import java.util.Scanner;

/**
 *
 * @author feyza
 */
public class FQ2_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        double[][] matrix = new double[3][4];
        
        System.out.println("Enter 3 -by- 4 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
          for (int i = 0; i < matrix.length; i++) {
             System.out.println("Sum of " + (i+1) +" row: " + sumRow(matrix,i));    
        }
    }
    
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0.0;
        for (int i = 0; i < m[rowIndex].length; i++) {
     
                 sum = sum + m[rowIndex][i];
                     
        }
        return sum;
        
    }
    
}
