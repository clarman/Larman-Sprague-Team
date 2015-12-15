/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import byui.cit260.hogwartsschool.control.ClassroomControl;
import byui.cit260.hogwartsschool.exception.ClassroomControlException;
import hogwartsschool.HogwartsSchool;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author cierasprague
 */
class CauldronsTempView {
    protected final BufferedReader keyboard = HogwartsSchool.getInFile();
    protected final PrintWriter console = HogwartsSchool.getOutFile();
            

    void display() {
       
            this.console.println("\nWhat is the diameter of the cauldron?");
            String input = this.getInput(); 
            
            String diameter = input; 
            
            this.console.println("\nWhat is the depth of the cauldron?");
            input = this.getInput(); // get the user's selection
            String depth = input; 
            
            this.console.println("\n Answer:");
            this.doAction(diameter, depth); // do action 
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
         String input = null; 
         try {
         
         while(!valid) { // while a valid name has not been retrieved
             
             
             //get the menu item from the keyboard and trim off the blanks
             input = this.keyboard.readLine(); 
            
             //if the name is invalid (less than tone character in length
             if (input.length() < 1) {
                 ErrorView.display(this.getClass().getName(),
                 "Invalid- you must enter a number.");
                 continue; // and repeat again
             }
             break; // out of the (exit) the repetition 
         }
         } catch (Exception e) {
             ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
         }
         
         return input; 
    
    }
    private void doAction(String diameter, String depth){ 
        double diameter1;
        diameter1 = Double.parseDouble(diameter);
        double depth1;
        depth1 = Double.parseDouble(depth);
        ClassroomControl calculateCauldronsSize = new ClassroomControl();
        double answer = 0;
        try {
            answer = calculateCauldronsSize.calculateCauldronsSize(diameter1, depth1);
        } catch (ClassroomControlException ex) {
            System.out.println(ex.getMessage());
            
        }
        this.console.println(answer);
    }

    
}
 
