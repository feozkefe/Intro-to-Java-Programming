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

public class DisplayDistance_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number x1: ");
        int x1 = input.nextInt();
        
        System.out.print("Enter number y1: ");
        int y1 = input.nextInt();
        
        System.out.print("Enter number x2: ");
        int x2 = input.nextInt();
        
        System.out.print("Enter number y2: ");
        int y2 = input.nextInt();
        
        double distance;
        double distanceroot;
        distance= ((x2-x1)*(x2-x1) +(y2-y1)*(y2-y1));
        distanceroot=Math.pow(distance,0.5);
        
        System.out.println( "The distance between points is " + distanceroot);
    }
    
}
