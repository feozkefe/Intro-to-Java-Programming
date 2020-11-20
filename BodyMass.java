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

public class BodyMass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double height =input.nextDouble();
        
        final double kgperpound=0.45359237;
        final double metersperinc= 0.0254; 
        
        double weightkg=weight*kgperpound;
        double heightm=height*metersperinc;
        double bmi=weightkg/(heightm*heightm);
        
        System.out.println("BMI is " + bmi);
        if(bmi<18.5)
            System.out.println("Underweight");
        else if(bmi<25)
            System.out.println("Normal");
        else if(bmi<30)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
        
                    
    }
    
}
