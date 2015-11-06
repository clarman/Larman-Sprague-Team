/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.ClassroomControl;
import java.util.Scanner;

/**
 *
 * @author Chadl
 */
class StarTempView {
    
            

    void display() {
       
            System.out.println("\nWhat is the star's magnitude?");
            double input = this.getInput(); 
            
            double magnitude = input; 
            
            System.out.println("\nWhat is the star's distance from Earth?");
            input = this.getInput(); // get the user's selection
            double distance = input; 
            
            this.doAction(magnitude, distance); // do action 
    }

    private double getInput() {
        boolean valid = false; // indicates if the name has been retrieved
         double input = 0; 
         Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
         while(!valid) { // while a valid name has not been retrieved
             
             
             //get the menu item from the keyboard and trim off the blanks
             input = keyboard.nextInt(); 
            
             //if the name is invalid (less than tone character in length
             if (input < 1) {
                 System.out.println("Invalid- you must enter a number.");
                 continue; // and repeat again
             }
             break; // out of the (exit) the repetition 
         }
         
         return input; 
    
    }
    private void doAction(double magnitude, double distance){
        ClassroomControl calculateStarsMagnitude = new ClassroomControl();
        double answer = calculateStarsMagnitude.calculateStarsMagnitude(magnitude, distance);
        System.out.println(answer);
    }
}
