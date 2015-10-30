/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.view;

import java.util.Scanner;

/**
 *
 * @author chad
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n---------------------------------------------------------------"
            + "\n| Main Menu                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nG - Start new game"
            + "\nC - Continue saved game"
            + "\nH - Get Help"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------------------------------";

    void displayMenu() {
       
        char selection = ' ';
        do{
            System.out.println(MENU); //display the main menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'E'); // an selection is not "Exit"
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
         String menuItem = null; 
         Scanner keyboard = new Scanner(System.in); // keyboard input stream
         
         while(!valid) { // while a valid name has not been retrieved
             
             //promp for the player's name
             System.out.println("Enter the menu item below:");
             
             //get the name from the keyboard and trim off the blanks
             menuItem = keyboard.nextLine(); 
             menuItem = menuItem.trim();
            
             //if the name is invalid (less than two character in length
             if (menuItem.length() <1) {
                 System.out.println("Invalid menu item - the menu item must not be blank");
                 continue; // and repeat again
             }
             break; // out of the (exit) the repetition 
         }
         
         return menuItem; // return the name
    
    }

    private void doAction(char choice) {
        
        switch (choice) {
            case 'G': // start new game
                this.startNewGame();
                break;
            case 'C': // continue saved game
                this.startExistingGame();
                break;
            case 'H': // display get help menu
                this.displayHelpMenu();
                break;
            case 'S': // save current game
                this.saveGame();
                break;
            case 'E': // exit program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
    
}
