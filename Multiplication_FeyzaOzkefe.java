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

public class Multiplication_FeyzaOzkefe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int questionnumber = 10;
        int correctCount=0;
        int count=0;
        long startTime =System.currentTimeMillis();
        String output= " ";
        Scanner input = new Scanner(System.in);
        
        while (count<questionnumber){
            int number1=(int)(Math.random()*10);
            int number2=(int)(Math.random()*10);
            
            if(number1<number2){
                int temp=number1;
                number1=number2;
                number2=temp;
            }
            
            System.out.print("what is " + number1 + "-" + number2 +"?\n");
            int answer = input.nextInt();
            
            if(number1-number2==answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("Your answer wrong!\n" + "Correct answer is " + (number1-number2));
            
            count++;
            
        }
        
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
        System.out.println(correctCount + " correct answer" + "\nTest time is " + testTime/1000 + " seconds");
    }
    
}
