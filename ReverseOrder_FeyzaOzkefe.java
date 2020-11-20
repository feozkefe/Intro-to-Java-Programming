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

public class ReverseOrder_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     
       System.out.print("Enter the number: ");
        int num = input.nextInt();
        
       reverse(num);
    }
    
    public static void reverse(int num){
        
        int reversenum=0;
         while(num !=0){
            reversenum = reversenum * 10;
            reversenum =reversenum+(num%10);
            num=num/10;
        }
             
        System.out.println("reversed number is " + reversenum);
    }
    
}
