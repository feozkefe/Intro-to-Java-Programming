/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1111;

/**
 *
 * @author feyza
 */
public class Showcode1_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array ={{1,2},{3,4},{5,6}};
       
       for(int i=array.length-1;i>=0;i--){
           for(int j=array[i].length-1;j>=0;j--)
               System.out.print(array[i][j]+ " ");
           System.out.println();
           
       }
       
       
    }
}
