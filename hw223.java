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
public class hw223 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the distance to drive , the fuel
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        
        // for miles
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        
        // for price 
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        
        // Compute the cost of driving
        double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
        
        // Display the result
        System.out.println("The cost of driving is $" + costOfDriving);
        
        
        
    }
    
}
