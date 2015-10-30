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
public class HelpMenuView {

    private final String MENU = "\n"
            + "\n---------------------------------------------------------------"
            + "\n| Help Menu                                                   |"
            + "\n---------------------------------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move?"
            + "\nP - How do I get points?"
            + "\nH - What house am I in?"
            + "\nN - What are notes?"
            + "\nQ - Quit"
            + "\n---------------------------------------------------------------";

    void displayMenu() {
       
        char selection = ' ';
        do{
            System.out.println(MENU); //display the help menu
            
            String input = this.getInput(); // get the user's selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection); // do action based on selection
            
        } while (selection != 'Q'); // an selection is not "Quit"
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
            case 'G': // What is the goal of the game?
                this.goalOfGame();
                break;
            case 'M': // How to move?
                this.howToMove();
                break;
            case 'P': // How do I get points?
                this.getPoints();
                break;
            case 'H': // What house am I in?
                this.whatHouse();
                break;
            case 'N': // What are notes?
                this.whatAreNotes();
                break;
            case 'Q': // quit program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }

    private void goalOfGame() {
        System.out.println("\n*** goalOfGame ***");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove ***");
    }

    private void getPoints() {
        System.out.println("\n*** getPoints ***");
    }

    private void whatHouse() {
        System.out.println("\n*** whatHouse ***");
    }

    private void whatAreNotes() {
        System.out.println("\n*** whatAreNotes ***");
    }
    
}
