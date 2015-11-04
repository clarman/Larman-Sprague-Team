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
class CurrentPointsView {
    
    private final String MENU = "\n"
            + "\n---------------------------------------------------------------"
            + "\n| Current Points                                              |"
            + "\n---------------------------------------------------------------"
            + "\n Gryffindor   *Total house points*                             "
            + "\n Hufflepuff   *Total house points*                             "
            + "\n Ravenclaw    *Total house points*                             "
            + "\n Slytherin    *Total house points*                             "
            + "\n---------------------------------------------------------------"
            + "\nV - View map"
            + "\nP - View current points                                        "
            + "\nM - Move to a new location                                     "
            + "\nE - Explore the area                                           "
            + "\nN - View notes                                                 "
            + "\nT - Take notes                                                 "
            + "\nX - Take exam                                                  "
            + "\nH - Help                                                       "
            + "\nQ - Quit                                                       "
            + "\n---------------------------------------------------------------";

    void displayMenu() {
       
        char selection = ' ';
        do{
            System.out.println(MENU); //display the game menu
            
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
            case 'V': // view map
                this.viewMap();
                break;
            case 'P': // view current points
                this.viewCurrentPoints();
                break;
            case 'M': // move to a new location
                this.moveLocation();
                break;
            case 'E': // explore the area
                this.exploreArea();
                break;
            case 'N': // view notes
                this.viewNotes();
                break;
            case 'T': // take notes
                this.takeNotes();
                break;
            case 'X': // take exam
                this.takeExam();
                break;
            case 'H': // help
                this.displayHelpMenu();
                break;
            case 'Q': // quit program
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
    }
      private void viewMap() {
        System.out.println("\n*** viewMap is called ***");
    }

    private void viewCurrentPoints() {
        CurrentPointsView currentPoints = new CurrentPointsView();
        currentPoints.displayMenu();
    }

    private void moveLocation() {
         System.out.println("\n*** moveLocation is called ***");
    }

    private void exploreArea() {
        System.out.println("\n*** exploreArea is called ***");
    }

    private void viewNotes() {
        System.out.println("\n*** viewNotes is called ***");
    }

    private void takeNotes() {
        System.out.println("\n*** takeNotes is called ***");
    }

    private void takeExam() {
        System.out.println("\n*** takeExam is called ***");
    }

    private void displayHelpMenu() {
       System.out.println("\n*** displayHelpMenu ***");
    }
    
}