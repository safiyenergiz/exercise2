/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hw.pkg2;

import java.util.Scanner;

/**
 *
 * @author safiye
 */
public class hw220 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a balance 
        System.out.print("Enter balance and interest rate: ");
        double balance = input.nextDouble();
        
        // the annual percentage interest rate
        double annualInterestRate = input.nextDouble();
        
        // Calculate the interest 
        double interest = balance * (annualInterestRate / 1200);
        
        // Display result
        System.out.println("The interest is " + interest);
    }
    
}
