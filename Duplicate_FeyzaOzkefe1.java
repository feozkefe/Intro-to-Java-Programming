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

public class Duplicate_FeyzaOzkefe1 {

    /**
     * @param args the command line arguments
     */
 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

		int[] distinctNumbers = new int[10]; 
		int num; 				
		int count = 0;			

		
		System.out.print("Enter ten numbers: ");
                
                
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;	
			}
		}
                
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}

	
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
    }
}
