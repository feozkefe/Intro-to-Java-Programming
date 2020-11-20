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

public class NumberOfLetters_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       
       System.out.print("Enter the letter: ");
       String str = input.nextLine();
      countLetters(str);
     
    }
    
    public static int countLetters(String str){
        
         int wordCount = 0;
         for (int i = 0; i < str.length(); i++) {
         if (Character.isLetter(str.charAt(i)))
         wordCount++;
         
      }
          System.out.println("Letters: "+wordCount);
          return wordCount;
    }
    
  
}
