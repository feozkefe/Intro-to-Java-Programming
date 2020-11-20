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

public class Payroll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        
        System.out.print("Enter houtly pay rate: ");
        double payRate = input.nextDouble();
        
        System.out.print("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble();
        
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();
        
        double grossPay=payRate*hours;
        double federalWitholding=federalTax*grossPay;
        double stateWitholding=stateTax*grossPay;
        double totalDeduction=federalWitholding+stateWitholding;
        double netPay=grossPay-totalDeduction;
        
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay Rate: " +"$" + payRate);
        System.out.println("Gross Pay: " + "$" +grossPay);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding" + "$" +federalWitholding);
        System.out.println("    State Withholding"+ "$" +stateWitholding);
        System.out.println("    Total Deduction: " + "$" +totalDeduction);
        System.out.println("Net Pay:" + "$" +netPay);
        
        
    }
    
}
