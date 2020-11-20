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

public class ShippingCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight of package in pounds: ");
        double weight = input.nextDouble();
        
        if(weight>0 && weight<=1)
            System.out.println("Shipping costs is $2,5");
        else if(weight>1 && weight<=3)
            System.out.println("Shipping costs is $4,5");
         else if(weight>3 && weight<=10)
            System.out.println("Shipping costs is $7,5");
        else if(weight>10 && weight<=20)
            System.out.println("Shipping costs is $10,5");
        else if(weight>20)
            System.out.println("the package cannot be shipped.");
        
    }
    
}
