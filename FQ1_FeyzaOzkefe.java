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
import java.util.Scanner;

public class FQ1_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the scores between 1 and 10 (enter negative int to stop): ");
        
        int[] numbers = new int[11];
        int number;  
        int count=0;
               
        do
        {
            number = input.nextInt();
            numbers[count] = number;
            count++;
        }
        while (number >= 0);
      
        
        int sum =0;
        for(int i = 0; i < count-1; i++){
            sum = sum + numbers[i];
        }   
        
        int index=count-1;
        
        double average = sum / index;
       
        System.out.println("Average is: " + average);
    
        int aboveOrEqual=0;
        int below=0;
        for (int i = 0; i < index; i++) {
            if (numbers[i] >= average)
                aboveOrEqual++;
            else
                below++;							
	}
        
	System.out.println("Number of scores above or equal to average: " + aboveOrEqual);
	System.out.println("Number of scores below average: " + below);
         
    }
   
}
