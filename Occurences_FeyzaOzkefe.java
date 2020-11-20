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


public class Occurences_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        Scanner in = new Scanner(System.in);

        int[] numbers = new int[100];
        int number;
        int count = 0;
        System.out.print("Enter the integers between 1 and 50 (enter 0 to stop): ");
   
    //Add numbers to array
        do
        {
            number = in.nextInt();
            numbers[count] = number;
            count++;
        }
        while (number != 0);
        
   //Calculate the occurence      
        for (int i=1;i<=100;i++){
            int occurence=0;
            for(int j=0;j<numbers.length-1;j++){
                if(numbers[j]==i)
                    occurence++;
            }
            if(occurence!=0)
                System.out.print(i + " occurs " + occurence + " times\n");
        }
    }

    
}
