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
public class hw25 {
    public static void main(String[] args) {
    
    
    // Create a Scanner object     
    Scanner input = new Scanner(System.in);
    
    
    // Prompt the user to enter a subtotal
    System.out.print("Enter the subtotal: ");
    double subtotal = input.nextDouble();
    
    
    // Prompt the user to enter a gratuity rate
    System.out.print("Enter the gratuity rate: ");
    double gratuityRate  = input.nextDouble();
    
    
        // Compute
        double gratuity = subtotal * gratuityRate;
    
        double total = gratuity + subtotal;
    
    System.out.println("The gratuity is $  " +  gratuity  + "and the total is $ " +   total  + ".");
    
    
    
    
    
    
    
    
    }
            
            
    
}
