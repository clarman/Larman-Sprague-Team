/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author cierasprague
 */
public class TakeChallenge {

    void displayChallenge() {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your time: ");
      double time = input.nextDouble();
      
      System.out.print("Enter your distance: ");
      double distance = input.nextDouble();
      System.out.println("Your average acceleration is: " +getAcceleration(time, distance));
    }

    private double getAcceleration(double time, double distance) {
        double avgAccel = (distance/time) * time;
        return avgAccel; 
    }
    
}
